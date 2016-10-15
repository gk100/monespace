package com.monespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monespace.Service.DealsCategoryService;
import com.monespace.Service.DealsSubCategoryService;
import com.monespace.model.DealsCategory;
import com.monespace.model.DealsSubCategory;


@Controller
public class DealsSubCategoryController {

	@Autowired
	private DealsSubCategoryService dealsSubCategoryService;
	@Autowired
	private DealsCategoryService dealsCategoryService;
	
	@RequestMapping("/subCategory")
	public String dealsSubCategory(Model model) {
		model.addAttribute("dealsSubCategory", new DealsSubCategory());
		model.addAttribute("listSubCategory", this.dealsSubCategoryService.dealsSubCategoryList());
		model.addAttribute("listCategory", this.dealsCategoryService.listDealsCategories());
		model.addAttribute("dealsSubCategoryListJson", this.dealsSubCategoryService.dealsSubCategoryListJson());
		return "subCategory";
	}
	
	@RequestMapping(value="/add/subCategory", method=RequestMethod.POST)
	public String addDealsSubCategory(@ModelAttribute("dealsSubCategory")DealsSubCategory dealsSubCategory){
		DealsCategory dealsCategory= dealsCategoryService.getIdFromName(dealsSubCategory.getDealscategory().getdealsCategoryName());
		dealsCategoryService.createDealsCategory(dealsCategory);;
		dealsSubCategory.setDealscategory(dealsCategory);
		dealsSubCategory.setDealsCategoryId(dealsCategory.getdealsCategoryId());
		this.dealsSubCategoryService.createDealsSubCategory(dealsSubCategory);
		return "redirect:/subCategory";
		
		
}
}
