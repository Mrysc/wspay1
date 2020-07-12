package com.rltx.wspay.pay.service;



import com.rltx.wspay.pay.entity.PaymertRecordEntity;

import java.util.TreeMap;

public interface IPayService {

    TreeMap<String, Object> balancePay(String payerCode, String payeeCode, String totalAmount) throws Exception;
    TreeMap<String,String> openPay(String code) throws Exception;
    TreeMap<String,Object> payConfirm(String code) throws Exception;
    TreeMap<String,String> payQuery(String code) throws Exception;


}
