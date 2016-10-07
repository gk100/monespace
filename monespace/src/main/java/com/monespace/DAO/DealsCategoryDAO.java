package com.monespace.DAO;

import com.monespace.model.DealsCategory;
 
public interface DealsCategoryDAO 
{
		public void createDealsCategory(DealsCategory dealscategory);
		public String listDealsCategories();
}
