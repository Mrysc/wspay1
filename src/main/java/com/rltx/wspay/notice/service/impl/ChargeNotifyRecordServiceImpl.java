package com.rltx.wspay.notice.service.impl;

import com.rltx.wspay.account.dao.MerchConsignorMoneyDao;
import com.rltx.wspay.account.dao.MerchRegisterDao;
import com.rltx.wspay.account.entity.MerchConsignorMoneyEntity;
import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.account.service.IMerchConsignorMoneyService;
import com.rltx.wspay.commom.DomCreateResponse;
import com.rltx.wspay.commom.XmlSignUtil;
import com.rltx.wspay.commom.XmlToMap;
import com.rltx.wspay.constant.MapEntity;
import com.rltx.wspay.notice.dao.ChargeNotifyRecordDao;
import com.rltx.wspay.notice.entity.ChargeNotifyRecordEntity;
import com.rltx.wspay.notice.service.IChargeNotifyRecordService;
import com.rltx.wspay.pay.entity.PaymertRecordEntity;
import com.rltx.wspay.pay.service.IPayService;
import com.rltx.wspay.utils.MapChangeKay;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ChargeNotifyRecordServiceImpl implements IChargeNotifyRecordService {

    @Autowired
    private IPayService payService;
    @Autowired
    private MerchRegisterDao merchRegisterDao;
    @Autowired
    private ChargeNotifyRecordDao chargeNotifyRecordDao;
    @Autowired
    private IMerchConsignorMoneyService consignorMoneyService;
    @Autowired
    private MerchConsignorMoneyDao merchConsignorMoneyDao;

    @Override
    public String notify(String data) throws Exception {
        boolean result =  XmlSignUtil.verify(data);
        TreeMap<String,String> map = XmlToMap.DocumentMap(data);
        TreeMap<String,Object> mapBody= XmlToMap.DocumentMapType(data,"body");
        Map<String, Object> map1=  MapChangeKay.transformUpperCase(mapBody);
        ChargeNotifyRecordEntity chargeNotifyRecordEntity = (ChargeNotifyRecordEntity) MapEntity.map2Object(map1, ChargeNotifyRecordEntity.class);
        MerchRegisterEntity merchRegisterEntity = merchRegisterDao.selectByMerchId(chargeNotifyRecordEntity.getMerchantId());
        if(!ObjectUtils.isEmpty(merchRegisterEntity)){
            chargeNotifyRecordEntity.setMerchUserCode(merchRegisterEntity.getMerchUserCode());
            chargeNotifyRecordEntity.setMerchName(merchRegisterEntity.getMerchName());
        }
        chargeNotifyRecordEntity.setCreateBy("网商异步通知");
        chargeNotifyRecordEntity.setCreateTime(new Date());
        chargeNotifyRecordEntity.setUpdateBy("网商异步通知");
        chargeNotifyRecordEntity.setUpdateTime(new Date());
        chargeNotifyRecordDao.insert(chargeNotifyRecordEntity);
        transfer(chargeNotifyRecordEntity);
        //响应回执生成(报文组装步骤)
        String response = DomCreateResponse.requestcreateXml(map);
        //开始对响应回执进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(response);
        return response;
    }


    public void transfer(ChargeNotifyRecordEntity chargeNotifyRecordEntity){
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {
            @SneakyThrows
            @Override
            public void run(){

                String merchId = chargeNotifyRecordEntity.getMerchantId();
                String money = chargeNotifyRecordEntity.getTotalAmount();
                consignorMoneyService.update(merchId,money);
                TreeMap<String, Object> map = payService.balancePay(chargeNotifyRecordEntity.getMerchUserCode(),chargeNotifyRecordEntity.getMerchUserCode(),chargeNotifyRecordEntity.getTotalAmount());
                payService.payConfirm(map.get("code").toString());
            }
        });
        executor.shutdown();
        System.out.println("111");
    }

}