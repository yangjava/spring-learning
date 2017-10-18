package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.advisor.CustomerDAO;

/**
 * 测试 不带有切点的切面
 * 
 * 
 */
// 整合junit测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-advisor.xml")
public class AdvisorTest {
	// 对测试对象进行自动注入
	@Autowired
	@Qualifier("customerDAOProxy")
	// 注入代理后的对象
	private CustomerDAO customerDAO;

	@Test
	public void demo1() {
		customerDAO.add();
		customerDAO.delete();
		customerDAO.search();
		customerDAO.update();
	}
}
