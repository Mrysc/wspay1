package com.rltx.wspay.biz.entity;

import java.util.Date;

public class WaybillAccountingChargeRecordEntity {
  private Long id;
  private String code;
  private String businessCode;
  private String actionRecordCode;
  private String actionCode;
  private String chargeToTruckCode;
  private String chargeItemCode;
  private String chargeItemName;
  private String chargeItemNumberResource;
  private String chargeItemNumberExpression;
  private Double chargeItemNumber;
  private String chargeItemNumberUnitCode;
  private String chargeItemNumberUnitName;
  private Double chargeItemPrice;
  private String chargeItemPriceResource;
  private String chargeItemPriceExpression;
  private String chargeItemPriceUnitCode;
  private String chargeItemPriceUnitName;
  private Double chargeAmounts;
  private String chargeItemAmountsResource;
  private String chargeItemAmountsExpression;
  private String chargeAmountsUnitCode;
  private String chargeAmountsUnitName;
  private Integer chargeItemAmountsPrecision;
  private String chargeItemAmountsRule;
  private String paymentChannel;
  private String paymentApproveType;
  private String chargeItemPaybillCode;
  private String chargeItemPaybillNo;
  private String chargeItemPaybillStatus;
  private String chargeItemPaybillPayChannel;
  private String attachmentList;
  private Integer seqNo;
  private String customData;
  private String usageDesc;
  private String executeUserCode;
  private String executeUserFullName;
  private String executeOrgCode;
  private String executeOrgName;
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
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Long getId() {
    return this.id;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getCode() {
    return this.code;
  }
  
  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }
  
  public String getBusinessCode() {
    return this.businessCode;
  }
  
  public void setActionRecordCode(String actionRecordCode) {
    this.actionRecordCode = actionRecordCode;
  }
  
  public String getActionRecordCode() {
    return this.actionRecordCode;
  }
  
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }
  
  public String getActionCode() {
    return this.actionCode;
  }
  
  public void setChargeToTruckCode(String chargeToTruckCode) {
    this.chargeToTruckCode = chargeToTruckCode;
  }
  
  public String getChargeToTruckCode() {
    return this.chargeToTruckCode;
  }
  
  public void setChargeItemCode(String chargeItemCode) {
    this.chargeItemCode = chargeItemCode;
  }
  
  public String getChargeItemCode() {
    return this.chargeItemCode;
  }
  
  public void setChargeItemName(String chargeItemName) {
    this.chargeItemName = chargeItemName;
  }
  
  public String getChargeItemName() {
    return this.chargeItemName;
  }
  
  public void setChargeItemNumberResource(String chargeItemNumberResource) {
    this.chargeItemNumberResource = chargeItemNumberResource;
  }
  
  public String getChargeItemNumberResource() {
    return this.chargeItemNumberResource;
  }
  
  public void setChargeItemNumberExpression(String chargeItemNumberExpression) {
    this.chargeItemNumberExpression = chargeItemNumberExpression;
  }
  
  public String getChargeItemNumberExpression() {
    return this.chargeItemNumberExpression;
  }
  
  public void setChargeItemNumber(Double chargeItemNumber) {
    this.chargeItemNumber = chargeItemNumber;
  }
  
  public Double getChargeItemNumber() {
    return this.chargeItemNumber;
  }
  
  public void setChargeItemNumberUnitCode(String chargeItemNumberUnitCode) {
    this.chargeItemNumberUnitCode = chargeItemNumberUnitCode;
  }
  
  public String getChargeItemNumberUnitCode() {
    return this.chargeItemNumberUnitCode;
  }
  
  public void setChargeItemNumberUnitName(String chargeItemNumberUnitName) {
    this.chargeItemNumberUnitName = chargeItemNumberUnitName;
  }
  
  public String getChargeItemNumberUnitName() {
    return this.chargeItemNumberUnitName;
  }
  
  public void setChargeItemPrice(Double chargeItemPrice) {
    this.chargeItemPrice = chargeItemPrice;
  }
  
  public Double getChargeItemPrice() {
    return this.chargeItemPrice;
  }
  
  public void setChargeItemPriceResource(String chargeItemPriceResource) {
    this.chargeItemPriceResource = chargeItemPriceResource;
  }
  
  public String getChargeItemPriceResource() {
    return this.chargeItemPriceResource;
  }
  
  public void setChargeItemPriceExpression(String chargeItemPriceExpression) {
    this.chargeItemPriceExpression = chargeItemPriceExpression;
  }
  
  public String getChargeItemPriceExpression() {
    return this.chargeItemPriceExpression;
  }
  
  public void setChargeItemPriceUnitCode(String chargeItemPriceUnitCode) {
    this.chargeItemPriceUnitCode = chargeItemPriceUnitCode;
  }
  
  public String getChargeItemPriceUnitCode() {
    return this.chargeItemPriceUnitCode;
  }
  
  public void setChargeItemPriceUnitName(String chargeItemPriceUnitName) {
    this.chargeItemPriceUnitName = chargeItemPriceUnitName;
  }
  
  public String getChargeItemPriceUnitName() {
    return this.chargeItemPriceUnitName;
  }
  
  public void setChargeAmounts(Double chargeAmounts) {
    this.chargeAmounts = chargeAmounts;
  }
  
  public Double getChargeAmounts() {
    return this.chargeAmounts;
  }
  
  public void setChargeItemAmountsResource(String chargeItemAmountsResource) {
    this.chargeItemAmountsResource = chargeItemAmountsResource;
  }
  
  public String getChargeItemAmountsResource() {
    return this.chargeItemAmountsResource;
  }
  
  public void setChargeItemAmountsExpression(String chargeItemAmountsExpression) {
    this.chargeItemAmountsExpression = chargeItemAmountsExpression;
  }
  
  public String getChargeItemAmountsExpression() {
    return this.chargeItemAmountsExpression;
  }
  
  public void setChargeAmountsUnitCode(String chargeAmountsUnitCode) {
    this.chargeAmountsUnitCode = chargeAmountsUnitCode;
  }
  
  public String getChargeAmountsUnitCode() {
    return this.chargeAmountsUnitCode;
  }
  
  public void setChargeAmountsUnitName(String chargeAmountsUnitName) {
    this.chargeAmountsUnitName = chargeAmountsUnitName;
  }
  
  public String getChargeAmountsUnitName() {
    return this.chargeAmountsUnitName;
  }
  
  public void setChargeItemAmountsPrecision(Integer chargeItemAmountsPrecision) {
    this.chargeItemAmountsPrecision = chargeItemAmountsPrecision;
  }
  
  public Integer getChargeItemAmountsPrecision() {
    return this.chargeItemAmountsPrecision;
  }
  
  public void setChargeItemAmountsRule(String chargeItemAmountsRule) {
    this.chargeItemAmountsRule = chargeItemAmountsRule;
  }
  
  public String getChargeItemAmountsRule() {
    return this.chargeItemAmountsRule;
  }
  
  public void setPaymentChannel(String paymentChannel) {
    this.paymentChannel = paymentChannel;
  }
  
  public String getPaymentChannel() {
    return this.paymentChannel;
  }
  
  public void setPaymentApproveType(String paymentApproveType) {
    this.paymentApproveType = paymentApproveType;
  }
  
  public String getPaymentApproveType() {
    return this.paymentApproveType;
  }
  
  public void setChargeItemPaybillCode(String chargeItemPaybillCode) {
    this.chargeItemPaybillCode = chargeItemPaybillCode;
  }
  
  public String getChargeItemPaybillCode() {
    return this.chargeItemPaybillCode;
  }
  
  public void setChargeItemPaybillNo(String chargeItemPaybillNo) {
    this.chargeItemPaybillNo = chargeItemPaybillNo;
  }
  
  public String getChargeItemPaybillNo() {
    return this.chargeItemPaybillNo;
  }
  
  public void setChargeItemPaybillStatus(String chargeItemPaybillStatus) {
    this.chargeItemPaybillStatus = chargeItemPaybillStatus;
  }
  
  public String getChargeItemPaybillStatus() {
    return this.chargeItemPaybillStatus;
  }
  
  public void setChargeItemPaybillPayChannel(String chargeItemPaybillPayChannel) {
    this.chargeItemPaybillPayChannel = chargeItemPaybillPayChannel;
  }
  
  public String getChargeItemPaybillPayChannel() {
    return this.chargeItemPaybillPayChannel;
  }
  
  public void setAttachmentList(String attachmentList) {
    this.attachmentList = attachmentList;
  }
  
  public String getAttachmentList() {
    return this.attachmentList;
  }
  
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }
  
  public Integer getSeqNo() {
    return this.seqNo;
  }
  
  public void setCustomData(String customData) {
    this.customData = customData;
  }
  
  public String getCustomData() {
    return this.customData;
  }
  
  public void setUsageDesc(String usageDesc) {
    this.usageDesc = usageDesc;
  }
  
  public String getUsageDesc() {
    return this.usageDesc;
  }
  
  public void setExecuteUserCode(String executeUserCode) {
    this.executeUserCode = executeUserCode;
  }
  
  public String getExecuteUserCode() {
    return this.executeUserCode;
  }
  
  public void setExecuteUserFullName(String executeUserFullName) {
    this.executeUserFullName = executeUserFullName;
  }
  
  public String getExecuteUserFullName() {
    return this.executeUserFullName;
  }
  
  public void setExecuteOrgCode(String executeOrgCode) {
    this.executeOrgCode = executeOrgCode;
  }
  
  public String getExecuteOrgCode() {
    return this.executeOrgCode;
  }
  
  public void setExecuteOrgName(String executeOrgName) {
    this.executeOrgName = executeOrgName;
  }
  
  public String getExecuteOrgName() {
    return this.executeOrgName;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setRemark(String remark) {
    this.remark = remark;
  }
  
  public String getRemark() {
    return this.remark;
  }
  
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }
  
  public Boolean getDisabled() {
    return this.disabled;
  }
  
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  
  public Boolean getDeleted() {
    return this.deleted;
  }
  
  public void setModuleCode(String moduleCode) {
    this.moduleCode = moduleCode;
  }
  
  public String getModuleCode() {
    return this.moduleCode;
  }
  
  public void setCreatorUserCode(String creatorUserCode) {
    this.creatorUserCode = creatorUserCode;
  }
  
  public String getCreatorUserCode() {
    return this.creatorUserCode;
  }
  
  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }
  
  public String getCreatorUsername() {
    return this.creatorUsername;
  }
  
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  
  public Date getCreateTime() {
    return this.createTime;
  }
  
  public void setUpdateUserCode(String updateUserCode) {
    this.updateUserCode = updateUserCode;
  }
  
  public String getUpdateUserCode() {
    return this.updateUserCode;
  }
  
  public void setUpdateUsername(String updateUsername) {
    this.updateUsername = updateUsername;
  }
  
  public String getUpdateUsername() {
    return this.updateUsername;
  }
  
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
  
  public Date getUpdateTime() {
    return this.updateTime;
  }
  
  public void setIp(String ip) {
    this.ip = ip;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public void setOperatorLongitude(Double operatorLongitude) {
    this.operatorLongitude = operatorLongitude;
  }
  
  public Double getOperatorLongitude() {
    return this.operatorLongitude;
  }
  
  public void setOperatorLatitude(Double operatorLatitude) {
    this.operatorLatitude = operatorLatitude;
  }
  
  public Double getOperatorLatitude() {
    return this.operatorLatitude;
  }
  
  public void setOwnerUserCode(String ownerUserCode) {
    this.ownerUserCode = ownerUserCode;
  }
  
  public String getOwnerUserCode() {
    return this.ownerUserCode;
  }
  
  public void setOwnerOrgCode(String ownerOrgCode) {
    this.ownerOrgCode = ownerOrgCode;
  }
  
  public String getOwnerOrgCode() {
    return this.ownerOrgCode;
  }
  
  public void setOwnerOrgName(String ownerOrgName) {
    this.ownerOrgName = ownerOrgName;
  }
  
  public String getOwnerOrgName() {
    return this.ownerOrgName;
  }
  
  public void setSynchronousId(String synchronousId) {
    this.synchronousId = synchronousId;
  }
  
  public String getSynchronousId() {
    return this.synchronousId;
  }
}
