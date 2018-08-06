package com.dubbo.provider;

import org.springframework.stereotype.Component;

import com.dubbo.api.UserService;


public class UserServiceImpl implements UserService {

	@Override
	public String sayHi(String arg0) {
		// TODO Auto-generated method stub
		return "hello " + arg0 + "!";
	}

}
