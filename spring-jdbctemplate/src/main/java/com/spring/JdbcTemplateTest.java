package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JdbcTemplateTest {
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Test
	// 使用配置文件
	public void demo2() {
		jdbcTemplate.execute("create table user(id int, name varchar(20))");
	}

	@Test
	// 不使用配置文件，进行jdbctemplate 入门操作
	public void demo1() {
		// 1 构造jdbcTemplate 必须 数据库连接池
		// 内置 连接池 DriverManagerDataSource
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		// 2、使用连接池构造 jdbcTemplate
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		// 3、操作数据库
		jdbcTemplate.execute("create table user(id int, name varchar(20))");
	}
}
