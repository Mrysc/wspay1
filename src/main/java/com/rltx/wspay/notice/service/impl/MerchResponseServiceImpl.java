package com.rltx.wspay.notice.service.impl;

import com.rltx.common.service.IGenerationCodingService;
import com.rltx.wspay.account.dao.MerchConsignorMoneyDao;
import com.rltx.wspay.account.dao.MerchRegisterDao;
import com.rltx.wspay.account.dao.MerchRegisterRecordDao;
import com.rltx.wspay.account.entity.*;
import com.rltx.wspay.commom.*;
import com.rltx.wspay.constant.*;
import com.rltx.wspay.notice.entity.MerchResponseEntity;
import com.rltx.wspay.notice.service.IMerchResponseService;
import com.rltx.wspay.utils.MapChangeKay;
import com.rltx.wspay.utils.constant.ParamUtil;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class MerchResponseServiceImpl implements IMerchResponseService {

    @Autowired
    private MerchRegisterRecordDao merchRegisterRecordDao;
    @Autowired
    private MerchRegisterDao merchRegisterDao;
    @Resource(name="generationCodingService")
    private IGenerationCodingService generationCodingService;
    @Autowired
    private MerchConsignorMoneyDao consignorMoneyDao;

    @Override
    public String registerResult(String data) throws Exception {
        //对来自网商得报文做签名验证
        boolean result =  XmlSignUtil.verify(data);
        TreeMap<String,String> map= XmlToMap.DocumentMap(data);
        TreeMap<String,Object> mapBody= XmlToMap.DocumentMapType(data,"body");
        Map<String, Object> map1=  MapChangeKay.transformUpperCase(mapBody);
        MerchResponseEntity merchResponseEntity = (MerchResponseEntity) MapEntity.map2Object(map1, MerchResponseEntity.class);
        MerchRegisterRecordEntity merchRegisterRecordEntity = merchRegisterRecordDao.selectByOutTradeNo(merchResponseEntity.getOutTradeNo());
        MerchRegisterEntity merchRegister = merchRegisterDao.selectByMerchUserCode(merchRegisterRecordEntity.getMerchUserCode());
        if(StringUtils.isEmpty(merchRegister.getMerchId())){
            merchRegister.setMerchId(merchResponseEntity.getMerchantId());
            merchRegister.setRegisterStatus(merchResponseEntity.getRegisterStatus());
            merchRegisterDao.updateMerchId(merchRegister);
            MerchConsignorMoneyEntity consignorMoneyEntity = new MerchConsignorMoneyEntity();
            consignorMoneyEntity.setMerchId(merchResponseEntity.getMerchantId());
            consignorMoneyEntity.setMerchName(merchRegister.getMerchName());
            consignorMoneyEntity.setMerchUserCode(merchRegister.getMerchUserCode());
            consignorMoneyEntity.setMoney(0.0);
            consignorMoneyEntity.preInsert();
            consignorMoneyDao.insert(consignorMoneyEntity);
        }
        //响应回执生成(报文组装步骤)
        String response = DomCreateResponse.requestcreateXml(map);
        //开始对响应回执进行签名验证(自签自验环节)
        boolean responseVerify =  XmlSignUtil.verifyFromYourSelf(response);
        return response;
    }
}
