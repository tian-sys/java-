import com.aistar.dao.DeptDao;
import com.aistar.dao.impl.DeptDaoTemplateImpl;
import com.aistar.pojo.Dept;
import org.junit.Test;

public class TestTemplate {

    @Test
    public void insertDept(){
        DeptDao dao = new DeptDaoTemplateImpl();
        int rows = dao.insert(new Dept(87,"采购部门","杭州"));
        System.out.println(rows);
    }

    @Test
    public void selectByPKDept(){
        DeptDao dao = new DeptDaoTemplateImpl();
        Dept  dept = dao.selectByPrimaryKey(87);
        System.out.println(dept);
    }
}
