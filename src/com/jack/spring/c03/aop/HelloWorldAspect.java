package com.jack.spring.c03.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloWorldAspect {
	public void beforeAdvice(){
		System.out.println("--------------before");
	}
	
	public void beforeAdvice(String param,Integer i){
		System.out.println("--------------before"+"-----"+param+"^^^^^^"+i);
	}
	public void afterFinallyAdvice(){
		System.out.println("---------------after");
	}
	public void afterReturningAdvice(Object retVal) {  
	    System.out.println("===========after returning advice retVal:" + retVal);  
	}
	public void afterThrowingAdvice(Exception exception) {  
		  System.out.println("===========after throwing advice exception:" + exception);  
	}  
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {  
	    System.out.println("===========around before advice");  
	    Object retVal = pjp.proceed(new Object[] {"replace"});  
	    System.out.println("===========around after advice");  
	    return retVal;  
	}  
}

