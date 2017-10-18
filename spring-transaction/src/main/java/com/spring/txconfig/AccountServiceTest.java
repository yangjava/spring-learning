package com.spring.txconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 转账测试程序
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-txconfig.xml")
public class AccountServiceTest {
	@Autowired
	@Qualifier("accountService")
	// 注入代理对象
	private AccountService accountService;

	@Test
	public void testTransfer() {
		accountService.transfer("aaa", "bbb", 200);
	}
}
