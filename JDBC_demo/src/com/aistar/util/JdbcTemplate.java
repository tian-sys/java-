package com.aistar.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplate<T> {

    private RowMapper<T> rowMapper;
    public JdbcTemplate(RowMapper<T> rowMapper){  //  new DeptRowMapper();    new EmployeeRowMapper();
        this.rowMapper = rowMapper;
    }

    // 模块的insert,update,delete
    public int update(String sql,Object... args){   // sql: insert ,update,delete
        Connection connection = DBConnection.getConnection();
        PreparedStatement pstmt =  null;

        int rows = 0;


        try {
            pstmt = connection.prepareStatement(sql);
            for(int i =0;i<args.length;i++){
                pstmt.setObject(i+1,args[i]);
            }

            rows = pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(pstmt!=null) {
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


    public T selectForObject(String sql,Object... args){  // id， name
        T t = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement pstmt =  null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(sql);
            for(int i =0;i<args.length;i++){
                pstmt.setObject(i+1,args[i]);
            }

            rs =  pstmt.executeQuery();

            // String sql = select deptno,dname,loc from dept where deptno = ?,
            //String sql = "select empno,ename,job,mgr,hiredate,salary,comm,deptno from emp where empno = ?";

          // rs 遍历 每列 ===> 封装成 T
            //(1) 数据库表中列  ----  java 对象中的属性
            //(2) new T(....)
          //  RowMapper<T> rowMapper = null;//???  new DeptRowMapper();    new EmployeeRowMapper();
            t= rowMapper.mapper(rs);




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


        return  t;
    }

    public List<T> selectForList(Object args){
        return null;
    }

}
