package servcie;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import bean.user;
import service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserServcie {


	private static final Logger LOGGER = Logger
			.getLogger(TestUserServcie.class);
	@Autowired
	UserService userService;
	
	@Test
	public void testQueryAll() {
		List<user> userInfos = userService.getUserList();
		LOGGER.info(JSON.toJSON(userInfos));
	}
}
