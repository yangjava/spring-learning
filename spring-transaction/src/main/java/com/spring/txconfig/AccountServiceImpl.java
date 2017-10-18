package com.spring.txconfig;

// 业务层实现 
public class AccountServiceImpl implements AccountService {
	// 在Service中注入DAO
	private AccountDAO accountDAO;

	@Override
	public void transfer(final String outAccount, final String inAccount,
			final double money) {
		accountDAO.outMoney(outAccount, money);
		//int d = 1 / 0;
		accountDAO.inMoney(inAccount, money);
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
}
