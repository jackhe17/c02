package com.jack.spring.c02.helloworld;

public class HelloImpl3 implements HelloApi{
	String message;
	int index;
	
	public  HelloImpl3(String message,int index) {
		// TODO Auto-generated constructor stub
		this.message=message;
		this.index=index;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(message+index);
	}
	
}
