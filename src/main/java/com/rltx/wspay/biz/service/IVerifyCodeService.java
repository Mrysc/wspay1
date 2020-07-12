package com.rltx.wspay.biz.service;


import com.rltx.wspay.withdrawal.entity.VerifyResponse;

/**
 * Created by  zl on 2020/4/10 16:51.
 * Description:
 */
public interface IVerifyCodeService {

    VerifyResponse sendVerifyCode(String mobilePhone, Integer verifyType, String templatePath);

    VerifyResponse validateVerifyCode(String mobilePhone, String code, Integer verifyType);
}
