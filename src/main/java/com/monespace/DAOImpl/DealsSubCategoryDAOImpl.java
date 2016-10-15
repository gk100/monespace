//Write Main queries and Logic Here. We create methods here not execute 

package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.monespace.DAO.DealsSubCategoryDAO;
import com.monespace.model.DealsSubCategory;

@Repository
public class DealsSubCategoryDAOImpl implements DealsSubCategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void createDealsSubCategory(DealsSubCategory dealsSubCategory) {
		sessionFactory.getCurrentSession().saveOrUpdate(dealsSubCategory);
	}

	@SuppressWarnings("unchecked")
	public List<DealsSubCategory> dealsSubCategoryList() {
		
		List<DealsSubCategory> dealsSubCategoryList = sessionFactory.getCurrentSession().createQuery("From dealsSubCategory").getResultList();
		return dealsSubCategoryList;
	}

	@SuppressWarnings("unchecked")
	public String dealsSubCategoryListJson() {
		Gson gson = new Gson();
		List<DealsSubCategory> propertyDealsList = sessionFactory.getCurrentSession().createQuery("From dealsSubCategory").getResultList();
		String propertyList = gson.toJson(propertyDealsList);
		return propertyList;
	}

	@SuppressWarnings("unchecked")
	public DealsSubCategory getIdFromName(String dealsSubCategoryName) {
		String query = "from dealsSubCategory where dealsSubCategoryName='"+ dealsSubCategoryName + "'";
		List<DealsSubCategory> dealsSubCategoryList = sessionFactory.getCurrentSession().createQuery(query).getResultList();
		if (dealsSubCategoryList != null && !dealsSubCategoryList.isEmpty()) {
			return dealsSubCategoryList.get(0);
		} else {
			return null;
		}
	}

}
