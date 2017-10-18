package com.spring.helloworld;

public class HelloWorldService implements IHelloWorld{

	public String info;
	
	@Override
	public void sayHello() {
		System.out.println("Hello World ! "+ info);
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
