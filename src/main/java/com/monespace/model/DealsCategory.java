package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DealsCategory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealsCategoryId;
	private String dealsCategoryName;
	private String dealsCategoryDescription;

	public int getdealsCategoryId() {
		return dealsCategoryId;
	}

	public void setdealsCategoryId(int dealsCategoryId) {
		this.dealsCategoryId = dealsCategoryId;
	}

	public String getdealsCategoryName() {
		return dealsCategoryName;
	}

	public void setdealsCategoryName(String dealsCategoryname) {
		this.dealsCategoryName = dealsCategoryname;
	}

	public String getdealsCategoryDescription() {
		return dealsCategoryDescription;
	}

	public void setdealsCategoryDescription(String dealsCategoryDescription) {
		this.dealsCategoryDescription = dealsCategoryDescription;
	}
}
