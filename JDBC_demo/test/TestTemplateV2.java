import com.aistar.dao.DeptDao;
import com.aistar.dao.impl.DeptDaoTemplateImpl;
import com.aistar.dao.impl.DeptDaoTemplateV2Impl;
import com.aistar.pojo.Dept;
import org.junit.Test;

public class TestTemplateV2 {

    @Test
    public void selectByPKDept(){
        DeptDao dao = new DeptDaoTemplateV2Impl();
        Dept dept = dao.selectByPrimaryKey(87);
        System.out.println(dept);
    }
}
