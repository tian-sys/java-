package com.aistar.dao;

import com.aistar.pojo.Employee;

/**
 * 员工的数据操作
 */
public interface EmployeeDao {


    public int insert(Employee employee);

    public int update(Employee employee);

    public int delete(int empno);

    public Employee selectByPrimaryKey(int empno);

    public Employee selectAll(Employee employee);


}
