package com.monespace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HousingWebPage 
{
	@RequestMapping 
	public ModelAndView hello() 
	{
		 
		return new ModelAndView("index");
	}
}
