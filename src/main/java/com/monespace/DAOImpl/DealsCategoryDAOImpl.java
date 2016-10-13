package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.monespace.DAO.DealsCategoryDAO;
import com.monespace.model.DealsCategory;

@Repository
public class DealsCategoryDAOImpl implements DealsCategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void createDealsCategory(DealsCategory dealscategory) {
		sessionFactory.getCurrentSession().saveOrUpdate(dealscategory);
	}

	/*
	 * public String listDealsCategories() { return null; }
	 */
	@SuppressWarnings("unchecked")
	public List<DealsCategory> listDealsCategories() {
		List<DealsCategory> categoryList = this.sessionFactory.getCurrentSession().createQuery("from DealsCategory")
				.getResultList();
		return categoryList;
	}

	@SuppressWarnings("unchecked")
	public String getCategories() {
		List<DealsCategory> categoryList = this.sessionFactory.getCurrentSession().createQuery("from DealsCategory")
				.getResultList();
		Gson gson = new Gson();
		String Category = gson.toJson(categoryList);
		return Category;
	}

	@SuppressWarnings("unchecked")
	public DealsCategory getIdFromName(String dealsCategoryName) {
		String query = "from DealsCategory where dealsCategoryName='" + dealsCategoryName + "'";
		List<DealsCategory> dealsCategoryList = this.sessionFactory.getCurrentSession().createQuery(query)
				.getResultList();
		if (dealsCategoryList != null && !dealsCategoryList.isEmpty()) {
			return dealsCategoryList.get(0);
		} else {
			return null;
		}
	}

	public void deleteCategory(int dealsCategoryId) {
		DealsCategory dealscategory = new DealsCategory();
		dealscategory.setdealsCategoryId(dealsCategoryId);
		sessionFactory.getCurrentSession().delete(dealscategory);
	}

	@SuppressWarnings("unchecked")
	public DealsCategory getById(int dealsCategoryId) {
		String query = "from DealsCategory where dealsCategoryId=" + dealsCategoryId;
		List<DealsCategory> dealsCategoryList = this.sessionFactory.getCurrentSession().createQuery(query)
				.getResultList();
		if (dealsCategoryList != null && !dealsCategoryList.isEmpty()) {
			return dealsCategoryList.get(0);
		} else {
			return null;
		}
	}
}
