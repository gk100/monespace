package com.monespace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HousingWebPage {
	@RequestMapping("/")
	public String hello() {

		return "index";
	}
}
