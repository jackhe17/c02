package com.jack.spring.c03.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jack.spring.c03.service.IHelloWorldService;
import com.jack.spring.c03.service.impl.HelloWorldService;

public class AOPTest {
	@Test
	public void testaop(){
		ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
		IHelloWorldService service = context.getBean("helloworldService",IHelloWorldService.class);
		//service.sayAfterReturning();
		//service.sayBefore("sss",4);
		//service.sayAfterThrowing();
		service.sayAround("ddd");
	}
}
