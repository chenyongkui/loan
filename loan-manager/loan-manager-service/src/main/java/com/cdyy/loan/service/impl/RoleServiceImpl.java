package com.cdyy.loan.service.impl;

import com.cdyy.common.dto.Order;
import com.cdyy.common.dto.Page;
import com.cdyy.common.dto.Result;
import com.cdyy.common.utils.IDUtils;
import com.cdyy.loan.dao.LoanSysroleMapper;
import com.cdyy.loan.dao.RoleMapper;
import com.cdyy.loan.pojo.po.LoanSysrole;
import com.cdyy.loan.pojo.po.LoanSysroleExample;
import com.cdyy.loan.pojo.vo.Role;
import com.cdyy.loan.pojo.vo.RoleQuery;
import com.cdyy.loan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private LoanSysroleMapper loanSysroleMapper;


    //分页
    @Override
    public Result<Role> listRole(Page page, Order order, RoleQuery query) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("page", page);
        map.put("order", order);
        map.put("query",query);
        //通过loanSysroleMapper查询出total，查询所有商品数量，没有附加条件
        long total = roleMapper.countRoles(map);
        List<Role> rows =  roleMapper.listRolesByPage(map);
        Result<Role> rs = new Result<Role>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }
    //删除
    @Override
    public int updateRolesByIds3(List<Long> ids) {
        //创建商品的空对象
        LoanSysrole loanSysrole = new LoanSysrole();
        loanSysrole.setRolestate(3);

        //下面的三行只是准备查询的条件
        LoanSysroleExample example = new LoanSysroleExample();

        LoanSysroleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidIn(ids);
        //真正的执行查询
        return loanSysroleMapper.updateByExampleSelective(loanSysrole,example);

    }
    //冻结
    @Override
    public int updateRolesByIds2(List<Long> ids) {
        //创建商品的空对象
        LoanSysrole loanSysrole = new LoanSysrole();
        loanSysrole.setRolestate(2);

        //下面的三行只是准备查询的条件
        LoanSysroleExample example = new LoanSysroleExample();

        LoanSysroleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidIn(ids);
        //真正的执行查询
        return loanSysroleMapper.updateByExampleSelective(loanSysrole,example);

    }
    //解冻
    @Override
    public int updateRolesByIds1(List<Long> ids) {
        //创建商品的空对象
        LoanSysrole loanSysrole = new LoanSysrole();
        loanSysrole.setRolestate(1);

        //下面的三行只是准备查询的条件
        LoanSysroleExample example = new LoanSysroleExample();

        LoanSysroleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidIn(ids);
        //真正的执行查询
        return loanSysroleMapper.updateByExampleSelective(loanSysrole,example);

    }
    //添加
    //@Transactional注解后表示这是一个事务方法，事务方法不是越多越好，平常使用查询方法不需要添加此注解
    @Transactional
    @Override
    public int saveRole(LoanSysrole loanSysrole) {
        //通过工具类获取到ID
        int count = 0;
        long roleid =IDUtils.getItemId();
        loanSysrole.setRoleid(roleid);
        String mess = checkRole(loanSysrole.getRolename());
        if(mess=="1") {
              count = loanSysroleMapper.insert(loanSysrole);
        }
        return count;
    }
    //查找对象
    @Override
    public LoanSysrole selectRoleById(long roleid) {
       LoanSysrole loanSysrole =  loanSysroleMapper.selectByPrimaryKey(roleid);

        return loanSysrole;
    }

    @Override
    public void updateRole(LoanSysrole loanSysrole) {

        long roleid = loanSysrole.getRoleid();
        List<Long> list = new ArrayList<>();
        list.add(roleid);
        LoanSysroleExample example = new LoanSysroleExample();

        LoanSysroleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidIn(list);
        loanSysroleMapper.updateByExampleSelective(loanSysrole,example);
    }

    @Override
    public String checkRole(String rolename) {
        String mess = null;
        Role findRole = roleMapper.selectByName(rolename);
        if(findRole==null) {
            mess="1";
        }else {
            mess="2";
        }
        return mess;
    }

    @Override
    public String roleCheck(String rolename,String rpassword) {
        String mess = null;
        if(rolename==null||rpassword==null ||"".equals(rpassword)||"".equals(rolename)){
            mess="3";
        }else {
            Role findRole = roleMapper.selectByName(rolename);
            if(findRole!=null) {
                if(rpassword.equals(rpassword)) {
                    mess = "1";
                    //session.setAttribute("sessionUser", findUser);
                }else {
                    mess = "2";
                }
            }else {
                mess = "2";
            }
        }
        return mess;
    }





}
