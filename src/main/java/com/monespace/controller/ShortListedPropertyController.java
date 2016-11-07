package com.monespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monespace.Service.ShortListedPropertyService;

@Controller
public class ShortListedPropertyController {

	@Autowired
	private ShortListedPropertyService shortListedPropertyService;
	
	
	
		@RequestMapping(value="/deleteShortListedProperty-{shortListedPropertyId}", method=RequestMethod.GET)
		public String deleteShortListedList(@PathVariable("shortListedPropertyId") int shortListedPropertyId) {
			shortListedPropertyService.deleteShortListedList(shortListedPropertyId);
			return "redirect:/shortlistedproperty";
		}
}
