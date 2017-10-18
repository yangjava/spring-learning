package com.spring.pointcutadvisor;

/**
 * 订单操作 (被代理对象 )
 * 
 * 
 */
public class OrderDAO {
	public void save() {
		System.out.println("添加订单...");
	}

	public void edit() {
		System.out.println("编辑订单...");
	}

	public void search() {
		System.out.println("查询订单...");
	}

	public void delete() {
		System.out.println("删除订单...");
	}
}
