package com.spring.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 用户业务层
 * 
 * 
 */
@Service("userService")
public class UserService {
	// 注入name属性
	@Value("yangjing")
	// 简单属性
	private String name;

	// @Autowired(required = false)
	// 默认required是true，注入不成功就会报错
	// @Qualifier("userDAO")
	// 复杂对象
	@Resource(name = "userDAO")
	private UserDAO userDAO;

	@Override
	public String toString() {
		return "UserService [name=" + name + ", userDAO=" + userDAO + "]";
	}

}
