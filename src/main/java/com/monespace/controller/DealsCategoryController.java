package com.monespace.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monespace.Service.DealsCategoryService;
import com.monespace.model.DealsCategory;
import org.springframework.ui.Model;

@Controller
public class DealsCategoryController {

	@Autowired
	private DealsCategoryService dealsCategoryService;
	@RequestMapping(value="/dealsCategories",method = RequestMethod.GET)
	public String createDealsCategories(Model model)
	{
		model.addAttribute("dealsCategories", new DealsCategory());
		//model.addAttribute("listDealsCategories", dealsCategoryService.listDealsCategories());
		model.addAttribute("ListDealsCategories", dealsCategoryService.getCategories());
		return "DealsCategories";
	}
	@RequestMapping("/add/dealscategories")
	public String addDealsCategories(@ModelAttribute("dealsCategories")DealsCategory dealsCategory)
	{
		dealsCategoryService.createDealsCategory(dealsCategory);
		return "redirect:/dealsCategories";		
	}
	
}
