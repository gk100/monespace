package com.monespace.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monespace.DAOImpl.DealsCategoryDAOImpl;
import com.monespace.model.DealsCategory;

@Service
@Transactional
public class DealsCategoryService {
	
	@Autowired
	private DealsCategoryDAOImpl dealsCategoryDAOImpl;
	
	@Transactional
	public void createDealsCategory(DealsCategory dealsCategory)
	{
		dealsCategoryDAOImpl.createDealsCategory(dealsCategory);
	}
	
	@Transactional
	public List<DealsCategory> listDealsCategories()
	{
		
		return dealsCategoryDAOImpl.listDealsCategories();
		
	}
}
