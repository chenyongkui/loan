package com.cdyy.loan.service.impl;

import com.cdyy.loan.dao.LoanRechargeMapper;
import com.cdyy.loan.dao.RechargeMapper;
import com.cdyy.loan.pojo.po.LoanRechargeExample;
import com.cdyy.loan.pojo.vo.Recharge;
import com.cdyy.loan.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RechargeServiceImpl implements RechargeService {
    @Autowired
    private RechargeMapper rechargeMapper;
    @Autowired
    private LoanRechargeMapper loanRechargeMapper;
    @Override
    public int insertSelective(Recharge recharge) {
        return loanRechargeMapper.insertSelective(recharge);
    }

    @Override
    public int queryByRserial(String rserial) {
        return 0;
    }

    @Override
    public int updateRecharge(Recharge recharge) {
        /*LoanRechargeExample example = new LoanRechargeExample();
        LoanRechargeExample.Criteria criteria = example.createCriteria();
        List list = new ArrayList();
        list.add(recharge.getRid());
        criteria.andRidIn(list);*/
        return rechargeMapper.updateRecharge(recharge);
    }

    @Override
    public List<Recharge> selectRecharge(Map<String,Object> map) {
        List<Recharge> recharges = rechargeMapper.selectRecharge(map);
        return recharges;
    }

    @Override
    public int rechargeCount() {
        return rechargeMapper.rechargeCount();
    }
}
