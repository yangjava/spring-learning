package com.spring.aspectjannotation;

/**
 * 被代理对象
 * 
 * 
 */
public class UserDAO {
	public void save() {
		System.out.println("添加用户 ....");
	}

	public void delete() {
		System.out.println("删除用户....");
	}

	public int update() {
		System.out.println("修改用户....");
		return 1;
	}

	public void search() {
		System.out.println("查询用户....");
		int d = 1 / 0;
	}
}
