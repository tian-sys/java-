import com.aistar.pojo.Dept;
import com.aistar.pojo.Employee;
import com.aistar.util.DBConnection;
import org.junit.Test;

import java.sql.*;


/*
    ResultSetMetaData  元数据(元信息) 偏 结构信息
    ResultSet 数据信息


 */
public class TestResultSetMetaData {

    @Test
    public void test() throws SQLException {


        Connection connection =  DBConnection.getConnection();
        PreparedStatement pstmt = null;
//        pstmt = connection.prepareStatement("select deptno,dname,loc from dept where deptno= 20");
        pstmt = connection.prepareStatement("select * from emp where empno = 7788");
        ResultSet rs = pstmt.executeQuery();

        BeanPropertyRowMapper<Employee> rowMapper =  new BeanPropertyRowMapper<>(Employee.class);
        Employee employee =  rowMapper.mapper(rs);
        System.out.println("employee :"+employee);




     /*   BeanPropertyRowMapper<Dept> rowMapper =  new BeanPropertyRowMapper<>(Dept.class);
        Dept dept =  rowMapper.mapper(rs);
        System.out.println("dept :"+dept);*/











/*

        ResultSetMetaData metaData = rs.getMetaData();

        int columnCount = metaData.getColumnCount();  //表中的列数
        String columnName1 = metaData.getColumnName(1);//表中的列名
        String columnName2 = metaData.getColumnName(2);
        String columnName3 = metaData.getColumnName(3);

        String columnTypeName1 = metaData.getColumnTypeName(1); // 表中列的数据类型
        String columnTypeName2 = metaData.getColumnTypeName(2);
        String columnTypeName3 = metaData.getColumnTypeName(3);

        rs.next(); // rs 光标往下移一行
        Object columnValues1 = rs.getObject(1);
        Object columnValues2 = rs.getObject(2);
        Object columnValues3 = rs.getObject(3);


        System.out.println("表中的列数：" + columnCount);
        System.out.println("表中的第1列列名：" + columnName1);
        System.out.println("表中的第2列列名：" + columnName2);
        System.out.println("表中的第3列列名：" + columnName3);
        System.out.println("表中的第1列的值：" + columnValues1);
        System.out.println("表中的第2列的值：" + columnValues2);
        System.out.println("表中的第3列的值：" + columnValues3);

        System.out.println("表中的第1列的数据类型：" + columnTypeName1);
        System.out.println("表中的第2列的数据类型：" + columnTypeName2);
        System.out.println("表中的第3列的数据类型：" + columnTypeName3);
*/




    }

}
