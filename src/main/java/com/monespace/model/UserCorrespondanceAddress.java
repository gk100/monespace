package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCorrespondanceAddress {

	@Id
	private int correspondanceId;
	private int houseNumber;
	private String houseName;
	private String streetName;
	private String locality;
	private String city;
	private String state;
	private String pincode;

	public int getCorrespondanceId() {
		return correspondanceId;
	}

	public void setCorrespondanceId(int correspondanceId) {
		this.correspondanceId = correspondanceId;
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

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
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
