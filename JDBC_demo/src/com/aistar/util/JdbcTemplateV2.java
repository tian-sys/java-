package com.aistar.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateV2<T> {



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


    public T selectForObject(RowMapper<T> rowMapper,String sql,Object... args){  // id， name
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
