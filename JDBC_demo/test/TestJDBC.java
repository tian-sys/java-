import com.aistar.dao.DeptDao;
import com.aistar.dao.impl.DeptDaoImpl;
import com.aistar.pojo.Dept;
import com.aistar.util.DBConnection;
import com.aistar.util.DataScourceUtil;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TestJDBC {


    /*
     JDBC 编程步骤

    * (1) 加载数据库驱动类 driver
    * (2) 连接数据库
    *
    * (3) 执行SQL
    * (4) 获得执行结果
    * (5) 封装成对象
    * (6) 关闭数据库连接
    *
    *
    */

    @Test
    public void fun(){
        System.out.println((int)('a'-'A'));
    }


    @Test
    public void tedtJdbc(){

//      1. 加载数据库驱动类 driver  (java - mysql )
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//      2. 连接数据库
        String url = "jdbc:mysql://localhost:3306/empdb?characterencoding=utf8";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(url,username,password );
            System.out.println(connection + ",连接成功");

        } catch (SQLException e) {
            e.printStackTrace();
        }


//        3. 执行SQL语句
        String sql = "select deptno,dname,loc from dept ";
        Statement stmt  = null;   // 用于执行静态SQL语句
        ResultSet rs = null;
        Dept dept = null;
        List<Dept> deptList = new ArrayList<>();
        try {

            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql); // select  ， stmt.executeUpdate()  // insert update delete DDL

            while(rs.next()){
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String location = rs.getString(3);
                deptList.add(new Dept(deptno,dname,location));


                System.out.println("第几条记录:" + rs.getRow());

            }

           ResultSetMetaData rsmd =  rs.getMetaData();
           int columnCount =  rsmd.getColumnCount();
            for(int i =1;i<=columnCount;i++){
                String columnName = rsmd.getColumnName(i);
                System.out.print("第"+i +"列的列名录:" +columnName);
                System.out.print(",第"+i +"列的数据类型:" +rsmd.getColumnTypeName(i));

            }









        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   // 释放资源，节省内存
            if(rs !=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }




    @Test
    public void testConnection(){

        System.out.println(DBConnection.getConnection());
    }


    @Test
    public void testSelectByPrimaryKet(){
        DeptDao dao =  new DeptDaoImpl();
       Dept dept =  dao.selectByPrimaryKey(10);
        System.out.println(dept);
    }

    @Test
    public void testProperties(){
        Properties properties = new Properties();
        InputStream is = null;
        try {
          is =  new FileInputStream(System.getProperty("user.dir") + "/src/com/aistar/config/db_config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( properties.getProperty("url"));

    }

    @Test
    public void testGetUrl() {
        System.out.println(DataScourceUtil.getUrl());
    }


    @Test
    public void testInsert(){
        DeptDao dao =  new DeptDaoImpl();
        int rows = dao.insert(new Dept(99,"销售部","苏州"));
        System.out.println(rows);
    }



}
