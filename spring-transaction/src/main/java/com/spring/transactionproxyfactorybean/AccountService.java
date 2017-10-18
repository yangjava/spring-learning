package com.spring.transactionproxyfactorybean;

// 账户管理
public interface AccountService {
	/**
	 * 
	 * 转账
	 * 
	 * @param outAccount
	 *            转出账户
	 * @param inAccount
	 *            转入账户
	 * @param money
	 *            金额
	 */
	public void transfer(String outAccount, String inAccount, double money);
}
