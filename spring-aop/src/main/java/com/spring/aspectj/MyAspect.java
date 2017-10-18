package com.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

// 切面类 就是 切点和通知 结合
public class MyAspect {
	// 前置增强
	public void before() {
		System.out.println("前置增强....");
	}

	// 后置增强 （返回值）
	public void afterReturing(Object returnVal) {
		System.out.println("后置增强，返回值： " + returnVal);
	}

	// 环绕增强
	public Object around(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("环绕前增强...");
		Object result = proceedingJoinPoint.proceed();
		System.out.println("环绕后增强....");
		return result;
	}

	// 抛出增强
	public void afterThrowing(Throwable ex) {
		System.out.println("发生异常，原因： " + ex.getMessage());
	}

	// 最终通知
	public void after() {
		System.out.println("最终通知....");
	}
}
