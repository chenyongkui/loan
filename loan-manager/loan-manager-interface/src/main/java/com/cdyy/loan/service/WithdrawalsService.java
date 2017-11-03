package com.cdyy.loan.service;

import com.cdyy.loan.pojo.vo.Withdrawals;

import java.util.List;
import java.util.Map;

public interface WithdrawalsService {
    void insertSelective(Withdrawals withdrawals);

    List<Withdrawals> selectWithdrawals(Map<String,Object> map);

    int withdrawalsCount();


}
