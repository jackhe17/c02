package com.jack.spring.c02.helloworld;
import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

import com.jack.spring.c03.service.IHelloWorldService;
import com.jack.spring.c03.service.impl.HelloWorldService;
public class HelloTest {
	@Test
	public void testHelloWorld(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello",HelloApi.class);
		api.sayHello();
	}
	@Test
	public void testHello2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello2", HelloApi.class);
		api.sayHello();
	}
	@Test
	public void testHello3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello3", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testHello4(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello4", HelloApi.class);
		api.sayHello();
	}
	@Test
	public void testHello5(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello5", HelloApi.class);
		api.sayHello();
	}
	@Test
	public void testHello6(){
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi api = context.getBean("hello6", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testResourceLoad() {
	    ResourceLoader loader = new DefaultResourceLoader();
	    Resource resource = loader.getResource("classpath:cn/javass/spring/chapter4/test1.txt");
	    //验证返回的是ClassPathResource
	    Assert.assertEquals(ClassPathResource.class, resource.getClass());
	    Resource resource2 = loader.getResource("file:cn/javass/spring/chapter4/test1.txt");
	    //验证返回的是ClassPathResource
	    Assert.assertEquals(UrlResource.class, resource2.getClass());
	    Resource resource3 = loader.getResource("cn/javass/spring/chapter4/test1.txt");
	    //验证返默认可以加载ClasspathResource
	    Assert.assertTrue(resource3 instanceof ClassPathResource);
	}
	
	
	/*@Test
	public void testaop(){
		ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
		IHelloWorldService service = context.getBean("helloworldService",HelloWorldService.class);
		service.sayHello();
	}*/
}
