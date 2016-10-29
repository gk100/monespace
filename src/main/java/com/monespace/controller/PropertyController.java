package com.monespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.monespace.Service.DealerService;
import com.monespace.Service.DealsCategoryService;
import com.monespace.Service.PropertyDealsSubCategoryService;
import com.monespace.Service.PropertyService;
import com.monespace.model.Dealer;
import com.monespace.model.DealsCategory;
import com.monespace.model.Property;
import com.monespace.model.PropertyDealsSubCategory;

@Controller
public class PropertyController {

	@Autowired
	private PropertyService propertyService;
	
	@Autowired
	private DealsCategoryService dealsCategoryService;
	
	@Autowired
	private PropertyDealsSubCategoryService propertyDealsSubCategoryService;
	
	@Autowired
	private DealerService dealerService;
	
	@RequestMapping("/property")
	public String property(Model model) {
		model.addAttribute("property", new Property());
		model.addAttribute("propertylist", this.propertyService.listproperty());
		model.addAttribute("stringProperty", this.propertyService.stringProperty());
		model.addAttribute("listDealer", this.dealerService.listDealer());
		model.addAttribute("listSubCategory", this.propertyDealsSubCategoryService.propertyDealsSubCategoryList());
		model.addAttribute("listDealsCategories", this.dealsCategoryService.listDealsCategories());
		return "property";
	}
	
	@RequestMapping(value="/add/property", method=RequestMethod.POST)
	public String addProperty(@ModelAttribute ("property") Property property) {
		DealsCategory dealsCategory = dealsCategoryService.getIdFromName(property.getDealsCategory().getdealsCategoryName());
		dealsCategoryService.createDealsCategory(dealsCategory);
		property.setDealsCategory(dealsCategory);
		property.setDealsCategoryId(dealsCategory.getdealsCategoryId());
		
		PropertyDealsSubCategory propertyDealsSubCategory = propertyDealsSubCategoryService.getIdFromName(property.getPropertyDealsSubCategory().getPropertyType());
		propertyDealsSubCategoryService.createPropertyDealsSubCategory(propertyDealsSubCategory);
		property.setPropertyDealsSubCategory(propertyDealsSubCategory);
		property.setPropertyDealsSubCategoryId(propertyDealsSubCategory.getPropertyDealsSubCategoryId());
		
		Dealer dealer=dealerService.getIdFromName(property.getDealer().getDealerName());
		dealerService.createDealer(dealer);
		property.setDealer(dealer);
		property.setDealerId(dealer.getDealerId());
//		property.setDealerId(dealer.getDealerId());
		
		this.propertyService.createPoperty(property);
		return "redirect:/property";
	}
	
	@RequestMapping(value="/editProperty-{propertyId}", method=RequestMethod.GET)
	public String editProperty(@PathVariable("propertyId") int propertyId, Model model) {
		model.addAttribute("listDealsCategories", this.dealsCategoryService.listDealsCategories());
		model.addAttribute("listSubCategory", this.propertyDealsSubCategoryService.propertyDealsSubCategoryList());
		model.addAttribute("listDealer", this.dealerService.listDealer());
		model.addAttribute("property",propertyService.getPropertyById(propertyId));
		model.addAttribute("stringProperty", this.propertyService.stringProperty());
		return "property";
	}
	
	@RequestMapping(value="/deleteProperty-{propertyId}", method=RequestMethod.GET)
	public String deleteProperty(@PathVariable("propertyId") int propertyId) {
		propertyService.deleteProperty(propertyId);
		return "redirect:/property";
	}
}