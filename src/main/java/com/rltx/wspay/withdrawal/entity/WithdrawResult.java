package com.rltx.wspay.withdrawal.entity;

import com.rltx.wspay.utils.entity.BaseResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawResult  extends BaseResult {
    @Builder.Default
    private String message = "成功";

    private  Object data;

}
