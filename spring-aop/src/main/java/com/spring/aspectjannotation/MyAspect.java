package com.spring.aspectjannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 自定义切面类
 * 
 * 
 */
@Aspect
// 声明当前类是一个切面类
public class MyAspect {
	// 前置增强
	@Before("execution(* com.spring.aspectjannotation.UserDAO.save(..))")
	public void before1() {
		System.out.println("前置增强 1 ...");
	}

	@Before("execution(* com.spring.aspectjannotation.UserDAO.delete(..))")
	public void before2(JoinPoint joinpoint) {
		System.out.println("前置增强2 ..." + joinpoint.toString());
	}

	// 后置增强
	@AfterReturning(value = "execution(* com.spring.aspectjannotation.UserDAO.update(..))", returning = "returnValue")
	// returnValue 是代理方法 ，参数名， 用来获得目标业务方法执行后返回值
	public void afterReturning(Object returnValue) {
		System.out.println("后置增强.... 获得方法返回值：" + returnValue);
	}

	// 环绕增强
	@Around("MyAspect.mypointcut()")
	// 可以阻止目标方法执行，通过参数
	public Object around(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("环绕前增强...");
		Object result = proceedingJoinPoint.proceed();// 执行目标方法
		System.out.println("环绕后增强...");
		return result;
	}

	// 抛出增强
	@AfterThrowing(value = "MyAspect.mypointcut()", throwing = "e")
	// throwing 用来指定异常对象 参数名称
	public void afterThrowing(Throwable e) {
		System.out.println("不好了，出问题了, " + e.getMessage());
	}

	// 最终增强 ，无论目标方法是否有异常，都必须执行
	@After("MyAspect.mypointcut()")
	public void after() {
		System.out.println("这是必须执行的代码 .....");
	}

	// 切点定义
	@Pointcut("execution(* com.spring.aspectjannotation.UserDAO.search(..))")
	// 方法名就是切点名
	private void mypointcut() {
	}
}
