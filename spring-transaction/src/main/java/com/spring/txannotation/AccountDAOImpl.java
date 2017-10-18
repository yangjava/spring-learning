package com.spring.txannotation;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

// DAO 实现类
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	@Override
	public void outMoney(String outAccount, double money) {
		String sql = "update account set money = money-? where name = ?";
		this.getJdbcTemplate().update(sql, money, outAccount);
	}

	@Override
	public void inMoney(String inAccount, double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, inAccount);
	}

}
