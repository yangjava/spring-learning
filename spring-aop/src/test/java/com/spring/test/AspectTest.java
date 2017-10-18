package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.aspectj.ProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aspectj.xml")
public class AspectTest {
	@Autowired
	@Qualifier("productDAO")
	private ProductDAO productDAO;

	@Test
	public void demo1() {
		productDAO.addProduct();
		productDAO.deleteProduct();
	}
}
