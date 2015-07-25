package com.jack.spring.c02.helloworld;

public class HelloImpl2 implements HelloApi{
	private String message;
	public HelloImpl2() {
		// TODO Auto-generated constructor stub
		this.message = "Hello";
	}
	public  HelloImpl2(String message) {
		this.message = message;
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
}
