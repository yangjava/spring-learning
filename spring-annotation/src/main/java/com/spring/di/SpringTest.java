package com.spring.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	// 测试简单属性注入 、复杂对象注入
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserService userService = (UserService) applicationContext
				.getBean("userService");
		System.out.println(userService);
	}
}
