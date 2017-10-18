package com.spring.autoproxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.advisor.CustomerDAO;
import com.spring.pointcutadvisor.OrderDAO;

/**
 * 测试自动代理
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-autoproxy1.xml")
public class Autoproxy1 {
	@Autowired
	@Qualifier("customerDAO")
	private CustomerDAO customerDAO;
	@Autowired
	@Qualifier("orderDAO")
	private OrderDAO orderDAO;

	@Test
	public void demo1() {
		customerDAO.add();
		orderDAO.save();
	}

}
