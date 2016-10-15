//Write Abstract Method here within Interface

package com.monespace.DAO;

import java.util.List;

import com.monespace.model.DealsSubCategory;

public interface DealsSubCategoryDAO {

	public void createDealsSubCategory(DealsSubCategory dealsSubCategory);
	public List<DealsSubCategory> dealsSubCategoryList();
	public String dealsSubCategoryListJson();
	public DealsSubCategory getIdFromName(String dealsSubCAtegoryName);
	
	
}
