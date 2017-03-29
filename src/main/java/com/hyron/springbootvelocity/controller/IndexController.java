package com.hyron.springbootvelocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/index")
public class IndexController {

	@RequestMapping(value="/hello", method={RequestMethod.GET, RequestMethod.POST})
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("message", "hello world");
		return "index";
	}
}
