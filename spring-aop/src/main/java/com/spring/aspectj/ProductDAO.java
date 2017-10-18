package com.spring.aspectj;

/**
 * 被代理对象
 * 
 * @author seawind
 * 
 */
public class ProductDAO {
	public void addProduct() {
		System.out.println("添加商品.....");
		int d = 1 / 0;
	}

	public int deleteProduct() {
		System.out.println("删除商品.....");
		return 10;
	}
}
