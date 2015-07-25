package com.jack.spring.c03.service;

public interface IHelloWorldService {
	public void sayHello();
	public void sayBefore(String param); 
	public void sayBefore(String param,Integer i); 
	public boolean sayAfterReturning();  
	public void sayAfterThrowing();  
	public boolean sayAfterFinally();  
	public void sayAround(String param); 
	public void sayAdvisorBefore(String param);  
}
