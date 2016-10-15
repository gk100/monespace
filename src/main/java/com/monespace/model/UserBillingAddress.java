package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBillingAddress {

	@Id
	private int billingId;
	private int houseNumber;
	private String houseName;
	private String streetName;
	private String area;
	private String city;
	private String state;
	
}
