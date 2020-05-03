import com.aistar.dao.DeptDao;
import com.aistar.dao.EmployeeDao;
import com.aistar.dao.impl.DeptDaoImpl;
import com.aistar.dao.impl.EmployeeDaoImpl;
import com.aistar.pojo.Employee;
import org.junit.Test;

import java.util.Date;

public class TestEmpDao {


    EmployeeDao dao =  new EmployeeDaoImpl();

    //添加新员工
    @Test
    public void testInsert(){
        Employee employee = new Employee(8888,"纪娜","项目经理",7788,new Date(),5000,400,10);
        int rows = dao.insert(employee);
        System.out.println(rows);
    }
    //根据主键查询员工
    @Test
    public void testSelectByPK(){

        Employee employee  = dao.selectByPrimaryKey(8888);
        System.out.println(employee);



    }


}
