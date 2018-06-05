package com.ssn.appsix.HRM.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssn.appsix.HRM.model.Employee;



@Controller
public class EmployeeController {

	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView showEmployeeForm() {
		Employee employee = new Employee();
 
		// Add the command object to the modelview
		ModelAndView mv = new ModelAndView("employee");
		mv.addObject("employee", employee);
		
		
		
		// Create Dynamic list for <form:radiotbuttons>
				List<String> avalablepaymentModes = new ArrayList<String>();
				avalablepaymentModes.add("Checks");
				avalablepaymentModes.add("Cash");
				avalablepaymentModes.add("Bank Account");
				avalablepaymentModes.add("Gift Cards");
				avalablepaymentModes.add("Travellers Checks");
				mv.addObject("paymentModes", avalablepaymentModes);
				
				
		// Add dynamic data to the Hobbies list
				List<String> availableHobbies = new ArrayList<String>();
				availableHobbies.add("Reading");
				availableHobbies.add("Dancing");
				availableHobbies.add("Singing");
				availableHobbies.add("Doing Nothing");
				mv.addObject("availableHobbies", availableHobbies);
		 
				
				// Add dynamic data to the Hobbies list
				List<String> qualifications = new ArrayList<String>();
				qualifications.add("MSC");
				qualifications.add("Mteck");
				qualifications.add("BE");
				qualifications.add("Deplomo");
				mv.addObject("availablequalifications", qualifications);
				
				
				// Add dynamic data to Social Profiles
				Map<String, String> availableSocialProfiles = new HashMap<String, String>();
				availableSocialProfiles.put("linkedin", "LinkedIN");
				availableSocialProfiles.put("facebook", "FaceBook");
				availableSocialProfiles.put("twitter", "Twitter");
				availableSocialProfiles.put("google+", "Google Plus");
				mv.addObject("availableSocialProfiles", availableSocialProfiles);
				
				
 
		return mv;
	}
	
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String submitForm(Model model, Employee employee) {
 
		model.addAttribute("employee", employee);
		return "employeeDetails";
 
	}
	
	
	
	
	
}
