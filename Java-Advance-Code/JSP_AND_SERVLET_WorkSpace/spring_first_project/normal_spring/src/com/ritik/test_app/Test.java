package com.ritik.test_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import normal_springcom.ritik.spring.HelloSpring;

public class Test {
	public static void main(String[] args)throws Exception{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
	HelloSpring hello=(HelloSpring) context.getBean("HelloSpring");
	System.out.println(hello.stringmethod());

}
}
