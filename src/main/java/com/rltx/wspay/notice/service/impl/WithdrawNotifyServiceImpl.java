package com.rltx.wspay.notice.service.impl;

import com.rltx.wspay.commom.DomCreateResponse;
import com.rltx.wspay.commom.XmlSignUtil;
import com.rltx.wspay.commom.XmlToMap;
import com.rltx.wspay.constant.MapEntity;
import com.rltx.wspay.notice.entity.WithdrawNotifyEntity;
import com.rltx.wspay.notice.service.IWithdrawNotifyService;
import com.rltx.wspay.utils.ExceptionUtils;
import com.rltx.wspay.utils.MapChangeKay;
import com.rltx.wspay.utils.constant.ResponseCode;
import com.rltx.wspay.utils.constant.WithdrawConstant;
import com.rltx.wspay.withdrawal.dao.WithdrawDao;
import com.rltx.wspay.withdrawal.entity.WithdrawApplyEntity;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Service
public class WithdrawNotifyServiceImpl implements IWithdrawNotifyService {

    @Autowired
    private WithdrawDao withdrawDao;

    public final String updateBy = "网商异步通知";
    public final String key = "Status";
    public final String succseeRes = "SUCCESS";
    public final String dealingRes = "DEALING";
    public final String type = "body";
    public final String responseKey = "RespInfo";
    Logger logger = LoggerFactory.getLogger(WithdrawNotifyServiceImpl.class);

    @Override
    @Transactional
    public String notify(String data) throws Exception {
        TreeMap<String,String> map= XmlToMap.DocumentMap(data);
        if (StringUtils.isEmpty(data)) {
            logger.error("请求参数为空……");
        } else {
            boolean result = false;
            try {
                result = XmlSignUtil.verify(data);
            } catch (Exception e) {
                logger.error("解析参数失败……");
            }
            if (result) {
                logger.info("验签成功，开始业务逻辑……");
                TreeMap<String, Object> mapBody = XmlToMap.DocumentMapType(data, type);
                Map<String, Object> map1 = MapChangeKay.transformUpperCase(mapBody);
                WithdrawNotifyEntity withdrawNotifyEntity = (WithdrawNotifyEntity) MapEntity.map2Object(map1, WithdrawNotifyEntity.class);
                WithdrawApplyEntity withdrawApplyEntity = withdrawDao.select(withdrawNotifyEntity.getOutTradeNo());
                withdrawApplyEntity.setBankCardNo(withdrawNotifyEntity.getBankCardNo());
                withdrawApplyEntity.setBankCertName(withdrawNotifyEntity.getBankCertName());
                withdrawApplyEntity.setWithdrawApplyDate(withdrawNotifyEntity.getWithdrawApplyDate());
                withdrawApplyEntity.setWithdrawFinishDate(withdrawNotifyEntity.getWithdrawFinishDate());
                withdrawApplyEntity.setErrorDesc(withdrawNotifyEntity.getErrorDesc());
                withdrawApplyEntity.setUpdateBy(updateBy);
                if (mapBody.containsKey(key) && succseeRes.equals(mapBody.get(key))) {
                    withdrawApplyEntity.setFlag(WithdrawConstant.WithdrawFinalResFlag.WITHDRAW_FLAG_SUCCESS);
                } else if (mapBody.containsKey(key) && dealingRes.equals(mapBody.get(key))) {
                    withdrawApplyEntity.setFlag(WithdrawConstant.WithdrawFinalResFlag.WITHDRAW_FLAG_DEALING);
                } else {
                    withdrawApplyEntity.setFlag(WithdrawConstant.WithdrawFinalResFlag.WITHDRAW_FLAG_FAIL);
                }
                withdrawDao.updateNotify(withdrawApplyEntity);
            } else {
                logger.error("验签失败");
            }
        }
        String response = DomCreateResponse.requestcreateXml(map);
        //开始对响应回执进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(response);
        if(responseVerify){
            logger.info("自签自验成功……发货！");
        }
        return response;
    }


}