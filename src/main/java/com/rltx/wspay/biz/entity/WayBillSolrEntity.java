package com.rltx.wspay.biz.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.Dynamic;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;
import java.util.List;
import java.util.Map;

@SolrDocument(solrCoreName="waybill")
public class WayBillSolrEntity {
  @Field("id")
  private Long id;
  @Field("code")
  private String code;
  @Field("waybillNo")
  private String waybillNo;
  @Field("scheduleType")
  private String scheduleType;
  @Field("waybillType")
  private Integer waybillType;
  @Field("checkStatus")
  private String checkStatus;
  @Field("freightCode")
  private String freightCode;
  @Field("freightNo")
  private String freightNo;
  @Field("rootLogisticsCode")
  private String rootLogisticsCode;
  @Field("logisticsNo")
  private String logisticsNo;
  @Field("rootLogisticsNo")
  private String rootLogisticsNo;
  @Field("logisticsCode")
  private String logisticsCode;
  @Field("waybillExternalNo1")
  private String waybillExternalNo1;
  @Field("waybillExternalNo2")
  private String waybillExternalNo2;
  @Field("logisticsExternalNo1")
  private String logisticsExternalNo1;
  @Field("logisticsExternalNo2")
  private String logisticsExternalNo2;
  @Field("driverConfirmStatus")
  private String driverConfirmStatus;
  @Field("driverConfirmTime")
  private Date driverConfirmTime;
  @Field("platformClientOrgCode")
  private String platformClientOrgCode;
  @Field("clientOrgCode")
  private String clientOrgCode;
  @Field("clientOrgName")
  private String clientOrgName;
  @Field("clientOrgFullName")
  private String clientOrgFullName;
  @Field("goodsName")
  private String goodsName;
  @Field("goodsPrice")
  private Double goodsPrice;
  @Field("goodsPriceUnitCode")
  private String goodsPriceUnitCode;
  @Field("goodsNum")
  private Double goodsNum;
  @Field("goodsNumUnitCode")
  private String goodsNumUnitCode;
  @Field("goodsWeight")
  private Double goodsWeight;
  @Field("goodsWeightUnitCode")
  private String goodsWeightUnitCode;
  @Field("goodsVolume")
  private Double goodsVolume;
  @Field("goodsVolumeUnitCode")
  private String goodsVolumeUnitCode;
  @Field("routeCode")
  private String routeCode;
  @Field("routeName")
  private String routeName;
  @Field("departDate")
  private Date departDate;
  @Field("returnDate")
  private Date returnDate;
  @Field("standardDistance")
  private Double standardDistance;
  @Field("standardTime")
  private Double standardTime;
  @Field("standardTimeUnitCode")
  private String standardTimeUnitCode;
  @Field("loadingOrgName")
  private String loadingOrgName;
  @Field("loadingUserFullName")
  private String loadingUserFullName;
  @Field("loadingUserPhone")
  private String loadingUserPhone;
  @Field("loadingProvinceCode")
  private String loadingProvinceCode;
  @Field("loadingCityCode")
  private String loadingCityCode;
  @Field("loadingCountyCode")
  private String loadingCountyCode;
  @Field("loadingAddr")
  private String loadingAddr;
  @Field("loadingGoodsNum")
  private Double loadingGoodsNum;
  @Field("loadingGoodsNumUnitCode")
  private String loadingGoodsNumUnitCode;
  @Field("loadingGoodsWeight")
  private Double loadingGoodsWeight;
  @Field("loadingGoodsWeightUnitCode")
  private String loadingGoodsWeightUnitCode;
  @Field("loadingGoodsVolume")
  private Double loadingGoodsVolume;
  @Field("loadingGoodsVolumeUnitCode")
  private String loadingGoodsVolumeUnitCode;
  @Field("loadingTime")
  private Date loadingTime;
  @Field("loadingInputUserFullName")
  private String loadingInputUserFullName;
  @Field("loadingInputUserCode")
  private String loadingInputUserCode;
  @Field("loadingInputTime")
  private Date loadingInputTime;
  @Field("loadingAttachment")
  private String loadingAttachment;
  @Field("unloadingTime")
  private Date unloadingTime;
  @Field("unloadingOrgName")
  private String unloadingOrgName;
  @Field("unloadingUserFullName")
  private String unloadingUserFullName;
  @Field("unloadingUserPhone")
  private String unloadingUserPhone;
  @Field("unloadingProvinceCode")
  private String unloadingProvinceCode;
  @Field("unloadingCityCode")
  private String unloadingCityCode;
  @Field("unloadingCountyCode")
  private String unloadingCountyCode;
  @Field("unloadingAddr")
  private String unloadingAddr;
  @Field("unloadingGoodsNum")
  private Double unloadingGoodsNum;
  @Field("unloadingGoodsNumUnitCode")
  private String unloadingGoodsNumUnitCode;
  @Field("unloadingGoodsWeight")
  private Double unloadingGoodsWeight;
  @Field("unloadingGoodsWeightUnitCode")
  private String unloadingGoodsWeightUnitCode;
  @Field("unloadingGoodsVolume")
  private Double unloadingGoodsVolume;
  @Field("unloadingGoodsVolumeUnitCode")
  private String unloadingGoodsVolumeUnitCode;
  @Field("unloadingInputUserFullName")
  private String unloadingInputUserFullName;
  @Field("unloadingInputUserCode")
  private String unloadingInputUserCode;
  @Field("unloadingInputTime")
  private Date unloadingInputTime;
  @Field("unloadingAttachment")
  private String unloadingAttachment;
  @Field("truckLicense")
  private String truckLicense;
  @Field("truckModelCode")
  private String truckModelCode;
  @Field("truckModelName")
  private String truckModelName;
  @Field("platformTruckCode")
  private String platformTruckCode;
  @Field("truckCode")
  private String truckCode;
  @Field("truckLicenseNo")
  private String truckLicenseNo;
  @Field("licensePlateTypeCode")
  private String licensePlateTypeCode;
  @Field("truckLength")
  private Double truckLength;
  @Field("truckLengthUnitCode")
  private String truckLengthUnitCode;
  @Field("truckPowerType")
  private String truckPowerType;
  @Field("regTonnage")
  private Double regTonnage;
  @Field("regTonnageUnitCode")
  private String regTonnageUnitCode;
  @Field("drivingLicenseNo")
  private String drivingLicenseNo;
  @Field("platformTrailerTruckCode")
  private String platformTrailerTruckCode;
  @Field("trailerTruckCode")
  private String trailerTruckCode;
  @Field("trailerTruckLicenseNo")
  private String trailerTruckLicenseNo;
  @Field("platformDriverCode")
  private String platformDriverCode;
  @Field("driverCode")
  private String driverCode;
  @Field("driverFullName")
  private String driverFullName;
  @Field("driverPhone")
  private String driverPhone;
  @Field("driverIdentityNumber")
  private String driverIdentityNumber;
  @Field("driverLicenseNo")
  private String driverLicenseNo;
  @Field("payeePlatformDriverCode")
  private String payeePlatformDriverCode;
  @Field("payeeDriverCode")
  private String payeeDriverCode;
  @Field("payeeDriverFullName")
  private String payeeDriverFullName;
  @Field("payeeDriverPhone")
  private String payeeDriverPhone;
  @Field("driverPayeeBankAccountCode")
  private String driverPayeeBankAccountCode;
  @Field("driverPayeeBankName")
  private String driverPayeeBankName;
  @Field("driverPayeeBankAccountName")
  private String driverPayeeBankAccountName;
  @Field("driverPayeeBankAccountNo")
  private String driverPayeeBankAccountNo;
  @Field("driverPayeeBankAccountDescription")
  private String driverPayeeBankAccountDescription;
  @Field("driverFuelCardNo")
  private String driverFuelCardNo;
  @Field("platformViceDriverCode")
  private String platformViceDriverCode;
  @Field("viceDriverCode")
  private String viceDriverCode;
  @Field("viceDriverFullName")
  private String viceDriverFullName;
  @Field("viceDriverPhone")
  private String viceDriverPhone;
  @Field("viceDriverIdentityNumber")
  private String viceDriverIdentityNumber;
  @Field("viceDriverLicenseNo")
  private String viceDriverLicenseNo;
  @Field("driverWorkStatus")
  private String driverWorkStatus;
  @Field("driverContractCode")
  private String driverContractCode;
  @Field("driverContractName")
  private String driverContractName;
  @Field("viceDriverWorkStatus")
  private String viceDriverWorkStatus;
  @Field("viceDriverContractCode")
  private String viceDriverContractCode;
  @Field("viceDriverContractName")
  private String viceDriverContractName;
  @Field("payeePlatformViceDriverCode")
  private String payeePlatformViceDriverCode;
  @Field("payeeViceDriverCode")
  private String payeeViceDriverCode;
  @Field("payeeViceDriverFullName")
  private String payeeViceDriverFullName;
  @Field("payeeViceDriverPhone")
  private String payeeViceDriverPhone;
  @Field("viceDriverPayeeBankAccountCode")
  private String viceDriverPayeeBankAccountCode;
  @Field("viceDriverPayeeBankName")
  private String viceDriverPayeeBankName;
  @Field("viceDriverPayeeBankAccountName")
  private String viceDriverPayeeBankAccountName;
  @Field("viceDriverPayeeBankAccountNo")
  private String viceDriverPayeeBankAccountNo;
  @Field("sellerOrgName")
  private String sellerOrgName;
  @Field("customerOrgName")
  private String customerOrgName;
  @Field("meterageType")
  private String meterageType;
  @Field("ratesCode")
  private String ratesCode;
  @Field("ratesName")
  private String ratesName;
  @Field("ratesDescription")
  private String ratesDescription;
  @Field("driverPrice")
  private Double driverPrice;
  @Field("driverPriceUnitCode")
  private String driverPriceUnitCode;
  @Field("clientFreightPrice")
  private Double clientFreightPrice;
  @Field("clientFreightPriceUnitCode")
  private String clientFreightPriceUnitCode;
  @Field("fleetPrice")
  private Double fleetPrice;
  @Field("fleetPriceUnitCode")
  private String fleetPriceUnitCode;
  @Field("platformCarrierOrgCode")
  private String platformCarrierOrgCode;
  @Field("carrierOrgCode")
  private String carrierOrgCode;
  @Field("carrierOrgName")
  private String carrierOrgName;
  @Field("carrierOrgFullName")
  private String carrierOrgFullName;
  @Field("carrierUserCode")
  private String carrierUserCode;
  @Field("carrierUserFullName")
  private String carrierUserFullName;
  @Field("platformDispatchOrgCode")
  private String platformDispatchOrgCode;
  @Field("dispatchOrgCode")
  private String dispatchOrgCode;
  @Field("dispatchOrgName")
  private String dispatchOrgName;
  @Field("platformDispatchUserCode")
  private String platformDispatchUserCode;
  @Field("dispatchUserCode")
  private String dispatchUserCode;
  @Field("dispatchUserFullName")
  private String dispatchUserFullName;
  @Field("platformOriginalConsignOrgCode")
  private String platformOriginalConsignOrgCode;
  @Field("originalConsignOrgCode")
  private String originalConsignOrgCode;
  @Field("originalConsignOrgName")
  private String originalConsignOrgName;
  @Field("platformConsignOrgCode")
  private String platformConsignOrgCode;
  @Field("consignOrgCode")
  private String consignOrgCode;
  @Field("consignOrgName")
  private String consignOrgName;
  @Field("goodsLoss")
  private Double goodsLoss;
  @Field("goodsLossMethod")
  private String goodsLossMethod;
  @Field("goodsLossUnitCode")
  private String goodsLossUnitCode;
  @Field("waybillStatus")
  private String waybillStatus;
  @Field("complianceStatus")
  private String complianceStatus;
  @Field("complianceDescription")
  private String complianceDescription;
  @Field("currentActionCode")
  private String currentActionCode;
  @Field("currentActionName")
  private String currentActionName;
  @Field("upSettleStatus")
  private String upSettleStatus;
  @Field("upSettleTime")
  private Date upSettleTime;
  @Field("downSettleStatus")
  private String downSettleStatus;
  @Field("downSettleTime")
  private Date downSettleTime;
  @Field("settleStatus")
  private String settleStatus;
  @Field("settleMethod")
  private String settleMethod;
  @Field("clientSettleMethod")
  private String clientSettleMethod;
  @Field("settleGoodsLossVolume")
  private Double settleGoodsLossVolume;
  @Field("settleGoodsLossVolumeUnitCode")
  private String settleGoodsLossVolumeUnitCode;
  @Field("settleGoodsLossReasonable")
  private Double settleGoodsLossReasonable;
  @Field("settleGoodsLossReasonableUnitCode")
  private String settleGoodsLossReasonableUnitCode;
  @Field("settleVolume")
  private Double settleVolume;
  @Field("settleVolumeUnitCode")
  private String settleVolumeUnitCode;
  @Field("settleLossDeduction")
  private Double settleLossDeduction;
  @Field("settleClientOrgFreight")
  private Double settleClientOrgFreight;
  @Field("settleDriverFreight")
  private Double settleDriverFreight;
  @Field("settleClientOrgPayee")
  private Double settleClientOrgPayee;
  @Field("settleDriverPayment")
  private Double settleDriverPayment;
  @Field("settlePaymentPayStatus")
  private String settlePaymentPayStatus;
  @Field("settlePaymentApproveStatus")
  private String settlePaymentApproveStatus;
  @Field("settleDriverRealPayment")
  private Double settleDriverRealPayment;
  @Field("settlePaymentSummary")
  private Double settlePaymentSummary;
  @Field("settleRealPayment")
  private Double settleRealPayment;
  @Field("settlePayeeUserCode")
  private String settlePayeeUserCode;
  @Field("settlePayeePlatformUserCode")
  private String settlePayeePlatformUserCode;
  @Field("settlePayeePlatformUserFullname")
  private String settlePayeePlatformUserFullname;
  @Field("settleConfigValue4")
  private Double settleConfigValue4;
  @Field("settleConfigUnitCode4")
  private String settleConfigUnitCode4;
  @Field("settleConfigAmount4")
  private Double settleConfigAmount4;
  @Field("settleTradingConfigValue")
  private Double settleTradingConfigValue;
  @Field("settleTradingConfigUnitCode")
  private String settleTradingConfigUnitCode;
  @Field("settleTradingConfigAmount")
  private Double settleTradingConfigAmount;
  @Field("settleTransportationCost")
  private Double settleTransportationCost;
  @Field("settleGrossProfit")
  private Double settleGrossProfit;
  @Field("settleUserCode")
  private String settleUserCode;
  @Field("settleUserFullName")
  private String settleUserFullName;
  @Field("settleTime")
  private Date settleTime;
  @Field("settleDriverExpense")
  private Double settleDriverExpense;
  @Field("settleViceDriverExpense")
  private Double settleViceDriverExpense;
  @Field("settleClientOrgPayeeCalculated")
  private Double settleClientOrgPayeeCalculated;
  @Field("settleClientOrgPayeeAdjust")
  private Double settleClientOrgPayeeAdjust;
  @Field("settleConfigValue1")
  private Double settleConfigValue1;
  @Field("settleConfigUnitCode1")
  private String settleConfigUnitCode1;
  @Field("settleConfigAmount1")
  private Double settleConfigAmount1;
  @Field("settleConfigValue2")
  private Double settleConfigValue2;
  @Field("settleConfigUnitCode2")
  private String settleConfigUnitCode2;
  @Field("settleConfigAmount2")
  private Double settleConfigAmount2;
  @Field("settleConfigValue3")
  private Double settleConfigValue3;
  @Field("settleConfigUnitCode3")
  private String settleConfigUnitCode3;
  @Field("settleConfigAmount3")
  private Double settleConfigAmount3;
  @Field("toAccountDate")
  private Date toAccountDate;
  @Field("reportStatus")
  private String reportStatus;
  @Field("reportCapitalStatus")
  private String reportCapitalStatus;
  @Field("reportUserCode")
  private String reportUserCode;
  @Field("reportUserFullName")
  private String reportUserFullName;
  @Field("reportTime")
  private Date reportTime;
  @Field("reportBusinessTypeCode")
  private String reportBusinessTypeCode;
  @Field("reportCargoTypeClassificationCode")
  private String reportCargoTypeClassificationCode;
  @Field("consignEvaluation")
  private String consignEvaluation;
  @Field("etcFlag")
  private String etcFlag;

  @Dynamic
  @Field("d_*")
  private Map<String, Object> customDataMap;
  @Field("waybillTag")
  private List<String> waybillTagList;
  @Field("informationFee")
  private Double informationFee;
  @Field("paymentStatus")
  private String paymentStatus;
  @Field("informationFeeSet")
  private String informationFeeSet;
  @Field("offlineReconciliationStatus")
  private String offlineReconciliationStatus;
  @Field("description")
  private String description;
  @Field("disabled")
  private Boolean disabled;
  @Field("deleted")
  private Boolean deleted;
  @Field("moduleCode")
  private String moduleCode;
  @Field("creatorUserCode")
  private String creatorUserCode;
  @Field("creatorUsername")
  private String creatorUsername;
  @Field("createTime")
  private Date createTime;
  @Field("updateUserCode")
  private String updateUserCode;
  @Field("updateUsername")
  private String updateUsername;
  @Field("updateTime")
  private Date updateTime;
  @Field("ip")
  private String ip;
  @Field("operatorLongitude")
  private Double operatorLongitude;
  @Field("operatorLatitude")
  private Double operatorLatitude;
  @Field("ownerUserCode")
  private String ownerUserCode;
  @Field("ownerOrgCode")
  private String ownerOrgCode;
  @Field("ownerOrgName")
  private String ownerOrgName;

  @Field("branchOrgCode")
  private String branchOrgCode;
  @Field("branchOrgName")
  private String branchOrgName;

  public String getEtcFlag() {
    return etcFlag;
  }

  public void setEtcFlag(String etcFlag) {
    this.etcFlag = etcFlag;
  }

  @Field("synchronousId")
  private String synchronousId;

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

  public String getDriverConfirmStatus() {
    return this.driverConfirmStatus;
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

  public String getClientOrgFullName() {
    return this.clientOrgFullName;
  }

  public void setClientOrgFullName(String clientOrgFullName) {
    this.clientOrgFullName = clientOrgFullName;
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

  public String getCarrierOrgFullName() {
    return this.carrierOrgFullName;
  }

  public void setCarrierOrgFullName(String carrierOrgFullName) {
    this.carrierOrgFullName = carrierOrgFullName;
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

  public Double getSettleClientOrgFreight() {
    return this.settleClientOrgFreight;
  }

  public void setSettleClientOrgFreight(Double settleClientOrgFreight) {
    this.settleClientOrgFreight = settleClientOrgFreight;
  }

  public Double getSettleDriverFreight() {
    return this.settleDriverFreight;
  }

  public void setSettleDriverFreight(Double settleDriverFreight) {
    this.settleDriverFreight = settleDriverFreight;
  }

  public Double getSettleClientOrgPayee() {
    return this.settleClientOrgPayee;
  }

  public void setSettleClientOrgPayee(Double settleClientOrgPayee) {
    this.settleClientOrgPayee = settleClientOrgPayee;
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

  public Double getSettleTransportationCost() {
    return this.settleTransportationCost;
  }

  public void setSettleTransportationCost(Double settleTransportationCost) {
    this.settleTransportationCost = settleTransportationCost;
  }

  public Double getSettleGrossProfit() {
    return this.settleGrossProfit;
  }

  public void setSettleGrossProfit(Double settleGrossProfit) {
    this.settleGrossProfit = settleGrossProfit;
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

  public void setConsignEvaluation(String consignEvaluation) {
    this.consignEvaluation = consignEvaluation;
  }

  public String getConsignEvaluation() {
    return this.consignEvaluation;
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

  public String getClientSettleMethod() {
    return this.clientSettleMethod;
  }

  public void setClientSettleMethod(String clientSettleMethod) {
    this.clientSettleMethod = clientSettleMethod;
  }

  public String getCheckStatus() {
    return this.checkStatus;
  }

  public void setCheckStatus(String checkStatus) {
    this.checkStatus = checkStatus;
  }

  public String getBranchOrgCode() {
    return branchOrgCode;
  }

  public void setBranchOrgCode(String branchOrgCode) {
    this.branchOrgCode = branchOrgCode;
  }

  public String getBranchOrgName() {
    return branchOrgName;
  }

  public void setBranchOrgName(String branchOrgName) {
    this.branchOrgName = branchOrgName;
  }
}
