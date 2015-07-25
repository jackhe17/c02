package com.jack.spring.c02.helloworld;

public class HelloApiInstanceFactory {
	public HelloApi newInstance(String message){
		return new HelloImpl2(message);
	}
}
