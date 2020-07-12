package com.rltx.wspay.biz.service.impl;

import com.rltx.common.service.IMessageService;
import com.rltx.framework.log.support.BusinessException;
import com.rltx.wspay.biz.feignclient.VerifyCodeClientService;
import com.rltx.wspay.biz.service.IVerifyCodeService;
import com.rltx.wspay.withdrawal.entity.VerifyResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by  zl on 2020/4/10 16:52.
 * Description:
 */
@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {
    @Autowired
    private VerifyCodeClientService verifyCodeClientService;
    @Resource
    private IMessageService messageService;

    @Override
    public VerifyResponse sendVerifyCode(String phone, Integer verifyType, String templatePath) {

        VerifyResponse verify = new VerifyResponse();
        try {
            if (StringUtils.isNotBlank(phone) && verifyType != null && !StringUtils.isEmpty(templatePath)) {
                String verifyCode = verifyCodeClientService.getVerifyCode(phone, verifyType, 20000L);
                Map<String, Object> params = new HashMap(1);
                params.put("token", verifyCode);
                messageService.sendSMS(phone, templatePath, params);
            } else {
                throw new BusinessException("参数错误");
            }

        } catch (Exception e) {
            verify.setStatus(false);
            e.printStackTrace();
            throw new BusinessException("发送失败:" + e.getMessage());
        }

        verify.setStatus(true);
        return verify;
    }

    @Override
    public VerifyResponse validateVerifyCode(String mobilePhone, String code, Integer verifyType) {
        return verifyCodeClientService.validateVerifyCode(mobilePhone, code, verifyType);
    }
}
