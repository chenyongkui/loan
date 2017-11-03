package com.cdyy.loan.service;

import com.cdyy.loan.pojo.po.LoanCapital;
import com.cdyy.loan.pojo.vo.Capital;

public interface CapitalService {
    Capital selectByCapital(Long uid);

    void updateCapital(Capital capital);

    void insertSelective(Capital capital);
}
