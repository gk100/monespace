package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetail implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userDetailId;
	private int userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String mobileNumber;
	private String emailId;
	private String username;
	private String password;
	private String shortListId;
	private String roleId;
	
	@OneToOne
	@JoinColumn(name="userId", nullable=false, insertable=false, updatable=false)
	private User user;
	
	@OneToOne
	@JoinColumn(name="userBillingId")
	private UserBillingAddress userBillingAddress;
	
	@OneToOne
	@JoinColumn(name="permanentId")
	private UserPermanentAddress userPermanentAddress;
	
	@OneToOne
	@JoinColumn(name="shortListId", nullable=false, insertable=false, updatable=false)
	private ShortList shortList;
	
	@OneToOne
	@JoinColumn(name="userRoleId", nullable=false, insertable=false, updatable=false)
	private UserRole userRole;

	public int getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShortListId() {
		return shortListId;
	}

	public void setShortListId(String shortListId) {
		this.shortListId = shortListId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserBillingAddress getUserBillingAddress() {
		return userBillingAddress;
	}

	public void setUserBillingAddress(UserBillingAddress userBillingAddress) {
		this.userBillingAddress = userBillingAddress;
	}

	public UserPermanentAddress getUserPermanentAddress() {
		return userPermanentAddress;
	}

	public void setUserPermanentAddress(UserPermanentAddress userPermanentAddress) {
		this.userPermanentAddress = userPermanentAddress;
	}

	public ShortList getShortList() {
		return shortList;
	}

	public void setShortList(ShortList shortList) {
		this.shortList = shortList;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

		
}
