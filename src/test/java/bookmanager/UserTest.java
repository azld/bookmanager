package bookmanager;

import java.util.Calendar;
//import java.sql.Time;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.tomcat.jni.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bookmanager.model.User;
import com.bookmanager.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
//SpringJUnit4ClassRunner.class
public class UserTest {
	
	private static Logger log = Logger.getLogger(Test.class.getClass());
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setMuserService(UserService auserService) {
		log.debug("222");
		this.userService = auserService;
	}

//	@Test
	public void user_add()
	{
		User auser = new User();
		auser.userRandom();
		userService.insert(auser);
		System.out.println("user add end");
	}
	
//	@Test
	public void user_select() 
	{
		long user_id = 2;
		User auser = this.userService.getUser(user_id);
		System.out.println(auser.userInfo());
	}
	
//	@Test
	public void user_all()
	{
		List<User> users = userService.getAllUser();
		for(int i = 0; i < users.size(); i++)
		{
			User user = users.get(i);
			System.out.println(user.userInfo());
		}
	}
	
	@Test
	public void user_delete()
	{
		List<User> users = userService.getAllUser();
		int index = users.size() -1;
		User auser = users.get(index);
		System.out.println(auser.userInfo());
		this.userService.delete(auser.getUserId());
	}
}
