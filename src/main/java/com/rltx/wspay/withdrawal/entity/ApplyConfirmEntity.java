package com.rltx.wspay.withdrawal.entity;

import com.rltx.wspay.utils.constant.ParamUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplyConfirmEntity {

    @Builder.Default
    private String isvOrgId = ParamUtil.getParamInfoByKey("IsvOrgId");

    private String merchantId;

    private String outTradeNo;

    private String orderNo;

    @Builder.Default
    private String platformFee = "0";

    @Builder.Default
    private String feeCurrency = ParamUtil.getParamInfoByKey("Currency");

    private String totalAmount;

    @Builder.Default
    private String currency = ParamUtil.getParamInfoByKey("Currency");
    @Builder.Default
    private String smsCode = "";

    @Builder.Default
    private String memo = "";

}
