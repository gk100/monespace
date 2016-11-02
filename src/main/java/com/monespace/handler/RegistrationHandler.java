package com.monespace.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.monespace.Service.UserRegisterService;
import com.monespace.model.Dealer;
import com.monespace.model.UserBillingAddress;
import com.monespace.model.UserDetail;
import com.monespace.model.UserPermanentAddress;
import com.monespace.model.UserRole;

@Component
public class RegistrationHandler {

	@Autowired
	public UserRegisterService userRegisterService;
	
	@Autowired
	public UserPermanentAddress userPermanentAddress;
	
	@Autowired
	public UserBillingAddress userBillingAddress;
	
	@Autowired
	public UserRole userRole;
	
	@Autowired
	public Dealer dealer;
	
	public UserDetail initFlow(){
		return new UserDetail();
	}
	
	public String validateDetail(UserDetail userDetail,MessageContext messageContext) {
//		List<User Detail> listDetail= userRegisterService.listUserDetail;
		
		String status="Success";
		if (userDetail.getFirstName().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("firstName").defaultText("First Name is Mandatory").build());
			status="failure";
		}
		if (userDetail.getMobileNumber().isEmpty() || (userDetail.getMobileNumber().length()!=10 && !userDetail.getMobileNumber().isEmpty())) {
			if (userDetail.getMobileNumber().length()!=10 && !userDetail.getMobileNumber().isEmpty()) {
				messageContext.addMessage(new MessageBuilder().error().source("mobileNunber").defaultText("Mobile Number should be of 10 digits").build());
			}
			else {
				messageContext.addMessage(new MessageBuilder().error().source("mobileNumber").defaultText("Mobile Number is Mandatory").build());
			}
			status="failure";
		}
		if (userDetail.getEmailId().isEmpty() || (!userDetail.getEmailId().contains("@") && !userDetail.getEmailId().isEmpty())) {
			if(!userDetail.getEmailId().contains("@") && !userDetail.getEmailId().isEmpty()) {
				messageContext.addMessage(new MessageBuilder().error().source("emailId").defaultText("Invalid Format. Should contain @").build());
			}
			else {
				messageContext.addMessage(new MessageBuilder().error().source("emailId").defaultText("Email Id is Mandatory").build());
			}
			status="failure";
		}
//		else if (!userDetail.getEmailId().isEmpty()) {
//			for(UserDetail d: listDetail) {
//				if (d.getEmailId().equals(userDetail.getEmailId())) {
//					messageContext.addMessage(new MessageBuilder().error().source("emailId").defaultText("Email Id is already exists.Please Try Another.").build());
//					status="failure";
//					break;
//				}
//			}
//		}
		if (userDetail.getUsername().isEmpty() || userDetail.getUsername().length()<=2) {
			messageContext.addMessage(new MessageBuilder().error().source("username").defaultText("User Name is Mandatory").build());
			status="failure";
		}
//		else if (userDetail.getUsername().isEmpty()) {
//			for (UserDetail d: listDetail) {
//				if(d.getUsername().equals(userDetail.getUsername())) {
//					messageContext.addMessage(new MessageBuilder().error().source("username").defaultText("username is already exists.Please Try Another.").build());
//					status="failure";
//					break;
//				}
//			}
//		}
		if (userDetail.getPassword().isEmpty() || (userDetail.getPassword().length()<5 && !userDetail.getPassword().isEmpty())) {
			if (userDetail.getPassword().length()<5 && !userDetail.getPassword().isEmpty()) {
				messageContext.addMessage(new MessageBuilder().error().source("password").defaultText("password should be minimum 5 characters").build());
			}
			else {
				messageContext.addMessage(new MessageBuilder().error().source("password").defaultText("Password is Mandatory").build());
			}
			status="failure";
		}
		return status;
	}
	public String validatePermanentAddress(UserDetail userDetail, UserPermanentAddress userPermanentAddress, MessageContext messageContext) {
		String status = "success";
		// ****************
		if (userPermanentAddress.getHouseName().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("houseName").defaultText("Please Fill the Details").build());
			status = "failure";
		}
		if (userPermanentAddress.getArea().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("area").defaultText("Please Fill the area Details").build());
			status ="failure";
		}
		if (userPermanentAddress.getCity().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("city").defaultText("Please Fill the Details").build());
			status ="failure";
		}
		if (userPermanentAddress.getState().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("state").defaultText("Please Fill the Details").build());
			status ="failure";
		}
		if (userPermanentAddress.getPincode().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("pinCode").defaultText("Please Fill the Details").build());
			status ="failure";
		}
		return status;
	}
//	public String addDetail(UserDetail userDetail, UserRole userRole, UserPermanentAddress userPermanentAddress,UserBillingAddress userBillingAddress, MessageContext messageContext) {
//		try {
//			userRegisterService.saveOrUpdate(userDetail);
//			userDetail.setUserPermanentAddress(userPermanentAddress);
//			userDetail.setUserBillingAddress(userBillingAddress);
//			userDetail.setUserRole(userRole);
//			
//			userPermanentAddress.setUserDetail(userDetail);
//			this.userPermanentAddress.setUserDetail(userDetail);
//			userBillingAddress.setUserDetail(userDetail);
//			this.userBillingAddress.setUserDetail(userDetail);
//			userRole.setUserDetail(userDetail);
//			this.userRole.setUserDetail(userDetail);
//			userRegisterService.s
//		}
//		return "success";
//	}
	
	
}
