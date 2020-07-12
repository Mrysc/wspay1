package com.rltx.wspay.utils.constant;

public class WithdrawConstant {

    public interface VerifyType {
        Integer WITH_DRAW_TYPE = 12;
    }

    public interface VerifyTemplate {
        String WITH_DRAW_TEMPLATE = "template/sms/verifyWithdrawCode.ftl";
    }

    public interface ParamUtilParam {
        String KEY_NAME_URL = "reqUrl";
    }

    public interface WithdrawApplyFlag {
        String WITHDRAWAPPLY_FLAG_FAIL = "0";  //失败
        String WITHDRAWAPPLY_FLAG_ING = "1"; //提现中
        String WITHDRAWAPPLY_FLAG_CONFIRMED = "2"; //提现已经确认
        String WITHDRAWAPPLY_FLAG_SUCCESS = "3"; // 提现成功
    }
    public interface WithdrawFinalResFlag {
        String WITHDRAW_FLAG_FAIL = "0";  //失败
        String WITHDRAW_FLAG_DEALING = "2"; //提现中
        String WITHDRAW_FLAG_SUCCESS = "3"; // 提现成功
    }

    public interface WithdrawApplyResponseKey {
        String WITHDRAW_APPLY_ORDERNO = "OrderNo";
        String WITHDRAW_APPLY_OUTTRADENO = "OutTradeNo";
        String WITHDRAW_APPLY_RESPINFO = "RespInfo";
    }

    public interface WithdrawApplyconfirmResponseKey {
        String WITHDRAW_APPLYCONFIRM_ORDERNO = "OrderNo";
        String WITHDRAW_APPLYCONFIRM_RESPINFO = "RespInfo";
        String WITHDRAW_APPLYCONFIRM_OUTTRADENO = "OutTradeNo";
        String WITHDRAW_APPLYCONFIRM_TOTALAMOUNT = "TotalAmount";
    }

    public interface WithdrawQueryResponseKey {
        String WITHDRAW_QUERY_RESPINFO = "RespInfo";
        String WITHDRAW_QUERY_MERCHANTID = "MerchantId";
        String WITHDRAW_QUERY_OUTTRADENO = "OutTradeNo";
        String WITHDRAW_QUERY_ORDERNO = "OrderNo";
        String WITHDRAW_QUERY_TOTALAMOUNT = "TotalAmount";
        String WITHDRAW_QUERY_CURRENCY = "Currency";
        String WITHDRAW_QUERY_PLATFORMFEE = "PlatformFee";
        String WITHDRAW_QUERY_FEECURRENCY = "FeeCurrency";
        String WITHDRAW_QUERY_STATUS = "Status";
        String WITHDRAW_QUERY_BANKCARDNO = "BankCardNo";
        String WITHDRAW_QUERY_BANKCERTNAME = "BankCertName";
        String WITHDRAW_QUERY_WITHDRAWAPPLYDATE = "WithdrawApplyDate";
        String WITHDRAW_QUERY_WITHDRAWFINISHDATE = "WithdrawFinishDate";
        String WITHDRAW_QUERY_MEMO = "Memo";
    }

}
