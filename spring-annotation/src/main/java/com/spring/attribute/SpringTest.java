package com.spring.attribute;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	// 测试初始化和销毁
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		LifeCycleBean lifeCycleBean = (LifeCycleBean) applicationContext
				.getBean("lifeBean");
		System.out.println(lifeCycleBean);

		// 销毁方法执行，必须销毁ApplicationContext
		applicationContext.close();
	}

	@Test
	// 测试Bean 范围
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ScopeBean scopeBean = (ScopeBean) applicationContext
				.getBean("scopeBean");
		System.out.println(scopeBean);
		ScopeBean scopeBean2 = (ScopeBean) applicationContext
				.getBean("scopeBean");
		System.out.println(scopeBean2);
	}
}
