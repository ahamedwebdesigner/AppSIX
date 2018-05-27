package com.ssn.appsix.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/data")
public class AccessingDataEgController {





	//http://localhost:8080/AppSix/data?name=syed
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(
    			//1
    			@RequestParam(	value="name", 
    							required=false, 
    							defaultValue="World"
    							) String name, 
    			//1
    			@RequestParam(	value="id", 
    							required=false, 
    							defaultValue="0"
    							) int id, 
    			//2
    			ModelMap model) {
        model.addAttribute("greeting", "Hellow  "+ name + " - ID -"+id);
        return "index";
    }
    
    
    //http://localhost:8080/AppSix/data/ticket/123
    @RequestMapping(value="/ticket/{ticketID}", method=RequestMethod.GET)
    public String findMyTicket(
    				@PathVariable int ticketID, //access pat variable
    				Model model){
    	 
    	  model.addAttribute("message", "Requsting Ticket with ID "+ ticketID);
          return "welcome";
    }
    
    
    //http://localhost:8080/AppSix/data/ticket/user/007/234
    @RequestMapping(value="/ticket/user/{userid}/{ticketID}", method=RequestMethod.GET)
    public String findUserTicket(
    								@PathVariable String ticketID, 
    								@PathVariable int userid, 
    								Model model) {
    	 
    	  model.addAttribute("message", "Requsting Ticket ID: "+ ticketID +" user Id :"+userid);
          return "welcome";
    }
    
    

    
    
    // http://localhost:8080/data/hellow.123
    @RequestMapping(value="/{textualPart:[a-z-]+}.{numericPart:[\\d]+}")
    public String regularExpression(
      @PathVariable String textualPart,
      @PathVariable String numericPart,
      Model model
    		){

    	 model.addAttribute("message","Textual part: " + textualPart + ", numeric part: " + numericPart);
         return "welcome";
         
      
    }
    
    
    //http://localhost:8080/AppSix/data/findMe/syed@gmail.com
    //@RequestMapping(value = "/findMe/{emailId}", method = RequestMethod.GET)
    @RequestMapping(value = "/findMe/{emailId:.+}", method = RequestMethod.GET)
    public String findMe(	
    						HttpServletRequest request,
            				HttpServletResponse response,
            				@PathVariable String emailId,
            				Model model
            				){
    	
    	 model.addAttribute("message","emailId: " + emailId );
         return "welcome";
         
				
}
    
    //http://localhost:8080/AppSix/data/android-marshmallow-6.0.1
    @RequestMapping("/{os:[a-z-]+}-{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}")
    public String pathVariableRegEx(
    							@PathVariable String os, 
    							@PathVariable String name, 
    							@PathVariable String version,
    							Model model
    							){

   	 model.addAttribute("message","Osversion: " + os +":" + name +":" + version );
        return "welcome";
    	
    	
    }
    
    
   // http://localhost:8080/AppSix/data/employee/Steve/Sales/3500/25
    @RequestMapping(value = "/employee/{empName}/{deptName}/{salary}/{age}")
    public String employeeName(
    							@PathVariable Map<String, String> empMap,
    							Model model) {
     
    	String json=null;
    	try {
			json = new ObjectMapper().writeValueAsString(empMap);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
      	 model.addAttribute("message","emp Data: " + json );
           return "welcome";
    	
    }

}
    
    
  
    

