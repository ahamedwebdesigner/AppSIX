package com.ssn.appsix.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class TypesOfRequestsController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
    String get() {
        return "Hello from get";
    }
	
	
	
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    String delete() {
        return "Hello from delete";
    }
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    String post() {
        return "Hello from post";
    }
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    String put() {
        return "Hello from put";
    }
    @RequestMapping(method = RequestMethod.PATCH)
    @ResponseBody
    String patch() {
        return "Hello from patch";
    }
    
    @RequestMapping(method = RequestMethod.HEAD)
    @ResponseBody
    String head() {
        return "Hello from head";
    }
    
    
	
	@RequestMapping(value="/method4", headers="userName=syed",method = RequestMethod.GET)
	@ResponseBody
	public String method4(){
		return "Hellow this is the output fomr method 4";
	}
	
	
}
