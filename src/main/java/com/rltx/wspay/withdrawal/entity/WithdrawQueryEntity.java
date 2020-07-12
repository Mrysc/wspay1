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
public class WithdrawQueryEntity {

    @Builder.Default
    private String isvOrgId = ParamUtil.getParamInfoByKey("IsvOrgId");

    private String merchantId;

    private String outTradeNo;

    private String orderNo;

}
