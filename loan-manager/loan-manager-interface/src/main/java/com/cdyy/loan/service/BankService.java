package com.cdyy.loan.service;

import com.cdyy.loan.pojo.vo.Bank;

import java.util.List;

public interface BankService {
    List<Bank> queryByUid(Long uid);
}
