package com.spring.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 自定义 CGLIB 代理类
 * 
 * @author seawind
 * 
 */
public class MyCglibProxy implements MethodInterceptor {

	// 目标对象
	private ProductDAO productDAO;

	// 通过构造器 传入被代理对象
	public MyCglibProxy(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	// 创建代理
	public ProductDAO createCglibProxy() {
		// 创建代理核心对象
		Enhancer enhancer = new Enhancer();
		// 设置被代理类 （为类创建子类）
		enhancer.setSuperclass(productDAO.getClass());

		// 设置回调函数
		enhancer.setCallback(this);

		// 返回代理 (返回代理子类对象)
		return (ProductDAO) enhancer.create();
	}

	@Override
	// 被代理对象所有方法执行 ，都会调用 intercept 方法
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		// 为 addProduct 计算运算时间
		if (method.getName().equals("addProduct")) {// 当前执行方法
			long start = System.currentTimeMillis();
			Object result = methodProxy.invokeSuper(proxy, args);
			long end = System.currentTimeMillis();
			System.out.println("addProduct方法运行时间 : " + (end - start));
			return result;
		} else {
			// 不进行增强
			return methodProxy.invokeSuper(proxy, args);
		}
	}

}
