package com.jack.spring.c02.helloworld;

public class HelloImpl4 implements HelloApi{
	private String message;
	private int index;

	// setter·½·¨
	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}
}
