package com.monespace.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monespace.DAOImpl.DealsSubCategoryDAOImpl;
import com.monespace.model.DealsSubCategory;

@Service
public class DealsSubCategoryService {

	@Autowired
	private DealsSubCategoryDAOImpl dealsSubCategoryDAOImpl;
	
	@Transactional
	public void createDealsSubCategory(DealsSubCategory propertyDealsSubCategory) {
		dealsSubCategoryDAOImpl.createDealsSubCategory(propertyDealsSubCategory);
	}
	
	@Transactional
	public List<DealsSubCategory> dealsSubCategoryList() {
		return dealsSubCategoryDAOImpl.dealsSubCategoryList();
	}
	
	@Transactional
	public String dealsSubCategoryListJson() {
		return dealsSubCategoryDAOImpl.dealsSubCategoryListJson();
	}
	
	@Transactional
	public DealsSubCategory getIdFromName(String propertyDealsSubCategoryName) {
		return dealsSubCategoryDAOImpl.getIdFromName(propertyDealsSubCategoryName);
	}
	
}
