package com.monespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.monespace.Service.DealsCategoryService;
import com.monespace.Service.PropertyDealsSubCategoryService;
import com.monespace.model.DealsCategory;
import com.monespace.model.PropertyDealsSubCategory;


@Controller
public class PropertyDealsSubCategoryController {

	@Autowired
	private PropertyDealsSubCategoryService propertyDealsSubCategoryService;
	@Autowired
	private DealsCategoryService dealsCategoryService;
	
	@RequestMapping("/subCategories")
	public String propertyDealsSubCategory(Model model) {
		model.addAttribute("subCategory", new PropertyDealsSubCategory());
		model.addAttribute("listSubCategory", this.propertyDealsSubCategoryService.propertyDealsSubCategoryList());
		model.addAttribute("listCategory", this.dealsCategoryService.listDealsCategories());
		return "subCategories";
	}
	
	@RequestMapping("add/subCategory")
	public String addPropertyDealsSubCategory(@ModelAttribute("propertyDealsSubCategory")PropertyDealsSubCategory propertyDealsSubCategory){
		DealsCategory dealsCategory= dealsCategoryService.getIdFromName(propertyDealsSubCategory.getDealscategory().getdealsCategoryName());
		dealsCategoryService.createDealsCategory(dealsCategory);;
		propertyDealsSubCategory.setDealscategory(dealsCategory);
		propertyDealsSubCategory.setDealsCategoryId(dealsCategory.getdealsCategoryId());
		this.propertyDealsSubCategoryService.createPropertyDealsSubCategory(propertyDealsSubCategory);
		return "redirect:/subCategories";
		
		
}
}
