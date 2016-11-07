package com.monespace.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monespace.DAOImpl.ShortListedPropertyDAOImpl;
import com.monespace.model.ShortListedProperty;

@Service
public class ShortListedPropertyService {

	@Autowired
	private ShortListedPropertyDAOImpl shortListedPropertyDAOImpl;
	
	@Transactional
	public void createPropertyShortList(ShortListedProperty shortListedProperty) {
		shortListedPropertyDAOImpl.createPropertyShortList(shortListedProperty);
	}
	
	@Transactional
	public List<ShortListedProperty> shortListedList() {
		return shortListedPropertyDAOImpl.shortListedList();
	}
	
	@Transactional
	public String ShortListedPropertyList() {
		return shortListedPropertyDAOImpl.ShortListedPropertyList();
	}
	
	@Transactional
	public void deleteShortListedList(int shortListedPropertyId) {
		shortListedPropertyDAOImpl.deleteShortListedList(shortListedPropertyId);
	}
}
