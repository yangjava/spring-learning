package com.spring.beandefinition;

import org.springframework.stereotype.Service;

/**
 * 使用Spring2.5注解 注册Bean
 * 
 * 
 */
// @Component("helloService")
@Service("helloService")
// <bean id="helloService" class="...." />
public class HelloService {
	public void sayHello() {
		System.out.println("hello, spring annotation!");
	}
}
