package com.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.ISayHello;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "com/client/applicationContext_client.xml" });

		ISayHello client = (ISayHello) context.getBean("sayHello2");

		String response = client.sayHello("Joe");
		System.out.println("Response: " + response);
		System.exit(0);
	}

}
