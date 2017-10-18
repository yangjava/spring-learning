package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collectiondi.CollectionBean;

public class CollectionBeanTest {
	@Test
	// 注入集合类型属性
	public void collectionTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-collectiondi.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext
				.getBean("collectionBean");
		System.out.println(collectionBean);
	}
}
