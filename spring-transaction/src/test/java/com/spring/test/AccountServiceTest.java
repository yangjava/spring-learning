package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.programing.AccountService;

// 转账测试程序
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-programing.xml")
//@ContextConfiguration(locations = "classpath:spring-transactionproxyfactorybean.xml")
//@ContextConfiguration(locations = "classpath:spring-txannotation.xml")
//@ContextConfiguration(locations = "classpath:spring-txconfig.xml")
public class AccountServiceTest {
	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;

	@Test
	public void testTransfer() {
		accountService.transfer("aaa", "bbb", 100);
	}
}
