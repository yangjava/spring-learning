package com.spring.test;

import org.junit.Test;

import com.spring.jdkproxy.MyJDKProxy;
import com.spring.jdkproxy.UserDAO;
import com.spring.jdkproxy.UserDAOImpl;

public class JDKProxyTest {
	@Test
	// 代理前操作
	public void demo1() {
		// 没有代理
		UserDAO userDAO = new UserDAOImpl();
		userDAO.add();
		userDAO.search();
	}

	@Test
	// 测试JDK动态代理
	public void demo2() {
		// 被代理对象
		UserDAO userDAO = new UserDAOImpl();
		// 创建代理
		MyJDKProxy jdkProxy = new MyJDKProxy(userDAO);
		UserDAO proxy = jdkProxy.createJDKProxy();

		// 执行代理对象方法
		proxy.add();
		proxy.search();
	}
}
