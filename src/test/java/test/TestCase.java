package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.dao.UserDAO;
import com.ssm.entity.User;

public class TestCase {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
		UserDAO udao = ac.getBean("udao",UserDAO.class);
		User user = new User(57,"test3",25,"男","广西",5000);
		udao.save(user);
	}
	@Test
	public void tes2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
		UserDAO udao = ac.getBean("udao",UserDAO.class);
		User user = udao.findByName("test2");
		System.out.println(user);
	}
	
}
