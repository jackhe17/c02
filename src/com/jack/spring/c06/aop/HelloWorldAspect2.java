package com.jack.spring.c06.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloWorldAspect2 {
	@Pointcut(value = "execution(* com.jack.spring.c03.service.*.*.sayBefore(..)) && args(param)", argNames = "param")
	public void beforePointcut(String param) {
	}
	@Before(value = "beforePointcut(param)", argNames = "param")  
	public void beforeAdvice(String param) {  
	    System.out.println("===========before advice param:" + param);  
	}
}
