package com.spring.pointcutadvisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自定义环绕增强
 * 
 * 
 */
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	// 进行增强方法， methodInvocation 调用目标方法
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("环绕增强 方法前增强...");
		Object result = methodInvocation.proceed();// 目标方法执行
		System.out.println("环绕增强 方法后增强...");
		return result;
	}

}
