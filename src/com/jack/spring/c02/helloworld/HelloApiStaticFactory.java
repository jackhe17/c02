package com.jack.spring.c02.helloworld;

public class HelloApiStaticFactory {
	public static HelloApi newInstance(String message){
		return new HelloImpl2(message);
	}
	
}
