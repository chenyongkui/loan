package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.vo.Recharge;

import java.util.List;
import java.util.Map;

public interface RechargeMapper {
    int updateRecharge(Recharge recharge);

    List<Recharge> selectRecharge(Map<String,Object> map);

    int rechargeCount();
}
