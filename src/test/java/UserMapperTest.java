import com.undefinedchain.project.Application;
import com.undefinedchain.project.dao.EnterpriseMapper;
import com.undefinedchain.project.dao.UserMapper;
import com.undefinedchain.project.model.Enterprise;
import com.undefinedchain.project.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
//import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest(classes = Application.class)
// 这个注解的意义是指定了默认数据源
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    EnterpriseMapper enterpriseMapper;


    @Test
    @Rollback
    public void TestfindUserByPhone() {
        String  phone = "123";
        User user = userMapper.findUserByPhone(phone);
        System.out.println(user.getUname());
        Assert.assertEquals(user.getUname(),"Lwimp");
    }
    @Test
    @Rollback
    public void TestfindEnterByUname() {
        String  uname = "Lwimp";
        Enterprise enter = enterpriseMapper.findEnterByUname(uname);
//        System.out.println(enter.getEname());
//        Assert.assertEquals(enter.getEname(),"test");
    }
}