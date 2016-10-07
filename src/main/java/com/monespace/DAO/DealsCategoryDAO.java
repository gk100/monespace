package com.monespace.DAO;
import java.util.List;

import com.monespace.model.DealsCategory;
 
public interface DealsCategoryDAO 
{
		public void createDealsCategory(DealsCategory dealscategory);
		public List<DealsCategory> listDealsCategories();
}
