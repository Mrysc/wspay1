package com.rltx.wspay.pay.service.impl;

import com.rltx.framework.log.support.BusinessException;
import com.rltx.wspay.account.dao.MerchRegisterDao;
import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.commom.*;
import com.rltx.wspay.constant.Constant;
import com.rltx.wspay.pay.dao.OrderShareRecordDao;
import com.rltx.wspay.pay.dao.WaybillBaseInfoDao;
import com.rltx.wspay.pay.dao.WaybillPaybillBaseInfoDao;
import com.rltx.wspay.pay.entity.*;
import com.rltx.wspay.pay.service.IShareService;
import com.rltx.wspay.utils.TradeNoUtils;
import com.rltx.wspay.utils.constant.ParamUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeMap;
import java.util.UUID;

@Service
public class ShareServiceImpl implements IShareService {

    @Autowired
    private WaybillBaseInfoDao waybillBaseInfoDao;
    @Autowired
    private MerchRegisterDao merchRegisterDao;
    @Autowired
    private OrderShareRecordDao orderShareRecordDao;
    @Autowired
    private WaybillPaybillBaseInfoDao waybillPaybillBaseInfoDao;

    @Override
    public TreeMap<String, Object> orderShare(String waybillNo) throws Exception {
        String function = Constant.function.orderShare;
        WaybillBaseInfoEntity waybillBaseInfoEntity = waybillBaseInfoDao.selectByNo(waybillNo);
        MerchRegisterEntity merchRegister = new MerchRegisterEntity();
        if(!"pass".equals(waybillBaseInfoEntity.getSettleStatus())){
            throw new BusinessException("运单未结算");
        }

        OrderShareResult orderShare = new OrderShareResult();
        orderShare.setIsvOrgId(ParamUtil.getParamInfoByKey("IsvOrgId"));
        if(StringUtils.isNotEmpty(waybillBaseInfoEntity.getBranchOrgCode())){
            merchRegister = merchRegisterDao.selectByMerchUserCode(waybillBaseInfoEntity.getBranchOrgCode());
            orderShare.setMerchantId(merchRegister.getMerchId());
        }else {
            merchRegister = merchRegisterDao.selectByMerchUserCode(waybillBaseInfoEntity.getConsignOrgCode());
            orderShare.setMerchantId(merchRegister.getMerchId());
        }
        FundDetailsResult fundDetails = fundDetailsResult(waybillBaseInfoEntity,merchRegister.getMerchId());
        orderShare.setRelateOrderNo("202007670703066160");
        orderShare.setOutTradeNo(TradeNoUtils.getTradeNo32());
        orderShare.setTotalAmount(String.valueOf(AmountUtils.changeY2F(waybillBaseInfoEntity.getSettleClientOrgPayee())));
        orderShare.setCurrency("CNY");
        orderShare.setPayeeFundDetails(fundDetails.genJsonBase64());
        TreeMap<String, String> form = MapTrunPojo.object2Map(orderShare);
        String param = DomCreateRequest.createRequestXml(function, XmlVersion.defaultVersion,form);
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(param);
        OrderShareEntity orderShareEntity = insertOrderShare(fundDetails,orderShare,merchRegister,param);
        String response = HttpMain.httpsReq(ParamUtil.getParamInfoByKey("reqUrl"), param);
        TreeMap<String, String> mapBody= XmlToMap.DocumentMapBody(response);
        TreeMap<String, Object> mapRespInfo= XmlToMap.DocumentMapType(response,"RespInfo");
        if(mapRespInfo.containsKey("ResultStatus")&&"S".equals(mapRespInfo.get("ResultStatus"))){
            orderShareEntity.setResponseData(response);
            orderShareEntity.setShareOrderNo(mapBody.get("ShareOrderNo"));
            orderShareRecordDao.update(orderShareEntity);
        }
        mapRespInfo.putAll(mapBody);
        return mapRespInfo;
    }


    private OrderShareEntity insertOrderShare(FundDetailsResult fundDetails,OrderShareResult orderShare,MerchRegisterEntity merchRegister,String param){
        OrderShareEntity orderShareEntity = new OrderShareEntity();
        orderShareEntity.setMerchId(orderShare.getMerchantId());
        orderShareEntity.setRelateOrderNo(orderShare.getRelateOrderNo());
        orderShareEntity.setOutTradeNo(orderShare.getOutTradeNo());
        orderShareEntity.setMerchUserCode(merchRegister.getMerchUserCode());
        orderShareEntity.setMerchName(merchRegister.getMerchName());
        orderShareEntity.setType(merchRegister.getType());
        orderShareEntity.setTotalAmount(orderShare.getTotalAmount());
        orderShareEntity.setPayeeFundDetails(orderShare.getPayeeFundDetails());
        orderShareEntity.setAmount(fundDetails.getAmount());
        orderShareEntity.setParticipantId(fundDetails.getParticipantId());
        orderShareEntity.setParticipantType(fundDetails.getParticipantType());
        orderShareEntity.setPurpose(fundDetails.getPurpose());
        orderShareEntity.setRequestData(param);
        orderShareEntity.preInsert();
        orderShareRecordDao.insert(orderShareEntity);
        return orderShareEntity;
    }

    private FundDetailsResult fundDetailsResult(WaybillBaseInfoEntity waybillBaseInfoEntity,String merchId){
        FundDetailsResult fundDetails = new FundDetailsResult();
        fundDetails.setAmount(String.valueOf(AmountUtils.changeY2F(waybillBaseInfoEntity.getSettleTradingConfigAmount())));
        fundDetails.setCurrency("CNY");
        fundDetails.setParticipantId(merchId);
        fundDetails.setParticipantType("MERCHANT");

//        fundDetails.setParticipantId(ParamUtil.getParamInfoByKey("IsvOrgId"));
//        fundDetails.setParticipantType("PLATFORM");
        fundDetails.setPurpose("FEE");
        return fundDetails;
    }

    @Override
    public TreeMap<String, Object> orderShareDriver(String paybillNo,String merchId) throws Exception {
        String function = Constant.function.orderShare;
        WaybillPaybillBaseInfoEntity paybillBaseInfoEntity =  waybillPaybillBaseInfoDao.getByPaybillNo(paybillNo);
        MerchRegisterEntity merchRegister = merchRegisterDao.selectByMerchId(merchId);
        OrderShareResult orderShare = new OrderShareResult();
        orderShare.setIsvOrgId(ParamUtil.getParamInfoByKey("IsvOrgId"));
        orderShare.setRelateOrderNo("202007670703066160");
        orderShare.setOutTradeNo(UUID.randomUUID().toString().replaceAll("-",""));
        orderShare.setTotalAmount(String.valueOf(AmountUtils.changeY2F(paybillBaseInfoEntity.getPaymentAmount())));
        orderShare.setTotalAmount("899788");
        orderShare.setCurrency("CNY");
        orderShare.setMerchantId(merchId);
        TreeMap<String, String> form = MapTrunPojo.object2Map(orderShare);
        String param = DomCreateRequest.createRequestXml(function, XmlVersion.defaultVersion,form);
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(param);
        OrderShareEntity orderShareEntity = insertOrderShareDriver(orderShare,merchRegister,param);
        String response = HttpMain.httpsReq(ParamUtil.getParamInfoByKey("reqUrl"), param);
        TreeMap<String, String> mapBody= XmlToMap.DocumentMapBody(response);
        TreeMap<String, Object> mapRespInfo= XmlToMap.DocumentMapType(response,"RespInfo");
        if(mapRespInfo.containsKey("ResultStatus")&&"S".equals(mapRespInfo.get("ResultStatus"))){
            orderShareEntity.setShareOrderNo(mapBody.get("ShareOrderNo"));
            orderShareRecordDao.update(orderShareEntity);
        }
        mapRespInfo.putAll(mapBody);
        return mapRespInfo;
    }

    private OrderShareEntity insertOrderShareDriver(OrderShareResult orderShare,MerchRegisterEntity merchRegister,String param){
        OrderShareEntity orderShareEntity = new OrderShareEntity();
        orderShareEntity.setMerchId(orderShare.getMerchantId());
        orderShareEntity.setRelateOrderNo(orderShare.getRelateOrderNo());
        orderShareEntity.setOutTradeNo(orderShare.getOutTradeNo());
        orderShareEntity.setMerchUserCode(merchRegister.getMerchUserCode());
        orderShareEntity.setMerchName(merchRegister.getMerchName());
        orderShareEntity.setType(merchRegister.getType());
        orderShareEntity.setTotalAmount(orderShare.getTotalAmount());
        orderShareEntity.setPayeeFundDetails(orderShare.getPayeeFundDetails());
        orderShareEntity.setRequestData(param);
        orderShareEntity.preInsert();
        orderShareRecordDao.insert(orderShareEntity);
        return orderShareEntity;
    }


    @Override
    public String refundShare() throws Exception {
        String function = Constant.function.refundShare;
        RefundShareEntity refundShare = new RefundShareEntity(
                HttpMain.IsvOrgId,HttpMain.merchantId,"","","",HttpMain.Currency,"过期了"
        );
        TreeMap<String, String> form = MapTrunPojo.object2Map(refundShare);
        String param = DomCreateRequest.createRequestXml(function, XmlVersion.defaultVersion,form);
        //打印请求报文
        System.out.println(param);
        //开始对请求报文进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(param);
        //自签自验结果
        System.out.println("验签结果：" +responseVerify);
        String response = HttpMain.httpsReq(ParamUtil.getParamInfoByKey("reqUrl"), param);
        System.out.println(response);
        return response;
    }

    @Override
    public String refundShareQuery() throws Exception {

        String function = Constant.function.refundShareQuery;

        RefundShareQueryEntity refundShareQuery = new RefundShareQueryEntity(
                HttpMain.IsvOrgId,HttpMain.merchantId,"","",""
        );

        TreeMap<String, String> form = MapTrunPojo.object2Map(refundShareQuery);


        String param = DomCreateRequest.createRequestXml(function, XmlVersion.defaultVersion,form);


        //打印请求报文
        System.out.println(param);

        //开始对请求报文进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(param);

        //自签自验结果
        System.out.println("验签结果：" +responseVerify);

        String response = HttpMain.httpsReq(ParamUtil.getParamInfoByKey("reqUrl"), param);

        System.out.println(response);

        return response;
    }

    @Override
    public TreeMap<String, Object> shareQuery(String outTradeNo) throws Exception {
        String function = Constant.function.shareQuery;
        OrderShareEntity orderShareEntity = orderShareRecordDao.selectByOutTradeNo(outTradeNo);
        ShareQueryEntity shareQuery = new ShareQueryEntity();
        shareQuery.setIsvOrgId(ParamUtil.getParamInfoByKey("IsvOrgId"));
        shareQuery.setMerchantId(orderShareEntity.getMerchId());
        shareQuery.setRelateOrderNo(orderShareEntity.getRelateOrderNo());
        shareQuery.setOutTradeNo(orderShareEntity.getOutTradeNo());
        shareQuery.setShareOrderNo(orderShareEntity.getShareOrderNo());
        TreeMap<String, String> form = MapTrunPojo.object2Map(shareQuery);
        String param = DomCreateRequest.createRequestXml(function, XmlVersion.defaultVersion,form);
        //开始对请求报文进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(param);
        String response = HttpMain.httpsReq(ParamUtil.getParamInfoByKey("reqUrl"), param);
        TreeMap<String, String> mapBody= XmlToMap.DocumentMapBody(response);
        TreeMap<String, Object> mapRespInfo= XmlToMap.DocumentMapType(response,"RespInfo");
        mapRespInfo.putAll(mapBody);
        return mapRespInfo;
    }
}
