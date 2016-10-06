package com.dao;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public interface ISayHello {
	
	public String sayHello(@WebParam(name="name")String name);
}
