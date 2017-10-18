package com.spring.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 代理
 * 
 * 
 */
public class MyJDKProxy implements InvocationHandler {
	private UserDAO userDAO;// 被代理对象

	// 通过被代理对象 构造 代理类对象
	public MyJDKProxy(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * 使用JDK进行 动态代理
	 * 
	 * @param userDAO
	 *            被代理对象
	 * @return
	 */
	public UserDAO createJDKProxy() {
		return (UserDAO) Proxy.newProxyInstance(userDAO.getClass()
				.getClassLoader(), userDAO.getClass().getInterfaces(), this);
	}

	@Override
	// 访问被代理对象 任何方法，都和执行 invoke
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 针对 add 方法进行 增强，记录日志 ...
		if (method.getName().equals("add")) {// 如果访问方法 是 add方法
			System.out.println("记录日志....");
			// 调用目标方法
			return method.invoke(userDAO, args);
		} else {
			// 其它方法
			return method.invoke(userDAO, args);
		}
	}
}
