package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monespace.DAO.DealsCategoryDAO;
import com.monespace.model.DealsCategory;

@Repository
public class DealsCategoryDAOImpl implements DealsCategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public void createDealsCategory(DealsCategory dealscategory) {
		sessionFactory.getCurrentSession().saveOrUpdate(dealscategory);
	}

	/* public String listDealsCategories()
	{
	return null;
	}*/
	@SuppressWarnings("unchecked")
	 public List<DealsCategory> listDealsCategories() {
	 List<DealsCategory> categoryList=this.sessionFactory.getCurrentSession().createQuery("from DealsCategory").getResultList();
	  return categoryList;
	 }
	
}
