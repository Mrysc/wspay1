package com.rltx.wspay.withdrawal.service;


import com.rltx.common.vo.CommParamsVo;
import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.bindbankcard.entity.DriverBankCardEntity;
import com.rltx.wspay.withdrawal.entity.ApplyConfirmEntity;
import com.rltx.wspay.withdrawal.entity.VerifyResponse;
import com.rltx.wspay.withdrawal.entity.WithdrawQueryEntity;
import com.rltx.wspay.withdrawal.entity.WithdrawResult;

import java.util.TreeMap;

public interface IWithdrawService {
    VerifyResponse sendPayVerifyCode(String mobilePhone);

    WithdrawResult applyConfirm(ApplyConfirmEntity applyConfirmEntity);

    WithdrawResult withdrawApply(CommParamsVo commParamsVo,String phone,String verifyCode, DriverBankCardEntity driverBankCardEntity, String money) throws Exception;

    WithdrawResult withdrawQuery(WithdrawQueryEntity withdrawQuery);
}
