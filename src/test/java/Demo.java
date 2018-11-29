import com.example.mybatis_spring.mapper.UserMapper;
import com.example.mybatis_spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void testMyBatis_Spring() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = ac.getBean(UserMapper.class);
		User user = userMapper.findUserById(10);
		System.out.println(user);
	}
}