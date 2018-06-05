package com.ssn.appsix.HRM.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssn.appsix.HRM.model.Customer;
import com.ssn.appsix.HRM.model.CustomerList;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public @ResponseBody Customer getCustomerData() {
 
		Customer customer = new Customer("001", "scott", "Rob", 30);
		return customer;
	}
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody CustomerList getCustomersData() {
 
		
		List<Customer> customers = new ArrayList<Customer>();
		Customer e1 = new Customer("001", "Steve", "Rob", 30);
		Customer e2 = new Customer("002", "scott", "Rob", 30);
		Customer e3 = new Customer("002", "mack", "Rob", 30);
 
		customers.add(e1);
		customers.add(e2);
		customers.add(e3);
 
		CustomerList customerList = new CustomerList();
		customerList.setCustomer(customers);
		
		
		return customerList;
	}
	
	
	

}
