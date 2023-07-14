package com.greens.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreensController {

	@RequestMapping("/")
	public String loadIndexPg() {
		return "index";
	}
}
