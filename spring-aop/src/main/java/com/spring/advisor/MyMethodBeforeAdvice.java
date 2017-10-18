package com.spring.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 自定义前置增强
 * 
 * 
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	/**
	 * method 目标方法
	 * args  参数
	 * target 目标对象
	 */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out
				.println("前置增强 ===============================================");
	}

}
