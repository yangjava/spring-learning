package com.spring.beandefinition;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	// 测试 注解Bean 注册
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext
				.getBean("helloService");
		helloService.sayHello();
	}
}
