package com.rltx.wspay.biz.bo;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WaybillBo {
  private Long id;
  private String code;
  private String waybillNo;
  private String scheduleType;
  private Integer waybillType;
  private String checkStatus;
  private String freightCode;
  private String freightNo;
  private String rootLogisticsCode;
  private String logisticsNo;
  private String rootLogisticsNo;
  private String logisticsCode;
  private String waybillExternalNo1;
  private String waybillExternalNo2;
  private String logisticsExternalNo1;
  private String logisticsExternalNo2;
  private String driverConfirmStatus;
  private Date driverConfirmTime;
  private String platformClientOrgCode;
  private String clientOrgCode;
  private String clientOrgName;
  private String goodsName;
  private Double goodsPrice;
  private String goodsPriceUnitCode;
  private Double goodsNum;
  private String goodsNumUnitCode;
  private Double goodsWeight;
  private String goodsWeightUnitCode;
  private Double goodsVolume;
  private String goodsVolumeUnitCode;
  private String routeCode;
  private String routeName;
  private Date departDate;
  private Date returnDate;
  private Double standardDistance;
  private Double standardTime;
  private String standardTimeUnitCode;
  private String loadingOrgName;
  private String loadingUserFullName;
  private String loadingUserPhone;
  private String loadingProvinceCode;
  private String loadingCityCode;
  private String loadingCountyCode;
  private String loadingAddr;
  private Double loadingGoodsNum;
  private String loadingGoodsNumUnitCode;
  private Double loadingGoodsWeight;
  private String loadingGoodsWeightUnitCode;
  private Double loadingGoodsVolume;
  private String loadingGoodsVolumeUnitCode;
  private Date loadingTime;
  private String loadingInputUserFullName;
  private String loadingInputUserCode;
  private Date loadingInputTime;
  private String loadingAttachment;
  private Date unloadingTime;
  private String unloadingOrgName;
  private String unloadingUserFullName;
  private String unloadingUserPhone;
  private String unloadingProvinceCode;
  private String unloadingCityCode;
  private String unloadingCountyCode;
  private String unloadingAddr;
  private Double unloadingGoodsNum;
  private String unloadingGoodsNumUnitCode;
  private Double unloadingGoodsWeight;
  private String unloadingGoodsWeightUnitCode;
  private Double unloadingGoodsVolume;
  private String unloadingGoodsVolumeUnitCode;
  private String unloadingInputUserFullName;
  private String unloadingInputUserCode;
  private Date unloadingInputTime;
  private String unloadingAttachment;
  private String truckLicense;
  private String truckModelCode;
  private String truckModelName;
  private String platformTruckCode;
  private String truckCode;
  private String truckLicenseNo;
  private String licensePlateTypeCode;
  private Double truckLength;
  private String truckLengthUnitCode;
  private String truckPowerType;
  private Double regTonnage;
  private String regTonnageUnitCode;
  private String drivingLicenseNo;
  private String platformTrailerTruckCode;
  private String trailerTruckCode;
  private String trailerTruckLicenseNo;
  private String platformDriverCode;
  private String driverCode;
  private String driverFullName;
  private String driverPhone;
  private String driverIdentityNumber;
  private String driverLicenseNo;
  private String payeePlatformDriverCode;
  private String payeeDriverCode;
  private String payeeDriverFullName;
  private String payeeDriverPhone;
  private String driverPayeeBankAccountCode;
  private String driverPayeeBankName;
  private String driverPayeeBankAccountName;
  private String driverPayeeBankAccountNo;
  private String driverPayeeBankAccountDescription;
  private String driverFuelCardNo;
  private String platformViceDriverCode;
  private String viceDriverCode;
  private String viceDriverFullName;
  private String viceDriverPhone;
  private String viceDriverIdentityNumber;
  private String viceDriverLicenseNo;
  private String driverWorkStatus;
  private String driverContractCode;
  private String driverContractName;
  private String viceDriverWorkStatus;
  private String viceDriverContractCode;
  private String viceDriverContractName;
  private String payeePlatformViceDriverCode;
  private String payeeViceDriverCode;
  private String payeeViceDriverFullName;
  private String payeeViceDriverPhone;
  private String viceDriverPayeeBankAccountCode;
  private String viceDriverPayeeBankName;
  private String viceDriverPayeeBankAccountName;
  private String viceDriverPayeeBankAccountNo;
  private String sellerOrgName;
  private String customerOrgName;
  private String meterageType;
  private String ratesCode;
  private String ratesName;
  private String ratesDescription;
  private Double driverPrice;
  private String driverPriceUnitCode;
  private Double clientFreightPrice;
  private String clientFreightPriceUnitCode;
  private Double fleetPrice;
  private String fleetPriceUnitCode;
  private String platformCarrierOrgCode;
  private String carrierOrgCode;
  private String carrierOrgName;
  private String carrierUserCode;
  private String carrierUserFullName;
  private String platformDispatchOrgCode;
  private String dispatchOrgCode;
  private String dispatchOrgName;
  private String platformDispatchUserCode;
  private String dispatchUserCode;
  private String dispatchUserFullName;
  private String platformOriginalConsignOrgCode;
  private String originalConsignOrgCode;
  private String originalConsignOrgName;
  private String platformConsignOrgCode;
  private String consignOrgCode;
  private String consignOrgName;
  private Double goodsLoss;
  private String goodsLossMethod;
  private String goodsLossUnitCode;
  private String waybillStatus;
  private String complianceStatus;
  private String complianceDescription;
  private String currentActionCode;
  private String currentActionName;
  private String upSettleStatus;
  private Date upSettleTime;
  private String downSettleStatus;
  private Date downSettleTime;
  private String settleStatus;
  private String settleMethod;
  private String clientSettleMethod;
  private Double settleGoodsLossVolume;
  private String settleGoodsLossVolumeUnitCode;
  private Double settleGoodsLossReasonable;
  private String settleGoodsLossReasonableUnitCode;
  private Double settleVolume;
  private String settleVolumeUnitCode;
  private Double settleLossDeduction;
  private String settleLossDeductionUnitCode;
  private Double settleClientOrgFreight;
  private String settleClientOrgFreightUnitCode;
  private Double settleDriverFreight;
  private String settleDriverFreightUnitCode;
  private Double settleClientOrgPayee;
  private String settleClientOrgPayeeUnitCode;
  private Double settleDriverPayment;
  private String settlePaymentPayStatus;
  private String settlePaymentApproveStatus;
  private Double settleDriverRealPayment;
  private Double settlePaymentSummary;
  private Double settleRealPayment;
  private String settlePayeeUserCode;
  private String settlePayeePlatformUserCode;
  private String settlePayeePlatformUserFullname;
  private Double settleConfigValue4;
  private String settleConfigUnitCode4;
  private Double settleConfigAmount4;
  private Double settleTradingConfigValue;
  private String settleTradingConfigUnitCode;
  private Double settleTradingConfigAmount;
  private String settleDriverPaymentUnitCode;
  private Double settleTransportationCost;
  private String settleTransportationCostUnitCode;
  private Double settleGrossProfit;
  private String settleGrossProfitUnitCode;
  private String settleUserCode;
  private String settleUserFullName;
  private Date settleTime;
  private Double settleDriverExpense;
  private Double settleViceDriverExpense;
  private Double settleClientOrgPayeeCalculated;
  private Double settleClientOrgPayeeAdjust;
  private Double settleConfigValue1;
  private String settleConfigUnitCode1;
  private Double settleConfigAmount1;
  private Double settleConfigValue2;
  private String settleConfigUnitCode2;
  private Double settleConfigAmount2;
  private Double settleConfigValue3;
  private String settleConfigUnitCode3;
  private Double settleConfigAmount3;
  private Date toAccountDate;
  private String reportStatus;
  private String reportCapitalStatus;
  private String reportUserCode;
  private String reportUserFullName;
  private Date reportTime;
  private String reportBusinessTypeCode;
  private String reportCargoTypeClassificationCode;
  private String consignEvaluation;
  private Map<String, Object> customDataMap;
  private List<String> waybillTagList;
  private Double informationFee;
  private String paymentStatus;
  private String informationFeeSet;
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
  private String packagenumber;
  private String coordinationPlatformName;
  private String coordinationWayBillNo;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getCode() {
    return this.code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getWaybillNo() {
    return this.waybillNo;
  }
  
  public void setWaybillNo(String waybillNo) {
    this.waybillNo = waybillNo;
  }
  
  public String getScheduleType() {
    return this.scheduleType;
  }
  
  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }
  
  public Integer getWaybillType() {
    return this.waybillType;
  }
  
  public void setWaybillType(Integer waybillType) {
    this.waybillType = waybillType;
  }
  
  public String getCheckStatus() {
    return this.checkStatus;
  }
  
  public void setCheckStatus(String checkStatus) {
    this.checkStatus = checkStatus;
  }
  
  public String getFreightCode() {
    return this.freightCode;
  }
  
  public void setFreightCode(String freightCode) {
    this.freightCode = freightCode;
  }
  
  public String getFreightNo() {
    return this.freightNo;
  }
  
  public void setFreightNo(String freightNo) {
    this.freightNo = freightNo;
  }
  
  public String getRootLogisticsCode() {
    return this.rootLogisticsCode;
  }
  
  public void setRootLogisticsCode(String rootLogisticsCode) {
    this.rootLogisticsCode = rootLogisticsCode;
  }
  
  public String getLogisticsNo() {
    return this.logisticsNo;
  }
  
  public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
  }
  
  public String getRootLogisticsNo() {
    return this.rootLogisticsNo;
  }
  
  public void setRootLogisticsNo(String rootLogisticsNo) {
    this.rootLogisticsNo = rootLogisticsNo;
  }
  
  public String getLogisticsCode() {
    return this.logisticsCode;
  }
  
  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }
  
  public String getWaybillExternalNo1() {
    return this.waybillExternalNo1;
  }
  
  public void setWaybillExternalNo1(String waybillExternalNo1) {
    this.waybillExternalNo1 = waybillExternalNo1;
  }
  
  public String getWaybillExternalNo2() {
    return this.waybillExternalNo2;
  }
  
  public void setWaybillExternalNo2(String waybillExternalNo2) {
    this.waybillExternalNo2 = waybillExternalNo2;
  }
  
  public String getLogisticsExternalNo1() {
    return this.logisticsExternalNo1;
  }
  
  public void setLogisticsExternalNo1(String logisticsExternalNo1) {
    this.logisticsExternalNo1 = logisticsExternalNo1;
  }
  
  public String getLogisticsExternalNo2() {
    return this.logisticsExternalNo2;
  }
  
  public void setLogisticsExternalNo2(String logisticsExternalNo2) {
    this.logisticsExternalNo2 = logisticsExternalNo2;
  }
  
  public String getDriverConfirmStatus() {
    return this.driverConfirmStatus;
  }
  
  public void setDriverConfirmStatus(String driverConfirmStatus) {
    this.driverConfirmStatus = driverConfirmStatus;
  }
  
  public Date getDriverConfirmTime() {
    return this.driverConfirmTime;
  }
  
  public void setDriverConfirmTime(Date driverConfirmTime) {
    this.driverConfirmTime = driverConfirmTime;
  }
  
  public String getPlatformClientOrgCode() {
    return this.platformClientOrgCode;
  }
  
  public void setPlatformClientOrgCode(String platformClientOrgCode) {
    this.platformClientOrgCode = platformClientOrgCode;
  }
  
  public String getClientOrgCode() {
    return this.clientOrgCode;
  }
  
  public void setClientOrgCode(String clientOrgCode) {
    this.clientOrgCode = clientOrgCode;
  }
  
  public String getClientOrgName() {
    return this.clientOrgName;
  }
  
  public void setClientOrgName(String clientOrgName) {
    this.clientOrgName = clientOrgName;
  }
  
  public String getGoodsName() {
    return this.goodsName;
  }
  
  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }
  
  public Double getGoodsPrice() {
    return this.goodsPrice;
  }
  
  public void setGoodsPrice(Double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }
  
  public String getGoodsPriceUnitCode() {
    return this.goodsPriceUnitCode;
  }
  
  public void setGoodsPriceUnitCode(String goodsPriceUnitCode) {
    this.goodsPriceUnitCode = goodsPriceUnitCode;
  }
  
  public Double getGoodsNum() {
    return this.goodsNum;
  }
  
  public void setGoodsNum(Double goodsNum) {
    this.goodsNum = goodsNum;
  }
  
  public String getGoodsNumUnitCode() {
    return this.goodsNumUnitCode;
  }
  
  public void setGoodsNumUnitCode(String goodsNumUnitCode) {
    this.goodsNumUnitCode = goodsNumUnitCode;
  }
  
  public Double getGoodsWeight() {
    return this.goodsWeight;
  }
  
  public void setGoodsWeight(Double goodsWeight) {
    this.goodsWeight = goodsWeight;
  }
  
  public String getGoodsWeightUnitCode() {
    return this.goodsWeightUnitCode;
  }
  
  public void setGoodsWeightUnitCode(String goodsWeightUnitCode) {
    this.goodsWeightUnitCode = goodsWeightUnitCode;
  }
  
  public Double getGoodsVolume() {
    return this.goodsVolume;
  }
  
  public void setGoodsVolume(Double goodsVolume) {
    this.goodsVolume = goodsVolume;
  }
  
  public String getGoodsVolumeUnitCode() {
    return this.goodsVolumeUnitCode;
  }
  
  public void setGoodsVolumeUnitCode(String goodsVolumeUnitCode) {
    this.goodsVolumeUnitCode = goodsVolumeUnitCode;
  }
  
  public String getRouteCode() {
    return this.routeCode;
  }
  
  public void setRouteCode(String routeCode) {
    this.routeCode = routeCode;
  }
  
  public String getRouteName() {
    return this.routeName;
  }
  
  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }
  
  public Date getDepartDate() {
    return this.departDate;
  }
  
  public void setDepartDate(Date departDate) {
    this.departDate = departDate;
  }
  
  public Date getReturnDate() {
    return this.returnDate;
  }
  
  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }
  
  public Double getStandardDistance() {
    return this.standardDistance;
  }
  
  public void setStandardDistance(Double standardDistance) {
    this.standardDistance = standardDistance;
  }
  
  public Double getStandardTime() {
    return this.standardTime;
  }
  
  public void setStandardTime(Double standardTime) {
    this.standardTime = standardTime;
  }
  
  public String getStandardTimeUnitCode() {
    return this.standardTimeUnitCode;
  }
  
  public void setStandardTimeUnitCode(String standardTimeUnitCode) {
    this.standardTimeUnitCode = standardTimeUnitCode;
  }
  
  public String getLoadingOrgName() {
    return this.loadingOrgName;
  }
  
  public void setLoadingOrgName(String loadingOrgName) {
    this.loadingOrgName = loadingOrgName;
  }
  
  public String getLoadingUserFullName() {
    return this.loadingUserFullName;
  }
  
  public void setLoadingUserFullName(String loadingUserFullName) {
    this.loadingUserFullName = loadingUserFullName;
  }
  
  public String getLoadingUserPhone() {
    return this.loadingUserPhone;
  }
  
  public void setLoadingUserPhone(String loadingUserPhone) {
    this.loadingUserPhone = loadingUserPhone;
  }
  
  public String getLoadingProvinceCode() {
    return this.loadingProvinceCode;
  }
  
  public void setLoadingProvinceCode(String loadingProvinceCode) {
    this.loadingProvinceCode = loadingProvinceCode;
  }
  
  public String getLoadingCityCode() {
    return this.loadingCityCode;
  }
  
  public void setLoadingCityCode(String loadingCityCode) {
    this.loadingCityCode = loadingCityCode;
  }
  
  public String getLoadingCountyCode() {
    return this.loadingCountyCode;
  }
  
  public void setLoadingCountyCode(String loadingCountyCode) {
    this.loadingCountyCode = loadingCountyCode;
  }
  
  public String getLoadingAddr() {
    return this.loadingAddr;
  }
  
  public void setLoadingAddr(String loadingAddr) {
    this.loadingAddr = loadingAddr;
  }
  
  public Double getLoadingGoodsNum() {
    return this.loadingGoodsNum;
  }
  
  public void setLoadingGoodsNum(Double loadingGoodsNum) {
    this.loadingGoodsNum = loadingGoodsNum;
  }
  
  public String getLoadingGoodsNumUnitCode() {
    return this.loadingGoodsNumUnitCode;
  }
  
  public void setLoadingGoodsNumUnitCode(String loadingGoodsNumUnitCode) {
    this.loadingGoodsNumUnitCode = loadingGoodsNumUnitCode;
  }
  
  public Double getLoadingGoodsWeight() {
    return this.loadingGoodsWeight;
  }
  
  public void setLoadingGoodsWeight(Double loadingGoodsWeight) {
    this.loadingGoodsWeight = loadingGoodsWeight;
  }
  
  public String getLoadingGoodsWeightUnitCode() {
    return this.loadingGoodsWeightUnitCode;
  }
  
  public void setLoadingGoodsWeightUnitCode(String loadingGoodsWeightUnitCode) {
    this.loadingGoodsWeightUnitCode = loadingGoodsWeightUnitCode;
  }
  
  public Double getLoadingGoodsVolume() {
    return this.loadingGoodsVolume;
  }
  
  public void setLoadingGoodsVolume(Double loadingGoodsVolume) {
    this.loadingGoodsVolume = loadingGoodsVolume;
  }
  
  public String getLoadingGoodsVolumeUnitCode() {
    return this.loadingGoodsVolumeUnitCode;
  }
  
  public void setLoadingGoodsVolumeUnitCode(String loadingGoodsVolumeUnitCode) {
    this.loadingGoodsVolumeUnitCode = loadingGoodsVolumeUnitCode;
  }
  
  public Date getLoadingTime() {
    return this.loadingTime;
  }
  
  public void setLoadingTime(Date loadingTime) {
    this.loadingTime = loadingTime;
  }
  
  public String getLoadingInputUserFullName() {
    return this.loadingInputUserFullName;
  }
  
  public void setLoadingInputUserFullName(String loadingInputUserFullName) {
    this.loadingInputUserFullName = loadingInputUserFullName;
  }
  
  public String getLoadingInputUserCode() {
    return this.loadingInputUserCode;
  }
  
  public void setLoadingInputUserCode(String loadingInputUserCode) {
    this.loadingInputUserCode = loadingInputUserCode;
  }
  
  public Date getLoadingInputTime() {
    return this.loadingInputTime;
  }
  
  public void setLoadingInputTime(Date loadingInputTime) {
    this.loadingInputTime = loadingInputTime;
  }
  
  public String getLoadingAttachment() {
    return this.loadingAttachment;
  }
  
  public void setLoadingAttachment(String loadingAttachment) {
    this.loadingAttachment = loadingAttachment;
  }
  
  public Date getUnloadingTime() {
    return this.unloadingTime;
  }
  
  public void setUnloadingTime(Date unloadingTime) {
    this.unloadingTime = unloadingTime;
  }
  
  public String getUnloadingOrgName() {
    return this.unloadingOrgName;
  }
  
  public void setUnloadingOrgName(String unloadingOrgName) {
    this.unloadingOrgName = unloadingOrgName;
  }
  
  public String getUnloadingUserFullName() {
    return this.unloadingUserFullName;
  }
  
  public void setUnloadingUserFullName(String unloadingUserFullName) {
    this.unloadingUserFullName = unloadingUserFullName;
  }
  
  public String getUnloadingUserPhone() {
    return this.unloadingUserPhone;
  }
  
  public void setUnloadingUserPhone(String unloadingUserPhone) {
    this.unloadingUserPhone = unloadingUserPhone;
  }
  
  public String getUnloadingProvinceCode() {
    return this.unloadingProvinceCode;
  }
  
  public void setUnloadingProvinceCode(String unloadingProvinceCode) {
    this.unloadingProvinceCode = unloadingProvinceCode;
  }
  
  public String getUnloadingCityCode() {
    return this.unloadingCityCode;
  }
  
  public void setUnloadingCityCode(String unloadingCityCode) {
    this.unloadingCityCode = unloadingCityCode;
  }
  
  public String getUnloadingCountyCode() {
    return this.unloadingCountyCode;
  }
  
  public void setUnloadingCountyCode(String unloadingCountyCode) {
    this.unloadingCountyCode = unloadingCountyCode;
  }
  
  public String getUnloadingAddr() {
    return this.unloadingAddr;
  }
  
  public void setUnloadingAddr(String unloadingAddr) {
    this.unloadingAddr = unloadingAddr;
  }
  
  public Double getUnloadingGoodsNum() {
    return this.unloadingGoodsNum;
  }
  
  public void setUnloadingGoodsNum(Double unloadingGoodsNum) {
    this.unloadingGoodsNum = unloadingGoodsNum;
  }
  
  public String getUnloadingGoodsNumUnitCode() {
    return this.unloadingGoodsNumUnitCode;
  }
  
  public void setUnloadingGoodsNumUnitCode(String unloadingGoodsNumUnitCode) {
    this.unloadingGoodsNumUnitCode = unloadingGoodsNumUnitCode;
  }
  
  public Double getUnloadingGoodsWeight() {
    return this.unloadingGoodsWeight;
  }
  
  public void setUnloadingGoodsWeight(Double unloadingGoodsWeight) {
    this.unloadingGoodsWeight = unloadingGoodsWeight;
  }
  
  public String getUnloadingGoodsWeightUnitCode() {
    return this.unloadingGoodsWeightUnitCode;
  }
  
  public void setUnloadingGoodsWeightUnitCode(String unloadingGoodsWeightUnitCode) {
    this.unloadingGoodsWeightUnitCode = unloadingGoodsWeightUnitCode;
  }
  
  public Double getUnloadingGoodsVolume() {
    return this.unloadingGoodsVolume;
  }
  
  public void setUnloadingGoodsVolume(Double unloadingGoodsVolume) {
    this.unloadingGoodsVolume = unloadingGoodsVolume;
  }
  
  public String getUnloadingGoodsVolumeUnitCode() {
    return this.unloadingGoodsVolumeUnitCode;
  }
  
  public void setUnloadingGoodsVolumeUnitCode(String unloadingGoodsVolumeUnitCode) {
    this.unloadingGoodsVolumeUnitCode = unloadingGoodsVolumeUnitCode;
  }
  
  public String getUnloadingInputUserFullName() {
    return this.unloadingInputUserFullName;
  }
  
  public void setUnloadingInputUserFullName(String unloadingInputUserFullName) {
    this.unloadingInputUserFullName = unloadingInputUserFullName;
  }
  
  public String getUnloadingInputUserCode() {
    return this.unloadingInputUserCode;
  }
  
  public void setUnloadingInputUserCode(String unloadingInputUserCode) {
    this.unloadingInputUserCode = unloadingInputUserCode;
  }
  
  public Date getUnloadingInputTime() {
    return this.unloadingInputTime;
  }
  
  public void setUnloadingInputTime(Date unloadingInputTime) {
    this.unloadingInputTime = unloadingInputTime;
  }
  
  public String getUnloadingAttachment() {
    return this.unloadingAttachment;
  }
  
  public void setUnloadingAttachment(String unloadingAttachment) {
    this.unloadingAttachment = unloadingAttachment;
  }
  
  public String getTruckLicense() {
    return this.truckLicense;
  }
  
  public void setTruckLicense(String truckLicense) {
    this.truckLicense = truckLicense;
  }
  
  public String getTruckModelCode() {
    return this.truckModelCode;
  }
  
  public void setTruckModelCode(String truckModelCode) {
    this.truckModelCode = truckModelCode;
  }
  
  public String getTruckModelName() {
    return this.truckModelName;
  }
  
  public void setTruckModelName(String truckModelName) {
    this.truckModelName = truckModelName;
  }
  
  public String getPlatformTruckCode() {
    return this.platformTruckCode;
  }
  
  public void setPlatformTruckCode(String platformTruckCode) {
    this.platformTruckCode = platformTruckCode;
  }
  
  public String getTruckCode() {
    return this.truckCode;
  }
  
  public void setTruckCode(String truckCode) {
    this.truckCode = truckCode;
  }
  
  public String getTruckLicenseNo() {
    return this.truckLicenseNo;
  }
  
  public void setTruckLicenseNo(String truckLicenseNo) {
    this.truckLicenseNo = truckLicenseNo;
  }
  
  public String getLicensePlateTypeCode() {
    return this.licensePlateTypeCode;
  }
  
  public void setLicensePlateTypeCode(String licensePlateTypeCode) {
    this.licensePlateTypeCode = licensePlateTypeCode;
  }
  
  public Double getTruckLength() {
    return this.truckLength;
  }
  
  public void setTruckLength(Double truckLength) {
    this.truckLength = truckLength;
  }
  
  public String getTruckLengthUnitCode() {
    return this.truckLengthUnitCode;
  }
  
  public void setTruckLengthUnitCode(String truckLengthUnitCode) {
    this.truckLengthUnitCode = truckLengthUnitCode;
  }
  
  public String getTruckPowerType() {
    return this.truckPowerType;
  }
  
  public void setTruckPowerType(String truckPowerType) {
    this.truckPowerType = truckPowerType;
  }
  
  public Double getRegTonnage() {
    return this.regTonnage;
  }
  
  public void setRegTonnage(Double regTonnage) {
    this.regTonnage = regTonnage;
  }
  
  public String getRegTonnageUnitCode() {
    return this.regTonnageUnitCode;
  }
  
  public void setRegTonnageUnitCode(String regTonnageUnitCode) {
    this.regTonnageUnitCode = regTonnageUnitCode;
  }
  
  public String getDrivingLicenseNo() {
    return this.drivingLicenseNo;
  }
  
  public void setDrivingLicenseNo(String drivingLicenseNo) {
    this.drivingLicenseNo = drivingLicenseNo;
  }
  
  public String getPlatformTrailerTruckCode() {
    return this.platformTrailerTruckCode;
  }
  
  public void setPlatformTrailerTruckCode(String platformTrailerTruckCode) {
    this.platformTrailerTruckCode = platformTrailerTruckCode;
  }
  
  public String getTrailerTruckCode() {
    return this.trailerTruckCode;
  }
  
  public void setTrailerTruckCode(String trailerTruckCode) {
    this.trailerTruckCode = trailerTruckCode;
  }
  
  public String getTrailerTruckLicenseNo() {
    return this.trailerTruckLicenseNo;
  }
  
  public void setTrailerTruckLicenseNo(String trailerTruckLicenseNo) {
    this.trailerTruckLicenseNo = trailerTruckLicenseNo;
  }
  
  public String getPlatformDriverCode() {
    return this.platformDriverCode;
  }
  
  public void setPlatformDriverCode(String platformDriverCode) {
    this.platformDriverCode = platformDriverCode;
  }
  
  public String getDriverCode() {
    return this.driverCode;
  }
  
  public void setDriverCode(String driverCode) {
    this.driverCode = driverCode;
  }
  
  public String getDriverFullName() {
    return this.driverFullName;
  }
  
  public void setDriverFullName(String driverFullName) {
    this.driverFullName = driverFullName;
  }
  
  public String getDriverPhone() {
    return this.driverPhone;
  }
  
  public void setDriverPhone(String driverPhone) {
    this.driverPhone = driverPhone;
  }
  
  public String getDriverIdentityNumber() {
    return this.driverIdentityNumber;
  }
  
  public void setDriverIdentityNumber(String driverIdentityNumber) {
    this.driverIdentityNumber = driverIdentityNumber;
  }
  
  public String getDriverLicenseNo() {
    return this.driverLicenseNo;
  }
  
  public void setDriverLicenseNo(String driverLicenseNo) {
    this.driverLicenseNo = driverLicenseNo;
  }
  
  public String getPayeePlatformDriverCode() {
    return this.payeePlatformDriverCode;
  }
  
  public void setPayeePlatformDriverCode(String payeePlatformDriverCode) {
    this.payeePlatformDriverCode = payeePlatformDriverCode;
  }
  
  public String getPayeeDriverCode() {
    return this.payeeDriverCode;
  }
  
  public void setPayeeDriverCode(String payeeDriverCode) {
    this.payeeDriverCode = payeeDriverCode;
  }
  
  public String getPayeeDriverFullName() {
    return this.payeeDriverFullName;
  }
  
  public void setPayeeDriverFullName(String payeeDriverFullName) {
    this.payeeDriverFullName = payeeDriverFullName;
  }
  
  public String getPayeeDriverPhone() {
    return this.payeeDriverPhone;
  }
  
  public void setPayeeDriverPhone(String payeeDriverPhone) {
    this.payeeDriverPhone = payeeDriverPhone;
  }
  
  public String getDriverPayeeBankAccountCode() {
    return this.driverPayeeBankAccountCode;
  }
  
  public void setDriverPayeeBankAccountCode(String driverPayeeBankAccountCode) {
    this.driverPayeeBankAccountCode = driverPayeeBankAccountCode;
  }
  
  public String getDriverPayeeBankName() {
    return this.driverPayeeBankName;
  }
  
  public void setDriverPayeeBankName(String driverPayeeBankName) {
    this.driverPayeeBankName = driverPayeeBankName;
  }
  
  public String getDriverPayeeBankAccountName() {
    return this.driverPayeeBankAccountName;
  }
  
  public void setDriverPayeeBankAccountName(String driverPayeeBankAccountName) {
    this.driverPayeeBankAccountName = driverPayeeBankAccountName;
  }
  
  public String getDriverPayeeBankAccountNo() {
    return this.driverPayeeBankAccountNo;
  }
  
  public void setDriverPayeeBankAccountNo(String driverPayeeBankAccountNo) {
    this.driverPayeeBankAccountNo = driverPayeeBankAccountNo;
  }
  
  public String getDriverPayeeBankAccountDescription() {
    return this.driverPayeeBankAccountDescription;
  }
  
  public void setDriverPayeeBankAccountDescription(String driverPayeeBankAccountDescription) {
    this.driverPayeeBankAccountDescription = driverPayeeBankAccountDescription;
  }
  
  public String getDriverFuelCardNo() {
    return this.driverFuelCardNo;
  }
  
  public void setDriverFuelCardNo(String driverFuelCardNo) {
    this.driverFuelCardNo = driverFuelCardNo;
  }
  
  public String getPlatformViceDriverCode() {
    return this.platformViceDriverCode;
  }
  
  public void setPlatformViceDriverCode(String platformViceDriverCode) {
    this.platformViceDriverCode = platformViceDriverCode;
  }
  
  public String getViceDriverCode() {
    return this.viceDriverCode;
  }
  
  public void setViceDriverCode(String viceDriverCode) {
    this.viceDriverCode = viceDriverCode;
  }
  
  public String getViceDriverFullName() {
    return this.viceDriverFullName;
  }
  
  public void setViceDriverFullName(String viceDriverFullName) {
    this.viceDriverFullName = viceDriverFullName;
  }
  
  public String getViceDriverPhone() {
    return this.viceDriverPhone;
  }
  
  public void setViceDriverPhone(String viceDriverPhone) {
    this.viceDriverPhone = viceDriverPhone;
  }
  
  public String getViceDriverIdentityNumber() {
    return this.viceDriverIdentityNumber;
  }
  
  public void setViceDriverIdentityNumber(String viceDriverIdentityNumber) {
    this.viceDriverIdentityNumber = viceDriverIdentityNumber;
  }
  
  public String getViceDriverLicenseNo() {
    return this.viceDriverLicenseNo;
  }
  
  public void setViceDriverLicenseNo(String viceDriverLicenseNo) {
    this.viceDriverLicenseNo = viceDriverLicenseNo;
  }
  
  public String getDriverWorkStatus() {
    return this.driverWorkStatus;
  }
  
  public void setDriverWorkStatus(String driverWorkStatus) {
    this.driverWorkStatus = driverWorkStatus;
  }
  
  public String getDriverContractCode() {
    return this.driverContractCode;
  }
  
  public void setDriverContractCode(String driverContractCode) {
    this.driverContractCode = driverContractCode;
  }
  
  public String getDriverContractName() {
    return this.driverContractName;
  }
  
  public void setDriverContractName(String driverContractName) {
    this.driverContractName = driverContractName;
  }
  
  public String getViceDriverWorkStatus() {
    return this.viceDriverWorkStatus;
  }
  
  public void setViceDriverWorkStatus(String viceDriverWorkStatus) {
    this.viceDriverWorkStatus = viceDriverWorkStatus;
  }
  
  public String getViceDriverContractCode() {
    return this.viceDriverContractCode;
  }
  
  public void setViceDriverContractCode(String viceDriverContractCode) {
    this.viceDriverContractCode = viceDriverContractCode;
  }
  
  public String getViceDriverContractName() {
    return this.viceDriverContractName;
  }
  
  public void setViceDriverContractName(String viceDriverContractName) {
    this.viceDriverContractName = viceDriverContractName;
  }
  
  public String getPayeePlatformViceDriverCode() {
    return this.payeePlatformViceDriverCode;
  }
  
  public void setPayeePlatformViceDriverCode(String payeePlatformViceDriverCode) {
    this.payeePlatformViceDriverCode = payeePlatformViceDriverCode;
  }
  
  public String getPayeeViceDriverCode() {
    return this.payeeViceDriverCode;
  }
  
  public void setPayeeViceDriverCode(String payeeViceDriverCode) {
    this.payeeViceDriverCode = payeeViceDriverCode;
  }
  
  public String getPayeeViceDriverFullName() {
    return this.payeeViceDriverFullName;
  }
  
  public void setPayeeViceDriverFullName(String payeeViceDriverFullName) {
    this.payeeViceDriverFullName = payeeViceDriverFullName;
  }
  
  public String getPayeeViceDriverPhone() {
    return this.payeeViceDriverPhone;
  }
  
  public void setPayeeViceDriverPhone(String payeeViceDriverPhone) {
    this.payeeViceDriverPhone = payeeViceDriverPhone;
  }
  
  public String getViceDriverPayeeBankAccountCode() {
    return this.viceDriverPayeeBankAccountCode;
  }
  
  public void setViceDriverPayeeBankAccountCode(String viceDriverPayeeBankAccountCode) {
    this.viceDriverPayeeBankAccountCode = viceDriverPayeeBankAccountCode;
  }
  
  public String getViceDriverPayeeBankName() {
    return this.viceDriverPayeeBankName;
  }
  
  public void setViceDriverPayeeBankName(String viceDriverPayeeBankName) {
    this.viceDriverPayeeBankName = viceDriverPayeeBankName;
  }
  
  public String getViceDriverPayeeBankAccountName() {
    return this.viceDriverPayeeBankAccountName;
  }
  
  public void setViceDriverPayeeBankAccountName(String viceDriverPayeeBankAccountName) {
    this.viceDriverPayeeBankAccountName = viceDriverPayeeBankAccountName;
  }
  
  public String getViceDriverPayeeBankAccountNo() {
    return this.viceDriverPayeeBankAccountNo;
  }
  
  public void setViceDriverPayeeBankAccountNo(String viceDriverPayeeBankAccountNo) {
    this.viceDriverPayeeBankAccountNo = viceDriverPayeeBankAccountNo;
  }
  
  public String getSellerOrgName() {
    return this.sellerOrgName;
  }
  
  public void setSellerOrgName(String sellerOrgName) {
    this.sellerOrgName = sellerOrgName;
  }
  
  public String getCustomerOrgName() {
    return this.customerOrgName;
  }
  
  public void setCustomerOrgName(String customerOrgName) {
    this.customerOrgName = customerOrgName;
  }
  
  public String getMeterageType() {
    return this.meterageType;
  }
  
  public void setMeterageType(String meterageType) {
    this.meterageType = meterageType;
  }
  
  public String getRatesCode() {
    return this.ratesCode;
  }
  
  public void setRatesCode(String ratesCode) {
    this.ratesCode = ratesCode;
  }
  
  public String getRatesName() {
    return this.ratesName;
  }
  
  public void setRatesName(String ratesName) {
    this.ratesName = ratesName;
  }
  
  public String getRatesDescription() {
    return this.ratesDescription;
  }
  
  public void setRatesDescription(String ratesDescription) {
    this.ratesDescription = ratesDescription;
  }
  
  public Double getDriverPrice() {
    return this.driverPrice;
  }
  
  public void setDriverPrice(Double driverPrice) {
    this.driverPrice = driverPrice;
  }
  
  public String getDriverPriceUnitCode() {
    return this.driverPriceUnitCode;
  }
  
  public void setDriverPriceUnitCode(String driverPriceUnitCode) {
    this.driverPriceUnitCode = driverPriceUnitCode;
  }
  
  public Double getClientFreightPrice() {
    return this.clientFreightPrice;
  }
  
  public void setClientFreightPrice(Double clientFreightPrice) {
    this.clientFreightPrice = clientFreightPrice;
  }
  
  public String getClientFreightPriceUnitCode() {
    return this.clientFreightPriceUnitCode;
  }
  
  public void setClientFreightPriceUnitCode(String clientFreightPriceUnitCode) {
    this.clientFreightPriceUnitCode = clientFreightPriceUnitCode;
  }
  
  public Double getFleetPrice() {
    return this.fleetPrice;
  }
  
  public void setFleetPrice(Double fleetPrice) {
    this.fleetPrice = fleetPrice;
  }
  
  public String getFleetPriceUnitCode() {
    return this.fleetPriceUnitCode;
  }
  
  public void setFleetPriceUnitCode(String fleetPriceUnitCode) {
    this.fleetPriceUnitCode = fleetPriceUnitCode;
  }
  
  public String getPlatformCarrierOrgCode() {
    return this.platformCarrierOrgCode;
  }
  
  public void setPlatformCarrierOrgCode(String platformCarrierOrgCode) {
    this.platformCarrierOrgCode = platformCarrierOrgCode;
  }
  
  public String getCarrierOrgCode() {
    return this.carrierOrgCode;
  }
  
  public void setCarrierOrgCode(String carrierOrgCode) {
    this.carrierOrgCode = carrierOrgCode;
  }
  
  public String getCarrierOrgName() {
    return this.carrierOrgName;
  }
  
  public void setCarrierOrgName(String carrierOrgName) {
    this.carrierOrgName = carrierOrgName;
  }
  
  public String getCarrierUserCode() {
    return this.carrierUserCode;
  }
  
  public void setCarrierUserCode(String carrierUserCode) {
    this.carrierUserCode = carrierUserCode;
  }
  
  public String getCarrierUserFullName() {
    return this.carrierUserFullName;
  }
  
  public void setCarrierUserFullName(String carrierUserFullName) {
    this.carrierUserFullName = carrierUserFullName;
  }
  
  public String getPlatformDispatchOrgCode() {
    return this.platformDispatchOrgCode;
  }
  
  public void setPlatformDispatchOrgCode(String platformDispatchOrgCode) {
    this.platformDispatchOrgCode = platformDispatchOrgCode;
  }
  
  public String getDispatchOrgCode() {
    return this.dispatchOrgCode;
  }
  
  public void setDispatchOrgCode(String dispatchOrgCode) {
    this.dispatchOrgCode = dispatchOrgCode;
  }
  
  public String getDispatchOrgName() {
    return this.dispatchOrgName;
  }
  
  public void setDispatchOrgName(String dispatchOrgName) {
    this.dispatchOrgName = dispatchOrgName;
  }
  
  public String getPlatformDispatchUserCode() {
    return this.platformDispatchUserCode;
  }
  
  public void setPlatformDispatchUserCode(String platformDispatchUserCode) {
    this.platformDispatchUserCode = platformDispatchUserCode;
  }
  
  public String getDispatchUserCode() {
    return this.dispatchUserCode;
  }
  
  public void setDispatchUserCode(String dispatchUserCode) {
    this.dispatchUserCode = dispatchUserCode;
  }
  
  public String getDispatchUserFullName() {
    return this.dispatchUserFullName;
  }
  
  public void setDispatchUserFullName(String dispatchUserFullName) {
    this.dispatchUserFullName = dispatchUserFullName;
  }
  
  public String getPlatformOriginalConsignOrgCode() {
    return this.platformOriginalConsignOrgCode;
  }
  
  public void setPlatformOriginalConsignOrgCode(String platformOriginalConsignOrgCode) {
    this.platformOriginalConsignOrgCode = platformOriginalConsignOrgCode;
  }
  
  public String getOriginalConsignOrgCode() {
    return this.originalConsignOrgCode;
  }
  
  public void setOriginalConsignOrgCode(String originalConsignOrgCode) {
    this.originalConsignOrgCode = originalConsignOrgCode;
  }
  
  public String getOriginalConsignOrgName() {
    return this.originalConsignOrgName;
  }
  
  public void setOriginalConsignOrgName(String originalConsignOrgName) {
    this.originalConsignOrgName = originalConsignOrgName;
  }
  
  public String getPlatformConsignOrgCode() {
    return this.platformConsignOrgCode;
  }
  
  public void setPlatformConsignOrgCode(String platformConsignOrgCode) {
    this.platformConsignOrgCode = platformConsignOrgCode;
  }
  
  public String getConsignOrgCode() {
    return this.consignOrgCode;
  }
  
  public void setConsignOrgCode(String consignOrgCode) {
    this.consignOrgCode = consignOrgCode;
  }
  
  public String getConsignOrgName() {
    return this.consignOrgName;
  }
  
  public void setConsignOrgName(String consignOrgName) {
    this.consignOrgName = consignOrgName;
  }
  
  public Double getGoodsLoss() {
    return this.goodsLoss;
  }
  
  public void setGoodsLoss(Double goodsLoss) {
    this.goodsLoss = goodsLoss;
  }
  
  public String getGoodsLossMethod() {
    return this.goodsLossMethod;
  }
  
  public void setGoodsLossMethod(String goodsLossMethod) {
    this.goodsLossMethod = goodsLossMethod;
  }
  
  public String getGoodsLossUnitCode() {
    return this.goodsLossUnitCode;
  }
  
  public void setGoodsLossUnitCode(String goodsLossUnitCode) {
    this.goodsLossUnitCode = goodsLossUnitCode;
  }
  
  public String getWaybillStatus() {
    return this.waybillStatus;
  }
  
  public void setWaybillStatus(String waybillStatus) {
    this.waybillStatus = waybillStatus;
  }
  
  public String getComplianceStatus() {
    return this.complianceStatus;
  }
  
  public void setComplianceStatus(String complianceStatus) {
    this.complianceStatus = complianceStatus;
  }
  
  public String getComplianceDescription() {
    return this.complianceDescription;
  }
  
  public void setComplianceDescription(String complianceDescription) {
    this.complianceDescription = complianceDescription;
  }
  
  public String getCurrentActionCode() {
    return this.currentActionCode;
  }
  
  public void setCurrentActionCode(String currentActionCode) {
    this.currentActionCode = currentActionCode;
  }
  
  public String getCurrentActionName() {
    return this.currentActionName;
  }
  
  public void setCurrentActionName(String currentActionName) {
    this.currentActionName = currentActionName;
  }
  
  public String getUpSettleStatus() {
    return this.upSettleStatus;
  }
  
  public void setUpSettleStatus(String upSettleStatus) {
    this.upSettleStatus = upSettleStatus;
  }
  
  public Date getUpSettleTime() {
    return this.upSettleTime;
  }
  
  public void setUpSettleTime(Date upSettleTime) {
    this.upSettleTime = upSettleTime;
  }
  
  public String getDownSettleStatus() {
    return this.downSettleStatus;
  }
  
  public void setDownSettleStatus(String downSettleStatus) {
    this.downSettleStatus = downSettleStatus;
  }
  
  public Date getDownSettleTime() {
    return this.downSettleTime;
  }
  
  public void setDownSettleTime(Date downSettleTime) {
    this.downSettleTime = downSettleTime;
  }
  
  public String getSettleStatus() {
    return this.settleStatus;
  }
  
  public void setSettleStatus(String settleStatus) {
    this.settleStatus = settleStatus;
  }
  
  public String getSettleMethod() {
    return this.settleMethod;
  }
  
  public void setSettleMethod(String settleMethod) {
    this.settleMethod = settleMethod;
  }
  
  public String getClientSettleMethod() {
    return this.clientSettleMethod;
  }
  
  public void setClientSettleMethod(String clientSettleMethod) {
    this.clientSettleMethod = clientSettleMethod;
  }
  
  public Double getSettleGoodsLossVolume() {
    return this.settleGoodsLossVolume;
  }
  
  public void setSettleGoodsLossVolume(Double settleGoodsLossVolume) {
    this.settleGoodsLossVolume = settleGoodsLossVolume;
  }
  
  public String getSettleGoodsLossVolumeUnitCode() {
    return this.settleGoodsLossVolumeUnitCode;
  }
  
  public void setSettleGoodsLossVolumeUnitCode(String settleGoodsLossVolumeUnitCode) {
    this.settleGoodsLossVolumeUnitCode = settleGoodsLossVolumeUnitCode;
  }
  
  public Double getSettleGoodsLossReasonable() {
    return this.settleGoodsLossReasonable;
  }
  
  public void setSettleGoodsLossReasonable(Double settleGoodsLossReasonable) {
    this.settleGoodsLossReasonable = settleGoodsLossReasonable;
  }
  
  public String getSettleGoodsLossReasonableUnitCode() {
    return this.settleGoodsLossReasonableUnitCode;
  }
  
  public void setSettleGoodsLossReasonableUnitCode(String settleGoodsLossReasonableUnitCode) {
    this.settleGoodsLossReasonableUnitCode = settleGoodsLossReasonableUnitCode;
  }
  
  public Double getSettleVolume() {
    return this.settleVolume;
  }
  
  public void setSettleVolume(Double settleVolume) {
    this.settleVolume = settleVolume;
  }
  
  public String getSettleVolumeUnitCode() {
    return this.settleVolumeUnitCode;
  }
  
  public void setSettleVolumeUnitCode(String settleVolumeUnitCode) {
    this.settleVolumeUnitCode = settleVolumeUnitCode;
  }
  
  public Double getSettleLossDeduction() {
    return this.settleLossDeduction;
  }
  
  public void setSettleLossDeduction(Double settleLossDeduction) {
    this.settleLossDeduction = settleLossDeduction;
  }
  
  public String getSettleLossDeductionUnitCode() {
    return this.settleLossDeductionUnitCode;
  }
  
  public void setSettleLossDeductionUnitCode(String settleLossDeductionUnitCode) {
    this.settleLossDeductionUnitCode = settleLossDeductionUnitCode;
  }
  
  public Double getSettleClientOrgFreight() {
    return this.settleClientOrgFreight;
  }
  
  public void setSettleClientOrgFreight(Double settleClientOrgFreight) {
    this.settleClientOrgFreight = settleClientOrgFreight;
  }
  
  public String getSettleClientOrgFreightUnitCode() {
    return this.settleClientOrgFreightUnitCode;
  }
  
  public void setSettleClientOrgFreightUnitCode(String settleClientOrgFreightUnitCode) {
    this.settleClientOrgFreightUnitCode = settleClientOrgFreightUnitCode;
  }
  
  public Double getSettleDriverFreight() {
    return this.settleDriverFreight;
  }
  
  public void setSettleDriverFreight(Double settleDriverFreight) {
    this.settleDriverFreight = settleDriverFreight;
  }
  
  public String getSettleDriverFreightUnitCode() {
    return this.settleDriverFreightUnitCode;
  }
  
  public void setSettleDriverFreightUnitCode(String settleDriverFreightUnitCode) {
    this.settleDriverFreightUnitCode = settleDriverFreightUnitCode;
  }
  
  public Double getSettleClientOrgPayee() {
    return this.settleClientOrgPayee;
  }
  
  public void setSettleClientOrgPayee(Double settleClientOrgPayee) {
    this.settleClientOrgPayee = settleClientOrgPayee;
  }
  
  public String getSettleClientOrgPayeeUnitCode() {
    return this.settleClientOrgPayeeUnitCode;
  }
  
  public void setSettleClientOrgPayeeUnitCode(String settleClientOrgPayeeUnitCode) {
    this.settleClientOrgPayeeUnitCode = settleClientOrgPayeeUnitCode;
  }
  
  public Double getSettleDriverPayment() {
    return this.settleDriverPayment;
  }
  
  public void setSettleDriverPayment(Double settleDriverPayment) {
    this.settleDriverPayment = settleDriverPayment;
  }
  
  public String getSettlePaymentPayStatus() {
    return this.settlePaymentPayStatus;
  }
  
  public void setSettlePaymentPayStatus(String settlePaymentPayStatus) {
    this.settlePaymentPayStatus = settlePaymentPayStatus;
  }
  
  public String getSettlePaymentApproveStatus() {
    return this.settlePaymentApproveStatus;
  }
  
  public void setSettlePaymentApproveStatus(String settlePaymentApproveStatus) {
    this.settlePaymentApproveStatus = settlePaymentApproveStatus;
  }
  
  public Double getSettleDriverRealPayment() {
    return this.settleDriverRealPayment;
  }
  
  public void setSettleDriverRealPayment(Double settleDriverRealPayment) {
    this.settleDriverRealPayment = settleDriverRealPayment;
  }
  
  public Double getSettlePaymentSummary() {
    return this.settlePaymentSummary;
  }
  
  public void setSettlePaymentSummary(Double settlePaymentSummary) {
    this.settlePaymentSummary = settlePaymentSummary;
  }
  
  public Double getSettleRealPayment() {
    return this.settleRealPayment;
  }
  
  public void setSettleRealPayment(Double settleRealPayment) {
    this.settleRealPayment = settleRealPayment;
  }
  
  public String getSettlePayeeUserCode() {
    return this.settlePayeeUserCode;
  }
  
  public void setSettlePayeeUserCode(String settlePayeeUserCode) {
    this.settlePayeeUserCode = settlePayeeUserCode;
  }
  
  public String getSettlePayeePlatformUserCode() {
    return this.settlePayeePlatformUserCode;
  }
  
  public void setSettlePayeePlatformUserCode(String settlePayeePlatformUserCode) {
    this.settlePayeePlatformUserCode = settlePayeePlatformUserCode;
  }
  
  public String getSettlePayeePlatformUserFullname() {
    return this.settlePayeePlatformUserFullname;
  }
  
  public void setSettlePayeePlatformUserFullname(String settlePayeePlatformUserFullname) {
    this.settlePayeePlatformUserFullname = settlePayeePlatformUserFullname;
  }
  
  public Double getSettleConfigValue4() {
    return this.settleConfigValue4;
  }
  
  public void setSettleConfigValue4(Double settleConfigValue4) {
    this.settleConfigValue4 = settleConfigValue4;
  }
  
  public String getSettleConfigUnitCode4() {
    return this.settleConfigUnitCode4;
  }
  
  public void setSettleConfigUnitCode4(String settleConfigUnitCode4) {
    this.settleConfigUnitCode4 = settleConfigUnitCode4;
  }
  
  public Double getSettleConfigAmount4() {
    return this.settleConfigAmount4;
  }
  
  public void setSettleConfigAmount4(Double settleConfigAmount4) {
    this.settleConfigAmount4 = settleConfigAmount4;
  }
  
  public Double getSettleTradingConfigValue() {
    return this.settleTradingConfigValue;
  }
  
  public void setSettleTradingConfigValue(Double settleTradingConfigValue) {
    this.settleTradingConfigValue = settleTradingConfigValue;
  }
  
  public String getSettleTradingConfigUnitCode() {
    return this.settleTradingConfigUnitCode;
  }
  
  public void setSettleTradingConfigUnitCode(String settleTradingConfigUnitCode) {
    this.settleTradingConfigUnitCode = settleTradingConfigUnitCode;
  }
  
  public Double getSettleTradingConfigAmount() {
    return this.settleTradingConfigAmount;
  }
  
  public void setSettleTradingConfigAmount(Double settleTradingConfigAmount) {
    this.settleTradingConfigAmount = settleTradingConfigAmount;
  }
  
  public String getSettleDriverPaymentUnitCode() {
    return this.settleDriverPaymentUnitCode;
  }
  
  public void setSettleDriverPaymentUnitCode(String settleDriverPaymentUnitCode) {
    this.settleDriverPaymentUnitCode = settleDriverPaymentUnitCode;
  }
  
  public Double getSettleTransportationCost() {
    return this.settleTransportationCost;
  }
  
  public void setSettleTransportationCost(Double settleTransportationCost) {
    this.settleTransportationCost = settleTransportationCost;
  }
  
  public String getSettleTransportationCostUnitCode() {
    return this.settleTransportationCostUnitCode;
  }
  
  public void setSettleTransportationCostUnitCode(String settleTransportationCostUnitCode) {
    this.settleTransportationCostUnitCode = settleTransportationCostUnitCode;
  }
  
  public Double getSettleGrossProfit() {
    return this.settleGrossProfit;
  }
  
  public void setSettleGrossProfit(Double settleGrossProfit) {
    this.settleGrossProfit = settleGrossProfit;
  }
  
  public String getSettleGrossProfitUnitCode() {
    return this.settleGrossProfitUnitCode;
  }
  
  public void setSettleGrossProfitUnitCode(String settleGrossProfitUnitCode) {
    this.settleGrossProfitUnitCode = settleGrossProfitUnitCode;
  }
  
  public String getSettleUserCode() {
    return this.settleUserCode;
  }
  
  public void setSettleUserCode(String settleUserCode) {
    this.settleUserCode = settleUserCode;
  }
  
  public String getSettleUserFullName() {
    return this.settleUserFullName;
  }
  
  public void setSettleUserFullName(String settleUserFullName) {
    this.settleUserFullName = settleUserFullName;
  }
  
  public Date getSettleTime() {
    return this.settleTime;
  }
  
  public void setSettleTime(Date settleTime) {
    this.settleTime = settleTime;
  }
  
  public Double getSettleDriverExpense() {
    return this.settleDriverExpense;
  }
  
  public void setSettleDriverExpense(Double settleDriverExpense) {
    this.settleDriverExpense = settleDriverExpense;
  }
  
  public Double getSettleViceDriverExpense() {
    return this.settleViceDriverExpense;
  }
  
  public void setSettleViceDriverExpense(Double settleViceDriverExpense) {
    this.settleViceDriverExpense = settleViceDriverExpense;
  }
  
  public Double getSettleClientOrgPayeeCalculated() {
    return this.settleClientOrgPayeeCalculated;
  }
  
  public void setSettleClientOrgPayeeCalculated(Double settleClientOrgPayeeCalculated) {
    this.settleClientOrgPayeeCalculated = settleClientOrgPayeeCalculated;
  }
  
  public Double getSettleClientOrgPayeeAdjust() {
    return this.settleClientOrgPayeeAdjust;
  }
  
  public void setSettleClientOrgPayeeAdjust(Double settleClientOrgPayeeAdjust) {
    this.settleClientOrgPayeeAdjust = settleClientOrgPayeeAdjust;
  }
  
  public Double getSettleConfigValue1() {
    return this.settleConfigValue1;
  }
  
  public void setSettleConfigValue1(Double settleConfigValue1) {
    this.settleConfigValue1 = settleConfigValue1;
  }
  
  public String getSettleConfigUnitCode1() {
    return this.settleConfigUnitCode1;
  }
  
  public void setSettleConfigUnitCode1(String settleConfigUnitCode1) {
    this.settleConfigUnitCode1 = settleConfigUnitCode1;
  }
  
  public Double getSettleConfigAmount1() {
    return this.settleConfigAmount1;
  }
  
  public void setSettleConfigAmount1(Double settleConfigAmount1) {
    this.settleConfigAmount1 = settleConfigAmount1;
  }
  
  public Double getSettleConfigValue2() {
    return this.settleConfigValue2;
  }
  
  public void setSettleConfigValue2(Double settleConfigValue2) {
    this.settleConfigValue2 = settleConfigValue2;
  }
  
  public String getSettleConfigUnitCode2() {
    return this.settleConfigUnitCode2;
  }
  
  public void setSettleConfigUnitCode2(String settleConfigUnitCode2) {
    this.settleConfigUnitCode2 = settleConfigUnitCode2;
  }
  
  public Double getSettleConfigAmount2() {
    return this.settleConfigAmount2;
  }
  
  public void setSettleConfigAmount2(Double settleConfigAmount2) {
    this.settleConfigAmount2 = settleConfigAmount2;
  }
  
  public Double getSettleConfigValue3() {
    return this.settleConfigValue3;
  }
  
  public void setSettleConfigValue3(Double settleConfigValue3) {
    this.settleConfigValue3 = settleConfigValue3;
  }
  
  public String getSettleConfigUnitCode3() {
    return this.settleConfigUnitCode3;
  }
  
  public void setSettleConfigUnitCode3(String settleConfigUnitCode3) {
    this.settleConfigUnitCode3 = settleConfigUnitCode3;
  }
  
  public Double getSettleConfigAmount3() {
    return this.settleConfigAmount3;
  }
  
  public void setSettleConfigAmount3(Double settleConfigAmount3) {
    this.settleConfigAmount3 = settleConfigAmount3;
  }
  
  public Date getToAccountDate() {
    return this.toAccountDate;
  }
  
  public void setToAccountDate(Date toAccountDate) {
    this.toAccountDate = toAccountDate;
  }
  
  public String getReportStatus() {
    return this.reportStatus;
  }
  
  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }
  
  public String getReportCapitalStatus() {
    return this.reportCapitalStatus;
  }
  
  public void setReportCapitalStatus(String reportCapitalStatus) {
    this.reportCapitalStatus = reportCapitalStatus;
  }
  
  public String getReportUserCode() {
    return this.reportUserCode;
  }
  
  public void setReportUserCode(String reportUserCode) {
    this.reportUserCode = reportUserCode;
  }
  
  public String getReportUserFullName() {
    return this.reportUserFullName;
  }
  
  public void setReportUserFullName(String reportUserFullName) {
    this.reportUserFullName = reportUserFullName;
  }
  
  public Date getReportTime() {
    return this.reportTime;
  }
  
  public void setReportTime(Date reportTime) {
    this.reportTime = reportTime;
  }
  
  public String getReportBusinessTypeCode() {
    return this.reportBusinessTypeCode;
  }
  
  public void setReportBusinessTypeCode(String reportBusinessTypeCode) {
    this.reportBusinessTypeCode = reportBusinessTypeCode;
  }
  
  public String getReportCargoTypeClassificationCode() {
    return this.reportCargoTypeClassificationCode;
  }
  
  public void setReportCargoTypeClassificationCode(String reportCargoTypeClassificationCode) {
    this.reportCargoTypeClassificationCode = reportCargoTypeClassificationCode;
  }
  
  public String getConsignEvaluation() {
    return this.consignEvaluation;
  }
  
  public void setConsignEvaluation(String consignEvaluation) {
    this.consignEvaluation = consignEvaluation;
  }
  
  public Map<String, Object> getCustomDataMap() {
    return this.customDataMap;
  }
  
  public void setCustomDataMap(Map<String, Object> customDataMap) {
    this.customDataMap = customDataMap;
  }
  
  public List<String> getWaybillTagList() {
    return this.waybillTagList;
  }
  
  public void setWaybillTagList(List<String> waybillTagList) {
    this.waybillTagList = waybillTagList;
  }
  
  public Double getInformationFee() {
    return this.informationFee;
  }
  
  public void setInformationFee(Double informationFee) {
    this.informationFee = informationFee;
  }
  
  public String getPaymentStatus() {
    return this.paymentStatus;
  }
  
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
  
  public String getInformationFeeSet() {
    return this.informationFeeSet;
  }
  
  public void setInformationFeeSet(String informationFeeSet) {
    this.informationFeeSet = informationFeeSet;
  }
  
  public String getOfflineReconciliationStatus() {
    return this.offlineReconciliationStatus;
  }
  
  public void setOfflineReconciliationStatus(String offlineReconciliationStatus) {
    this.offlineReconciliationStatus = offlineReconciliationStatus;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getRemark() {
    return this.remark;
  }
  
  public void setRemark(String remark) {
    this.remark = remark;
  }
  
  public Boolean getDisabled() {
    return this.disabled;
  }
  
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }
  
  public Boolean getDeleted() {
    return this.deleted;
  }
  
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  
  public String getModuleCode() {
    return this.moduleCode;
  }
  
  public void setModuleCode(String moduleCode) {
    this.moduleCode = moduleCode;
  }
  
  public String getCreatorUserCode() {
    return this.creatorUserCode;
  }
  
  public void setCreatorUserCode(String creatorUserCode) {
    this.creatorUserCode = creatorUserCode;
  }
  
  public String getCreatorUsername() {
    return this.creatorUsername;
  }
  
  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }
  
  public Date getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  
  public String getUpdateUserCode() {
    return this.updateUserCode;
  }
  
  public void setUpdateUserCode(String updateUserCode) {
    this.updateUserCode = updateUserCode;
  }
  
  public String getUpdateUsername() {
    return this.updateUsername;
  }
  
  public void setUpdateUsername(String updateUsername) {
    this.updateUsername = updateUsername;
  }
  
  public Date getUpdateTime() {
    return this.updateTime;
  }
  
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public void setIp(String ip) {
    this.ip = ip;
  }
  
  public Double getOperatorLongitude() {
    return this.operatorLongitude;
  }
  
  public void setOperatorLongitude(Double operatorLongitude) {
    this.operatorLongitude = operatorLongitude;
  }
  
  public Double getOperatorLatitude() {
    return this.operatorLatitude;
  }
  
  public void setOperatorLatitude(Double operatorLatitude) {
    this.operatorLatitude = operatorLatitude;
  }
  
  public String getOwnerUserCode() {
    return this.ownerUserCode;
  }
  
  public void setOwnerUserCode(String ownerUserCode) {
    this.ownerUserCode = ownerUserCode;
  }
  
  public String getOwnerOrgCode() {
    return this.ownerOrgCode;
  }
  
  public void setOwnerOrgCode(String ownerOrgCode) {
    this.ownerOrgCode = ownerOrgCode;
  }
  
  public String getOwnerOrgName() {
    return this.ownerOrgName;
  }
  
  public void setOwnerOrgName(String ownerOrgName) {
    this.ownerOrgName = ownerOrgName;
  }
  
  public String getSynchronousId() {
    return this.synchronousId;
  }
  
  public void setSynchronousId(String synchronousId) {
    this.synchronousId = synchronousId;
  }
  
  public String getPackagenumber() {
    return this.packagenumber;
  }
  
  public void setPackagenumber(String packagenumber) {
    this.packagenumber = packagenumber;
  }
  
  public String getCoordinationPlatformName() {
    return this.coordinationPlatformName;
  }
  
  public void setCoordinationPlatformName(String coordinationPlatformName) {
    this.coordinationPlatformName = coordinationPlatformName;
  }
  
  public String getCoordinationWayBillNo() {
    return this.coordinationWayBillNo;
  }
  
  public void setCoordinationWayBillNo(String coordinationWayBillNo) {
    this.coordinationWayBillNo = coordinationWayBillNo;
  }
}
