package com.spring.instance;

/**
 * Bean3的工厂
 * 
 * 
 */
public class Bean3Factory {
	public Bean3Factory() {
		System.out.println("创建Bean3工厂对象...");
	}

	// 先创建 Bean3Factory实例，再调用 getBean3
	public Bean3 getBean3() {
		System.out.println("实例工厂方法....");
		return new Bean3();
	}
}
