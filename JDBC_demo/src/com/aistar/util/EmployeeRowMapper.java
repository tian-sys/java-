package com.aistar.util;

import com.aistar.pojo.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapper(ResultSet rs) {
        Employee employee = null;
        try{
            if(rs.next()){
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                java.util.Date hiredate = rs.getDate(5);
                float salay = rs.getFloat(6);
                float comm = rs.getFloat(7);
                int deptno = rs.getInt(8);

                employee = new Employee(empno,ename,job,mgr,hiredate,salay,comm,deptno);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return employee;
    }
}
