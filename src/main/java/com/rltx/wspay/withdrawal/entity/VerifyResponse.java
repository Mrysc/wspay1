package com.rltx.wspay.withdrawal.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyResponse {
  @ApiModelProperty("手机号")
  private String mobilePhone;
  @ApiModelProperty("通过/未通过")
  @Builder.Default
  private Boolean status = false;
  @ApiModelProperty("提示点啥内容")
  private String detailMsg;

}
