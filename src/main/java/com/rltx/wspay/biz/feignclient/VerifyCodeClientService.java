package com.rltx.wspay.biz.feignclient;

import com.rltx.wspay.withdrawal.entity.VerifyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by  zl on 2020/4/10 13:42.
 * Description:
 */

@FeignClient("rltx-server-enterprise-lightweight-biz")
public interface VerifyCodeClientService {
    //发送验证码
    @PostMapping({"/verifycode/send/verify_code"})
    String getVerifyCode(@RequestParam("mobilePhone") String mobilePhone, @RequestParam("verifyType") Integer verifyType, @RequestParam("timeOutTime") Long timeOutTime);



    //验证验证码
    @PostMapping({"/verifycode/validate"})
    VerifyResponse validateVerifyCode(@RequestParam("mobilePhone") String mobilePhone, @RequestParam("verificationCode") String verificationCode,
                                      @RequestParam("verifyType") Integer verifyType);

    @PostMapping({"/verifycode/update/verify_code"})
    void updateVerifyCode(@RequestParam("phone") String phone, @RequestParam("verifyCode") String verifyCode,
                          @RequestParam("verifyType") Integer verifyType);
}
