package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.monespace.DAO.ShortListedPropertyDAO;
import com.monespace.model.ShortListedProperty;

@Repository
public class ShortListedPropertyDAOImpl implements ShortListedPropertyDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createPropertyShortList(ShortListedProperty shortListedProperty) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(shortListedProperty);
	}

	@SuppressWarnings("unchecked")
	public List<ShortListedProperty> shortListedList() {
		// TODO Auto-generated method stub
		List<ShortListedProperty> shortListedList=sessionFactory.getCurrentSession().createQuery("From ShortListedProperty").getResultList();
		return shortListedList;
	}
	

	@SuppressWarnings("unchecked")
	public String ShortListedPropertyList() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		List<ShortListedProperty> shortListedList=sessionFactory.getCurrentSession().createQuery("From ShortListedProperty").getResultList();
		String shortListedPropertyList = gson.toJson(shortListedList);
		return shortListedPropertyList;
	}

	public void deleteShortListedList(int shortListedPropertyId) {
		// TODO Auto-generated method stub
		ShortListedProperty shortListedProperty= new ShortListedProperty();
		shortListedProperty.setShortListedPropertyId(shortListedPropertyId);
		sessionFactory.getCurrentSession().delete(shortListedProperty);
	}


}
