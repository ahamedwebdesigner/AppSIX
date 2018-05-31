package com.ssn.appsix.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssn.appsix.entity.Country;
import com.ssn.appsix.rootApp.CountryService;

@Controller
public class CountryCtrl {
	

	@Autowired
	CountryService countryService;
	
	   @RequestMapping(
			   			value = "country/", 
			   			method = RequestMethod.GET)
	public String DisplayAllCountries(Model model) {
		   
		   List listOfCountries = countryService.getAllCountries();   
		   model.addAttribute("listOfCountries", listOfCountries);
		   return "contryDetails";
		
	}
	   
	   
	   @RequestMapping(
			   			value = "country/add", 
			   			method = RequestMethod.GET)
	  
	   public String addCountry(@ModelAttribute("country") Country country ,ModelMap model) {
		   country.setCountryName("India");
		   return "countryForm";
	   }
	   
	   
	   @RequestMapping(
	   			value = "country/add", 
	   			method = RequestMethod.POST)
	
		public String saveCountry(@ModelAttribute("country") Country country ,ModelMap model) {
		  if(country.getId()==0) {
		   countryService.addCountry(country);
		   }else{
		  // countryService.updateCountry(country);
		   }
	
		  return "redirect:/country/";
		}

	   
	 
	   @RequestMapping(value = "/country/update/{id}", method = RequestMethod.GET)
	   public String updateCountry( @ModelAttribute("country") Country country ,@PathVariable("id") int id,Model model) {
		   
		   country = this.countryService.getCountry(id);
		   System.out.println("===========================");
		   System.out.println(id);
		   System.out.println("===========================");
	 
	      return "countryForm";
	   }
	    
	   
	   }


