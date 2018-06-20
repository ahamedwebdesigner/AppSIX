package com.ssn.appsix.HRM.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/sessionsTest")
public class WorkingWithSession {
	
	
	 @Autowired 
	 private HttpSession httpSession;
	 
	 
	 
	@RequestMapping(value = "/pageone/{name}", method = RequestMethod.GET)
	//@ResponseBody
	public  String FirstMethod(HttpSession session) {
		// 1) settin session value
		session.setAttribute("name", "syed");
		return "redirect:/args/two";
	}
	
	
	@RequestMapping(value = "/two", method = RequestMethod.GET)
	public @ResponseBody String SecondMetord(HttpSession session) {
     //2) getting session value
	return "Hellow All"+session.getAttribute("name");
	}
	
	

}
