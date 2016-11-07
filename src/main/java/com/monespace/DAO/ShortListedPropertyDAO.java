package com.monespace.DAO;

import java.util.List;

import com.monespace.model.ShortListedProperty;

public interface ShortListedPropertyDAO {

	public void createPropertyShortList (ShortListedProperty shortListedProperty);
	public List<ShortListedProperty> shortListedList();
	public String ShortListedPropertyList();
	public void deleteShortListedList(int shortListedPropertyId);
	
}
