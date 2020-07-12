package com.rltx.wspay.withdrawal.controller;

import com.rltx.common.base.BaseContext;
import com.rltx.common.vo.CommParamsVo;
import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.bindbankcard.entity.DriverBankCardEntity;
import com.rltx.wspay.bindbankcard.entity.DriverBankCardRelationEntity;
import com.rltx.wspay.biz.service.IVerifyCodeService;
import com.rltx.wspay.utils.constant.WithdrawConstant;
import com.rltx.wspay.withdrawal.entity.ApplyConfirmEntity;
import com.rltx.wspay.withdrawal.entity.VerifyResponse;
import com.rltx.wspay.withdrawal.entity.WithdrawQueryEntity;
import com.rltx.wspay.withdrawal.entity.WithdrawResult;
import com.rltx.wspay.withdrawal.service.IWithdrawService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@RestController
@RequestMapping("withdraw")
public class WithdrawController extends BaseContext {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private IWithdrawService withdrawService;

    /**
     * 提现发送验证码
     *
     * @param mobilePhone 需要发送短信的手机号
     * @return
     */
    @PostMapping({"/send/verifyCode"})
    public VerifyResponse sendPayVerifyCode(@RequestParam(value = "mobilePhone") String mobilePhone) {
        return withdrawService.sendPayVerifyCode(mobilePhone);
    }

    /**
     * 商户单笔提现申请接口
     *
     * @param    phone  手机号phone 必须传递过来！！！！ 商户号merchId能传则传 不能就用登录人code去库里查找
     * @return
     * @throws Exception
     */
    @PostMapping("withdrawApply")
    public WithdrawResult withdrawApply(String  phone,String verifyCode, DriverBankCardEntity driverBankCardEntity,String money) throws Exception {
//        CommParamsVo commParamsVo = super.getCommParamsVo();
        CommParamsVo commParamsVo = new CommParamsVo();
        return withdrawService.withdrawApply(commParamsVo,phone,verifyCode, driverBankCardEntity, money);
    }

    /**商户单笔提现确认接口
     * MerchantId   OutTradeNo  OrderNo  TotalAmount
     * @param applyConfirmEntity
     * @return
     * @throws Exception
     */
    @PostMapping("applyConfirm")
    public  WithdrawResult  applyConfirm(ApplyConfirmEntity applyConfirmEntity) {
        return withdrawService.applyConfirm(applyConfirmEntity);
    }

    //单笔提现查询接口
    @PostMapping("withdrawQuery")
    public WithdrawResult withdrawQuery(WithdrawQueryEntity withdrawQuery) throws Exception {
        return withdrawService.withdrawQuery(withdrawQuery);
    }

}
