package com.dao.impl;

import javax.jws.WebService;

import com.dao.ISayHello;

@WebService(endpointInterface="com.dao.ISayHello")
public class SayHelloImpl implements ISayHello {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "my name is"+name;
	}

}
