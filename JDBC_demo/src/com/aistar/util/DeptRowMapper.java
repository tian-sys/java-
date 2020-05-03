package com.aistar.util;

import com.aistar.pojo.Dept;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 将部门表中的行记录 映射成 部门Dept对象
 */
public class DeptRowMapper implements RowMapper<Dept> {
    @Override
    public Dept mapper(ResultSet rs) {
        Dept dept = null;
        try {
            if(rs.next()){
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String location = rs.getString(3);
                dept =  new Dept(deptno,dname,location);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return dept;
    }
}
