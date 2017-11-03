package com.cdyy.loan.service.impl;

import com.cdyy.loan.dao.CapitalMapper;
import com.cdyy.loan.dao.LoanCapitalMapper;
import com.cdyy.loan.pojo.po.LoanCapital;
import com.cdyy.loan.pojo.po.LoanCapitalExample;
import com.cdyy.loan.pojo.vo.Capital;
import com.cdyy.loan.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CapitalServiceImpl implements CapitalService {
    @Autowired
    private LoanCapitalMapper loanCapitalMapper;
    @Autowired
    private CapitalMapper capitalMapper;
    @Override
    public Capital selectByCapital(Long uid) {

        Capital Capital =  capitalMapper.selectByUId(uid);
        return Capital;
    }

    @Override
    public void updateCapital(Capital capital) {
       /* LoanCapitalExample example = new LoanCapitalExample();
        LoanCapitalExample.Criteria criteria = example.createCriteria();
        List list = new ArrayList();
        list.add(capital.getCid());
        criteria.andCidIn(list);*/
         capitalMapper.updateCapital(capital);
    }

    @Override
    public void insertSelective(Capital capital) {
        loanCapitalMapper.insert(capital);
    }


}
