package com.rltx.wspay.account.dao;

import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.account.entity.MerchRegisterRecordEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("merchRegisterDao")
public interface MerchRegisterDao {

    void insert(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    void update(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    void updateOpenPay(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    void updateMerchId(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    void updateTradeDeposit(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    void updateCard(@Param("entity") MerchRegisterEntity merchRegisterEntity);

    MerchRegisterEntity selectByMerchUserCode(@Param("merchUserCode") String merchUserCode);

    MerchRegisterEntity selectByCode(@Param("code") String code);

    MerchRegisterEntity selectByMerchId(@Param("merchId") String merchId);

    List<MerchRegisterEntity> selectListByMerchId(@Param("merchId") String merchId);
}
