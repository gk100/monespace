package com.monespace.handler;

import java.util.Locale;

import org.springframework.binding.message.Message;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.monespace.model.UserDetail;

@Component
public class RegistrationHandler {

	public UserDetail initFlow(){
		return new UserDetail();
	}
	
	public String validateDetail(UserDetail userDetail,MessageContext messageContext) {
		String status="Success";
		if (userDetail.getFirstName().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("firstName").defaultText("First Name cannot be Empty").build());
			status="failure";
		}
		if (userDetail.getMobileNumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mobileNumber").defaultText("Mobile Number Should not be Empty").build());
			status="failure";
		}
		if (userDetail.getEmailId().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("emailId").defaultText("Email Id Should not be Empty").build());
			status="failure";
		}
		if (userDetail.getUsername().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("username").defaultText("User Name Should not be Empty").build());
			status="failure";
		}
		if (userDetail.getPassword().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("password").defaultText("Password Should not be Empty").build());
			status="failure";
		}
		return status;
	}
}
