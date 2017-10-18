package com.spring.pointcutadvisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PointcutadvisorTest {
	// 注入代理对象
	@Autowired
	@Qualifier("orderDAOProxy")
	private OrderDAO orderDAO;

	@Test
	public void demo1() {
		orderDAO.save();
		orderDAO.delete();
		orderDAO.edit();
		orderDAO.search();
	}
}
