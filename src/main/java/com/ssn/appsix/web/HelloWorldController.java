package com.ssn.appsix.web;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;

@Controller
//@RequestMapping("/")
public class HelloWorldController {
	
	@Autowired
	private ApplicationContext applicationContext; //WebApplicationContext
	
	@Autowired
	private ServletContext servletContext; // org.apache.catalina.core.ApplicationContextFacade
	
	@Autowired
	private WebApplicationContext wc;
	
	
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "index";
    }
 
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("message", "Hellow again for  sayHelloAgain ");
        return "welcome";
    }
 
}