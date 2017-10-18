package com.spring.jdkproxy;

/**
 * 接口实现类 ，被代理目标
 * 
 * 
 */
public class UserDAOImpl implements UserDAO {

	@Override
	public void add() {
		System.out.println("添加用户...");
	}

	@Override
	public void search() {
		System.out.println("查询用户...");
	}

}
