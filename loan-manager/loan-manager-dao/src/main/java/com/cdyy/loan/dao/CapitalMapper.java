package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.vo.Capital;

public interface CapitalMapper {
    Capital selectByUId(Long uid);

    void updateCapital(Capital capital);
}
