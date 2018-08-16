package com.yunyou.demo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap
{

	@SuppressWarnings("resource")
    public static void main(String[] args)
	{
		System.out.println("start...");
		new ClassPathXmlApplicationContext("spring.xml");
	}
}