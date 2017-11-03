package com.cdyy.loan.service.impl;

import com.cdyy.loan.dao.BankMapper;
import com.cdyy.loan.pojo.vo.Bank;
import com.cdyy.loan.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankMapper bankMapper;

    @Override
    public List<Bank> queryByUid(Long uid) {
        List<Bank> bank =  bankMapper.queryByUid(uid);
        return bank;
    }
}
