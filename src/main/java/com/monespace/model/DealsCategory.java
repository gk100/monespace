package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class DealsCategory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private int dealsCategoryId;
	@Expose
	@NotNull(message="Category Name Should not be Empty")
	private String dealsCategoryName;
	@Expose
	@NotNull(message="Category Description Should not be Empty")
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
