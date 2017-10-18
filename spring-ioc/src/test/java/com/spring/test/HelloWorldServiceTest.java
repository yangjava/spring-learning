package com.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.helloworld.HelloWorldService;
import com.spring.helloworld.IHelloWorld;

public class HelloWorldServiceTest {

	@Test
	public void testNew(){
		//传统的通过 new 方法创建对象
				HelloWorldService hello=new HelloWorldService();
				// 手动调用 set 方法为 info 进行赋值
				hello.setInfo("spring");
				hello.sayHello();
	}
	
	
	@Test
	public void testIOC(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-helloworldservice.xml");
		// 通过工厂 根据 配置名称 获得实例对象
		IHelloWorld helloWorldService = (IHelloWorld) applicationContext
				.getBean("helloWorldService");
		helloWorldService.sayHello();
	}
	
	@Test
	// 读取工程根目录 下applicationContext.xml
	public void testFileSystemXmlApplicationContext() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"src/main/resources/spring-helloworldservice.xml");
		IHelloWorld helloWorldService = (IHelloWorld) applicationContext
				.getBean("helloWorldService");
		helloWorldService.sayHello();
	}
	
	@Test
	// 使用BeanFactory 加载配置文件，实现工厂
	public void testXmlBeanFactory() {
		// 使用XmlBeanFactory 加载Resource对象 （ClassPathResource 、
		// FileSystemResource）
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"spring-helloworldservice.xml"));
		IHelloWorld helloWorldService = (IHelloWorld) beanFactory
				.getBean("helloWorldService");
		helloWorldService.sayHello();
	}
}
