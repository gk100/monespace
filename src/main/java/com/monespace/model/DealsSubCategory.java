//Every Table or Category starts from Here

package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DealsSubCategory {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int dealsSubCategoryId;
	private String propertyType;

	private int dealsCategoryId;
	@ManyToOne
	@JoinColumn(name="dealsCategoryId", nullable=false, insertable=false, updatable=false)
	private DealsCategory dealscategory;
	
	public int getDealsSubCategoryId() {
		return dealsSubCategoryId;
	}
	public void setDealsSubCategoryId(int propertyDealsSubCategoryId) {
		this.dealsSubCategoryId = propertyDealsSubCategoryId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public int getDealsCategoryId() {
		return dealsCategoryId;
	}
	public void setDealsCategoryId(int dealsCategoryId) {
		this.dealsCategoryId = dealsCategoryId;
	}
	public DealsCategory getDealscategory() {
		return dealscategory;
	}
	public void setDealscategory(DealsCategory dealscategory) {
		this.dealscategory = dealscategory;
	}
	
}