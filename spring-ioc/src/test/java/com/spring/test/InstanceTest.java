package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.instance.Bean1;
import com.spring.instance.Bean2;
import com.spring.instance.Bean3;

public class InstanceTest {
	@Test
	// 实例化Bean1
	public void demo1() {
		// 加载配置文件 ，创建工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-instance.xml");
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
	}

	@Test
	// 实例化Bean2
	public void demo2() {
		// 加载配置文件 ，创建工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-instance.xml");
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
	}

	@Test
	// 实例化Bean3
	public void demo3() {
		// 加载配置文件 ，创建工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-instance.xml");
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);
	}
}
