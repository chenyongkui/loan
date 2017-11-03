package com.cdyy.loan.service.impl;

import com.cdyy.loan.dao.LoanWithdrawalsMapper;
import com.cdyy.loan.dao.WithdrawalsMapper;
import com.cdyy.loan.pojo.vo.Withdrawals;
import com.cdyy.loan.service.WithdrawalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WithdrawalsServiceImpl implements WithdrawalsService {

    @Autowired
    private LoanWithdrawalsMapper loanWithdrawalsMapper;
    @Autowired
    private WithdrawalsMapper withdrawalsMapper;
    @Override
    public void insertSelective(Withdrawals withdrawals) {
        loanWithdrawalsMapper.insertSelective(withdrawals);
    }

    @Override
    public List<Withdrawals> selectWithdrawals(Map<String,Object> map) {
        List<Withdrawals> withdrawals =  withdrawalsMapper.selectWithdrawals(map);
        return withdrawals;
    }

    @Override
    public int withdrawalsCount() {

        return withdrawalsMapper.withdrawalsCount();
    }


}
