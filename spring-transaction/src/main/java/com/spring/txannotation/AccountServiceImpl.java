package com.spring.txannotation;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

// 业务层实现 
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false, noRollbackFor = ArithmeticException.class, rollbackFor = NullPointerException.class, timeout = -1)
public class AccountServiceImpl implements AccountService {
	// 在Service中注入DAO
	private AccountDAO accountDAO;

	@Override
	public void transfer(final String outAccount, final String inAccount,
			final double money) {
		accountDAO.outMoney(outAccount, money);
		int d = 1 / 0;
		accountDAO.inMoney(inAccount, money);
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
}
