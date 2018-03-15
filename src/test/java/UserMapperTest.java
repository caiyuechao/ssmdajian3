import com.axjy.mapper.UserMapper;
import com.axjy.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/3/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Resource
    private UserMapper mapper;
    @Test
    public void ceshi(){
        User user=mapper.find("liming","0000000");
        System.out.println(user.getAddress()+user.getPhone());
    }

}
