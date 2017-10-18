package com.spring.attribute;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("lifeBean")
public class LifeCycleBean {
	@PostConstruct
	public void setup() {
		System.out.println("初始化...");
	}

	@PreDestroy
	public void teardown() {
		System.out.println("销毁...");
	}
}
