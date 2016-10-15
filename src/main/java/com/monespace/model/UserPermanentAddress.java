package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserPermanentAddress {

	@Id
	private int permanentId;
	private int houseNumber;
	private String houseName;
	private String streetName;
	private String area;
	private String city;
	private String state;
	private String pincode;

	public int getPermanentId() {
		return permanentId;
	}

	public void setPermanentId(int permanentId) {
		this.permanentId = permanentId;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
