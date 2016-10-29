package com.monespace.handler;

import org.springframework.stereotype.Component;

import com.monespace.model.UserDetail;

@Component
public class RegistrationHandler {

	public UserDetail initFlow(){
		return new UserDetail();
	}
}
