package com.cdyy.loan.dao;

import com.cdyy.loan.pojo.vo.Bank;

import java.util.List;

public interface BankMapper {
    List<Bank> queryByUid(Long uid);

}
