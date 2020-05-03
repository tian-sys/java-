import com.aistar.pojo.Dept;
import com.aistar.util.RowMapper;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestBeanPropertyRowMapper {


    @Test
    public void tedtBeanPropertyRowMapper(){

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

          RowMapper<Dept> m = new BeanPropertyRowMapper<>(Dept.class);
            while(!rs.isLast()){
                dept =  m.mapper(rs);
                deptList.add(dept);

            }


//  System.out.println("查询的部门数据是:" + dept);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
