package com.spring.advisor;

/**
 * 实现类
 * 
 * @author seawind
 * 
 */
public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void add() {
		System.out.println("客户添加....");
	}

	@Override
	public void search() {
		System.out.println("客户查询....");
	}

	@Override
	public void update() {
		System.out.println("客户修改....");
	}

	@Override
	public void delete() {
		System.out.println("客户删除....");
	}

}
