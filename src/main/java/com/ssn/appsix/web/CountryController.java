package com.ssn.appsix.web;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssn.appsix.entity.Country;
import com.ssn.appsix.rootApp.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {

	

	@Autowired
	CountryService countryService;


	@Autowired
	private ApplicationContext applicationContext; //WebApplicationContext
	
	@Autowired
	private ServletContext servletContext; // org.apache.catalina.core.ApplicationContextFacade
	
	@Autowired
	private WebApplicationContext wc;
	@Autowired
	private LocalSessionFactoryBean sessionFactory;
	
	
	   @RequestMapping(method = RequestMethod.GET)
	    public String sayHelloAgain(@ModelAttribute("country") Country country ,ModelMap model) {
		   
			 LogRootWebApplicationContextBeans();
			 LogwebApplicationContextBeans();
			 LogModels();
			
			 
			 
	        model.addAttribute("title", "home");
	        model.addAttribute("message", "welcome to country Moduel ");
	        return "country";
	    }
	   
	   
	   
	   @RequestMapping(
			   			value = "/add", 
			   			method = RequestMethod.POST)
	   @ResponseBody
	   public String addCountry(@ModelAttribute("country") Country country) {
	   
		   
		  // countryService.addCountry(country);

		   //return "redirect:/getAllCountries";
		   
		   return "form submitted";
		  // return "country";
	   }
	    
	   
	   
	   
	   
	   
	   
	    // utility method for logging loaded models in hibernate
	    public void LogModels() {
	    	SessionFactory sf = sessionFactory.getObject();
			 
				Map<String, ClassMetadata>  map = (Map<String, ClassMetadata>) sf.getAllClassMetadata();
				
				System.out.println("----------------------------------------------------");
				System.out.printf("%-50s%-22s\n","Class Name","Database Table name");
				System.out.println("----------------------------------------------------");
				
				for(String entityName : map.keySet()){
			        SessionFactoryImpl sfImpl = (SessionFactoryImpl) sf;
			        String tableName = ((AbstractEntityPersister)sfImpl.getEntityPersister(entityName)).getTableName();
			        System.out.printf("%-50s%-22s\n",entityName,tableName);
			        
			    }
				System.out.println("----------------------------------------------------");
				System.out.println("========================================================================");
	    }
	    
	    
	    
	    public void LogRootWebApplicationContextBeans() {
			 System.out.println("====================   Root WebApplicationContext  ===============================\n");
			 WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
			 Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println);
			 System.out.println("===================================================================================\n\n\n\n\n");
			 
	    }
	    
	    public void LogwebApplicationContextBeans() {
			 System.out.println("====================  WebApplicationContext ===============================\n");
			 Arrays.stream(applicationContext.getBeanDefinitionNames()).sorted().forEach(System.out::println);
			 System.out.println("============================================================================\n\n");
		 }
	 
	    
	
}
