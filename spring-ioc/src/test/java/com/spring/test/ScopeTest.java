package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.scope.Product;

public class ScopeTest {
	@Test
	// 通过scope属性指定 Bean 实例范围
	public void demo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-scope.xml");
		Product product = (Product) applicationContext.getBean("product");
		System.out.println(product);
		Product product2 = (Product) applicationContext.getBean("product");
		System.out.println(product2);
	}
}
