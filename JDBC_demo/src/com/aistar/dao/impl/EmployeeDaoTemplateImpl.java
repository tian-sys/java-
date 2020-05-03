package com.aistar.dao.impl;

import com.aistar.dao.EmployeeDao;
import com.aistar.pojo.Dept;
import com.aistar.pojo.Employee;
import com.aistar.util.EmployeeRowMapper;
import com.aistar.util.JdbcTemplate;

public class EmployeeDaoTemplateImpl implements EmployeeDao {

    JdbcTemplate<Employee> jdbcTemplate = new JdbcTemplate<>(new EmployeeRowMapper());

    @Override
    public int insert(Employee employee) {
        String sql ="insert into emp values(?,?,?,?,?,?,?,?)";
        java.sql.Date hiredate = new java.sql.Date(employee.getHiredate().getTime());
        Object[] args = {employee.getEmpno(),employee.getEname(),employee.getJob(),
                        employee.getMgr(), hiredate,employee.getSalary(),
                        employee.getComm(),employee.getDeptno()};
        return  jdbcTemplate.update(sql,args);
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public int delete(int empno) {
        return 0;
    }

    @Override
    public Employee selectByPrimaryKey(int empno) {
        return null;
    }

    @Override
    public Employee selectAll(Employee employee) {
        return null;
    }
}
