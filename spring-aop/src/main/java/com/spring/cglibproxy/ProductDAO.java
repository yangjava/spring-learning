package com.spring.cglibproxy;

/**
 * 商品操作类 (被代理对象)
 * 
 * @author seawind
 * 
 */
public class ProductDAO {
	public void addProduct() {
		System.out.println("添加商品...");
	}

	public void deleteProduct() {
		System.out.println("删除商品...");
	}
}
