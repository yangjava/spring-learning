package com.spring.di;

/**
 * 通过setter方法完成属性注入
 * 
 * 
 */
public class Car2 {
	private String name;
	private double price;
	
	// 注入属性时 只需要提供set方法
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car2 [name=" + name + ", price=" + price + "]";
	}

}
