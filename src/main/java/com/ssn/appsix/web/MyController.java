package com.ssn.appsix.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myctrl")
public class MyController {
	
	 @RequestMapping(value = "/")
	    public String home(Model model) {

	        return "index";

	    }

}
