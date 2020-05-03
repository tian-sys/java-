package com.aistar.dao.impl;

import com.aistar.dao.EmployeeDao;
import com.aistar.pojo.Employee;
import com.aistar.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public int insert(Employee employee) {
        String sql ="insert into emp values(?,?,?,?,?,?,?,?)";
      Connection connection =  DBConnection.getConnection();
      PreparedStatement pstmt = null;
      int rows = 0;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,employee.getEmpno());
            pstmt.setString(2,employee.getEname());
            pstmt.setString(3,employee.getJob());
            pstmt.setInt(4,employee.getMgr());
            pstmt.setDate(5,  new java.sql.Date( employee.getHiredate().getTime()));   // new java.sql.Date( long ms)  ; java.util.Date.getTime()
            pstmt.setFloat(6,employee.getSalary());
            pstmt.setFloat(7,employee.getComm());
            pstmt.setInt(8,employee.getDeptno());

           rows =  pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(pstmt !=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.closeConnection();
        }


        return rows;
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
        Employee employee = null;
        Connection connection = DBConnection.getConnection();
        String sql = "select empno,ename,job,mgr,hiredate,salary,comm,deptno from emp where empno = ?";
       PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,empno);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                java.util.Date hiredate = rs.getDate(5); // 返回的是java.sql.Date  === > java.util.Date
                float salay = rs.getFloat(6);
                float comm = rs.getFloat(7);
                int deptno = rs.getInt(8);

                employee = new Employee(empno,ename,job,mgr,hiredate,salay,comm,deptno);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs !=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt !=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.closeConnection();
        }


        return employee;
    }

    @Override
    public Employee selectAll(Employee employee) {
        return null;
    }
}
