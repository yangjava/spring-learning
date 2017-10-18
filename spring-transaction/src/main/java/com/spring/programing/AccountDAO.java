package com.spring.programing;

// 账户管理数据层
public interface AccountDAO {
	/**
	 * 转出
	 * 
	 * @param outAccount
	 *            转出账户
	 * @param money
	 *            金额
	 */
	public void outMoney(String outAccount, double money);

	/**
	 * 转入
	 * 
	 * @param inAccount
	 *            转入账户
	 * @param money
	 *            金额
	 */
	public void inMoney(String inAccount, double money);
}
