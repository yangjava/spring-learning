package com.spring.spring3annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	// 获得配置Bean 工厂创建Bean对象
	public void demo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);

		Product product = (Product) applicationContext.getBean("product");
		System.out.println(product);
	}
}
