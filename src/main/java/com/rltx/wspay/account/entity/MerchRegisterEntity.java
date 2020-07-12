package com.rltx.wspay.account.entity;

import com.rltx.wspay.utils.constant.ParamUtil;
import com.rltx.wspay.utils.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户（个人，企业统称商户）入驻记录表
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchRegisterEntity extends BaseEntity {
    @Builder.Default
    private String isvOrgId = ParamUtil.getParamInfoByKey("IsvOrgId");
    private String code;
    private String merchId;
    private String outMerchId;
    private String merchUserCode;
    private String merchName;
    private String type;
    private String merchType;
    private String phone;
    private String name;
    private String cardNo;
    private String cardName;
    private String openingBank;
    private String contactLine;
    private String accountType;
    private String basic;
    private String prepay;
    private String tradeDeposit;
    private String openPay;
    private String registerStatus;
}
