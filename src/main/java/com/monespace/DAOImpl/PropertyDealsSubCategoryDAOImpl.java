//Write Main queries and Logic Here. We create methods here not execute 

package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.monespace.DAO.PropertyDealsSubCategoryDAO;
import com.monespace.model.PropertyDealsSubCategory;

@Repository
public class PropertyDealsSubCategoryDAOImpl implements PropertyDealsSubCategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void createPropertyDealsSubCategory(PropertyDealsSubCategory propertyDealsSubCategory) {
		sessionFactory.getCurrentSession().saveOrUpdate(propertyDealsSubCategory);
	}

	@SuppressWarnings("unchecked")
	public List<PropertyDealsSubCategory> propertyDealsSubCategoryList() {
		
		List<PropertyDealsSubCategory> propertyDealsSubCategoryList = sessionFactory.getCurrentSession().createQuery("From PropertyDealsSubCategory").getResultList();
		return propertyDealsSubCategoryList;
	}

	@SuppressWarnings("unchecked")
	public String propertyDealsSubCategoryListJson() {
		Gson gson = new Gson();
		List<PropertyDealsSubCategory> propertyDealsList = sessionFactory.getCurrentSession().createQuery("From PropertyDealsSubCategory").getResultList();
		String propertyList = gson.toJson(propertyDealsList);
		return propertyList;
	}

	@SuppressWarnings("unchecked")
	public PropertyDealsSubCategory getIdFromName(String propertyDealsSubCategoryName) {
		String query = "from PropertyDealsSubcategory where propertyDealsSubCategoryName='"+ propertyDealsSubCategoryName + "'";
		List<PropertyDealsSubCategory> propertyDealsSubCategoryList = sessionFactory.getCurrentSession().createQuery(query).getResultList();
		if (propertyDealsSubCategoryList != null && !propertyDealsSubCategoryList.isEmpty()) {
			return propertyDealsSubCategoryList.get(0);
		} else {
			return null;
		}
	}

}
