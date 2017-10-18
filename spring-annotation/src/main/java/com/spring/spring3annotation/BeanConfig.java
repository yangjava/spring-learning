package com.spring.spring3annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置Bean （工厂）
 * 
 * 
 */
@Configuration
public class BeanConfig {
	// 提供两个方法 获得Car和Product对象
	@Bean(name = "car")
	public Car initCar() {
		Car car = new Car();
		car.setName("大众");
		car.setPrice(10000);
		return car;
	}

	@Bean(name = "product")
	public Product showProduct() {
		Product product = new Product();
		product.setPname("空调");
		product.setPnum(100);
		return product;
	}
}
