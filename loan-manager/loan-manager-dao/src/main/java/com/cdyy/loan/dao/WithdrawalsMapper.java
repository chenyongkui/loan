package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.vo.Withdrawals;

import java.util.List;
import java.util.Map;

public interface WithdrawalsMapper {
    List<Withdrawals> selectWithdrawals(Map<String,Object> map);

    int withdrawalsCount();
}
