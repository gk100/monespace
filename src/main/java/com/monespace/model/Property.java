
package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Property implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int propertyId;
	private String propertyName;
	private String propertyDescription;
	private int propertyDealsSubCategoryId;
	private int dealerId;
	private int dealsCategoryId;
	
	@Transient
	private MultipartFile multipartImage;
	
	@ManyToOne
	@JoinColumn(name="dealerId", nullable=false, insertable=false, updatable=false)
	private Dealer dealer;
	
	@ManyToOne
	@JoinColumn(name="propertyDealsSubCategoryId", nullable=false, insertable=false, updatable=false)
	private PropertyDealsSubCategory propertyDealsSubCategory;
	
	@ManyToOne
	@JoinColumn(name="dealsCategoryId", nullable=false, insertable=false, updatable=false)
	private DealsCategory dealsCategory;

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public int getPropertyDealsSubCategoryId() {
		return propertyDealsSubCategoryId;
	}

	public void setPropertyDealsSubCategoryId(int propertyDealsSubCategoryId) {
		this.propertyDealsSubCategoryId = propertyDealsSubCategoryId;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public int getDealsCategoryId() {
		return dealsCategoryId;
	}

	public void setDealsCategoryId(int dealsCategoryId) {
		this.dealsCategoryId = dealsCategoryId;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public PropertyDealsSubCategory getPropertyDealsSubCategory() {
		return propertyDealsSubCategory;
	}

	public void setPropertyDealsSubCategory(PropertyDealsSubCategory propertyDealsSubCategory) {
		this.propertyDealsSubCategory = propertyDealsSubCategory;
	}

	public DealsCategory getDealsCategory() {
		return dealsCategory;
	}

	public void setDealsCategory(DealsCategory dealsCategory) {
		this.dealsCategory = dealsCategory;
	}

	public MultipartFile getMultipartImage() {
		return multipartImage;
	}

	public void setMultipartImage(MultipartFile multipartImage) {
		this.multipartImage = multipartImage;
	}
	
}
