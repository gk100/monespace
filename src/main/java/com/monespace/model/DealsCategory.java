package com.monespace.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DealsCategory 
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int dealsCategoryId;
	private String dealsCategoryname;
	private String dealsCategoryDescription;
	
	public int getdealsCategoryId() {
		return dealsCategoryId;
	}
	public void setdealsCategoryId(int dealsCategoryId) {
		this.dealsCategoryId = dealsCategoryId;
	}
	public String getdealsCategoryname() {
		return dealsCategoryname;
	}
	public void setdealsCategoryname(String dealsCategoryname) {
		this.dealsCategoryname = dealsCategoryname;
	}
	public String getdealsCategoryDescription() {
		return dealsCategoryDescription;
	}
	public void setdealsCategoryDescription(String dealsCategoryDescription) {
		this.dealsCategoryDescription = dealsCategoryDescription;
	}
}
