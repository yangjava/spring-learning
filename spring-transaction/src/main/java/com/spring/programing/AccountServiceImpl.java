package com.spring.programing;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

// 业务层实现 
public class AccountServiceImpl implements AccountService {
	// 在Service中注入DAO
	private AccountDAO accountDAO;

	// 事务管理模板
	private TransactionTemplate transactionTemplate;

	@Override
	public void transfer(final String outAccount, final String inAccount,
			final double money) {
		// 使用 事务模板 管理事务
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(
					TransactionStatus transactionStatus) {
				accountDAO.outMoney(outAccount, money);
				// int d = 1 / 0;
				accountDAO.inMoney(inAccount, money);
			}
		});
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
}
