package com.rltx.wspay.constant;

import java.util.List;

/**
 * Created by jingzhu.zr on 2017/8/15.
 */
public enum DeniedPayToolEnum {
  CreditCard("02", "credit"),
  Huabei("03", "pcrdeit")
  ;

  private String toolCode;
  private String toolDesc;

  DeniedPayToolEnum(String toolCode, String toolDesc) {
    this.toolCode = toolCode;
    this.toolDesc = toolDesc;
  }

  public String getToolCode() {
    return toolCode;
  }

  public void setToolCode(String toolCode) {
    this.toolCode = toolCode;
  }

  public String getToolDesc() {
    return toolDesc;
  }

  public void setToolDesc(String toolDesc) {
    this.toolDesc = toolDesc;
  }

  public static String genDenniedPayToolList(List<DeniedPayToolEnum> list){
    StringBuilder sb = new StringBuilder();

    for(DeniedPayToolEnum e: list){
      sb.append(e.getToolCode());
      sb.append(",");
    }

   
    
    String rst = sb.toString();
    return rst.length() > 0 ? rst.substring(0, rst.length()): rst;
  }
  
  public static String genDenniedPayToolList2(List<DeniedPayToolEnum> list) {
	  StringBuilder sb = new StringBuilder();

	    for(DeniedPayToolEnum e: list){
	      sb.append(e.getToolDesc());
	      sb.append(",");
	    }
	    String rst = sb.toString();
	    return rst.length() > 0 ? rst.substring(0, rst.length()): rst;
  }
  
}
