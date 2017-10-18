package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.aspectjannotation.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aspectjannotation.xml")
public class AspectAnnotationTest {
	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;

	@Test
	public void demo() {
		userDAO.save();
		userDAO.delete();
		userDAO.update();
		userDAO.search();
	}
}
