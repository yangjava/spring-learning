package com.spring;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试 DAO 增删改查
 * 
 * @author seawind
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDAOTest {
	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;

	@Test
	public void testSave() {
		User user = new User();
		user.setId(200);
		user.setName("张四");

		userDAO.save(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(100);
		user.setName("李四");

		userDAO.update(user);
	}

	@Test
	public void testDelete() {
		User user = new User();
		user.setId(100);

		userDAO.delete(user);
	}

	@Test
	public void testCount() {
		int count = userDAO.count();
		System.out.println(count);
	}

	@Test
	public void testFindNameById() {
		String name = userDAO.findNameById(100);
		System.out.println(name);
	}

	@Test
	public void testFindById() {
		User user = userDAO.findById(100);
		System.out.println(user);
	}

	@Test
	public void testFindAll() {
		List<User> users = userDAO.findAll();
		System.out.println(users);
	}

}
