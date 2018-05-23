package com.ssn.appsix.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/data")
public class AccessingDataEgController {

	//http://localhost:8080/AppSix/data?name=syed
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name, ModelMap model) {
        model.addAttribute("greeting", "Hellow  "+ name);
        return "index";
    }
}
