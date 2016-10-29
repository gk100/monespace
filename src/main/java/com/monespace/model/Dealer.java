package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dealer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealerId;
	private String dealerName;
	private String dealerOrganisation;
	private String dealerAddress1;
	private String dealerAddress2;
	private String dealerContactNumber;
	private String dealerMobileNumber;
	private String dealerEmailId;

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerOrganisation() {
		return dealerOrganisation;
	}

	public void setDealerOrganisation(String dealerOrganisation) {
		this.dealerOrganisation = dealerOrganisation;
	}

	public String getDealerAddress1() {
		return dealerAddress1;
	}

	public void setDealerAddress1(String dealerAddress1) {
		this.dealerAddress1 = dealerAddress1;
	}

	public String getDealerAddress2() {
		return dealerAddress2;
	}

	public void setDealerAddress2(String dealerAddress2) {
		this.dealerAddress2 = dealerAddress2;
	}

	public String getDealerContactNumber() {
		return dealerContactNumber;
	}

	public void setDealerContactNumber(String dealerContactNumber) {
		this.dealerContactNumber = dealerContactNumber;
	}

	public String getDealerMobileNumber() {
		return dealerMobileNumber;
	}

	public void setDealerMobileNumber(String dealerMobileNumber) {
		this.dealerMobileNumber = dealerMobileNumber;
	}

	public String getDealerEmailId() {
		return dealerEmailId;
	}

	public void setDealerEmailId(String dealerEmailId) {
		this.dealerEmailId = dealerEmailId;
	}

}
