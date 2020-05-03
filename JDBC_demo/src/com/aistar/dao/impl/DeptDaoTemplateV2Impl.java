package com.aistar.dao.impl;

import com.aistar.dao.DeptDao;
import com.aistar.pojo.Dept;
import com.aistar.util.*;

import java.util.List;

public class DeptDaoTemplateV2Impl implements DeptDao {

    JdbcTemplateV2<Dept> jdbcTemplate = new JdbcTemplateV2<>();

    @Override
    public int insert(Dept dept) {
        String sql = "insert into dept values(?,?,?)";
        Object[] args = {dept.getDeptno(),dept.getDname(),dept.getLoc()};
        return  jdbcTemplate.update(sql,args);

    }

    @Override
    public int delete(int deptno) {
        String sql = "delete from dept where deptno = ?";
        Object[] args = {deptno};
        return  jdbcTemplate.update(sql,args);
    }

    @Override
    public int update(Dept dept) {
        String sql = "update dept set dname = ? , loc = ? where deptno = ?";
        Object[] args = {dept.getDname(),dept.getLoc(),dept.getDeptno()};
        return  jdbcTemplate.update(sql,args);
    }

    @Override
    public Dept selectByPrimaryKey(int deptno) {
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<>(Dept.class);
        String sql = "select deptno, dname ,loc from dept  where deptno = ?";
        Object[] args = {deptno};
        return  jdbcTemplate.selectForObject(rowMapper,sql,args);


    }

    @Override
    public List<Dept> selectAll() {
        return null;
    }
}
