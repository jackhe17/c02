package com.jack.spring.c03.service.impl;

import com.jack.spring.c03.service.IHelloWorldService;


public class HelloWorldService implements IHelloWorldService{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("================Hello world!");
	}
	@Override
	public void sayBefore(String param) {
		// TODO Auto-generated method stub
		System.out.println("================Hello world!"+param);
	}
	@Override
	public void sayBefore(String param,Integer i) {
		// TODO Auto-generated method stub
		System.out.println("================Hello world!"+param+"--------------"+"^^^^^^^^^^^"+i);
	}
	@Override  
	public boolean sayAfterReturning() {  
	    System.out.println("============after returning");  
	    return true;  
	}

	@Override
	public void sayAfterThrowing() {
		// TODO Auto-generated method stub
		System.out.println("============before throwing");  
	    throw new RuntimeException();  
	}  
	@Override  
	public boolean sayAfterFinally() {  
	        System.out.println("============before finally");  
	        throw new RuntimeException();  
	}  
	@Override  
	public void sayAround(String param) {  
	   System.out.println("============around param:" + param);  
	}  
	@Override  
	public void sayAdvisorBefore(String param) {  
	    System.out.println("============say " + param);  
	}  
}
