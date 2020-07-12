package com.rltx.wspay.account.entity;

import com.rltx.wspay.utils.constant.ParamUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
*入驻
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchEntity {

    @Builder.Default
    private String isvOrgId = ParamUtil.getParamInfoByKey("IsvOrgId");
    private String outTradeNo;
    private String outMerchantId;
    private String merchantId;
    private String merchantType;
    private String merchantName;
    private String dealType;
    private String merchantDetail;
    private String bankCardParam;
    private String authCode;
    private String mcc;
    private String cloudFundsInfo;
    private String bussAuthParam;

}
