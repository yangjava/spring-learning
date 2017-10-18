package com.spring.cglibproxy;

import org.junit.Test;

public class CGLibProxyTest {
	@Test
	// 未使用代理
	public void demo1() {
		ProductDAO productDAO = new ProductDAO();
		productDAO.addProduct();
		productDAO.deleteProduct();
	}

	@Test
	// 使用代理
	public void demo2() {
		// 创建被代理对象
		ProductDAO productDAO = new ProductDAO();

		// 创建代理
		MyCglibProxy cglibProxy = new MyCglibProxy(productDAO);
		ProductDAO proxy = cglibProxy.createCglibProxy();

		// 执行代理对象 方法
		proxy.addProduct();
		proxy.deleteProduct();
	}
}
