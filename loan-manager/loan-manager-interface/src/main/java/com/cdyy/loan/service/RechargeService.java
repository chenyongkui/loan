package com.cdyy.loan.service;


import com.cdyy.loan.pojo.vo.Recharge;

import java.util.List;
import java.util.Map;

public interface RechargeService {
    int insertSelective(Recharge recharge);

    int queryByRserial(String rserial);

    int updateRecharge(Recharge recharge);

    List<Recharge> selectRecharge(Map<String,Object> map);

    int rechargeCount();
}
