package com.rltx.wspay.biz.entity;

import lombok.Data;

import java.util.Date;

@Data
public class WaybillPaybillBaseInfoEntity {
  private Long id;
  private String code;
  private String paybillNo;
  private String waybillCode;
  private String chargeItemCode;
  private String chargeItemName;
  private Integer waybillType;
  private String waybillNo;
  private Date settleTime;
  private String brokerBillNo;
  private Double chargeItemNumber;
  private String chargeItemNumberUnitCode;
  private Double chargeItemPrice;
  private String chargeItemPriceUnitCode;
  private String paybillType;
  private String paybillApproveStatus;
  private String paybillApproveDescription;
  private Date paybillApproveTime;
  private String platformPaybillApproveUserCode;
  private String paybillApproveUserCode;
  private String paybillApproveUserFullname;
  private String transactioSerialCode;
  private String transactioSerialNo;
  private String paybillPayStatus;
  private String paybillPayChannel;
  private String paybillFreezeStatus;
  private String paybillPayType;
  private Date paybillPayTime;
  private String platformPaybillPayUserCode;
  private String paybillPayUserCode;
  private String paybillPayUserFullname;
  private String platformPayerCode;
  private String payerCode;
  private String payerName;
  private Integer payeeType;
  private String platformPayeeCode;
  private String payeeCode;
  private String payeeName;
  private String platformDriverCode; //主驾司机code
  private String driverName; //主驾司机name
  private String paymentSubjectType;
  private String paymentSubjectName;
  private Double paymentAmount;
  private String payeePhone;
  private String payeeBankName;
  private String payeeBankAccountName;
  private String payeeBankVirtualNo;//收款方银行虚拟账户
  private String payeeBankAccountNo;
  private String payeeBankAccountDescription;
  private String customData;
  private String paybillTag;
  private String offlineReconciliationStatus;
  private String description;
  private String remark;
  private Boolean disabled;
  private Boolean deleted;
  private String moduleCode;
  private String creatorUserCode;
  private String creatorUsername;
  private Date createTime;
  private String updateUserCode;
  private String updateUsername;
  private Date updateTime;
  private String ip;
  private Double operatorLongitude;
  private Double operatorLatitude;
  private String ownerUserCode;
  private String ownerOrgCode;
  private String ownerOrgName;
  private String synchronousId;
  private String branchOrgCode;
  private String branchOrgName;
}
