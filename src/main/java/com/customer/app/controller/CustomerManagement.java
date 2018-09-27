package com.customer.app.controller;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.app.beans.CustomerDetails;

@RefreshScope
@RestController
@RequestMapping("/API")
public class CustomerManagement {

	CustomerDetails custDetails = null;
	
	@RequestMapping(value = "/CustomerDetails/{custid}", method = RequestMethod.GET)
	public CustomerDetails getCustDetails(@PathVariable("custid") long custid){
		custDetails = new CustomerDetails();
		
		if(custid==123) {
			custDetails.setName("Jitendra");
			custDetails.setAddress("Delhi");
			custDetails.setContactNo("9999999999");;
		}else {
			custDetails.setName("Guest");
			custDetails.setAddress("Noida");
			custDetails.setContactNo("8888888888");;
		}		
		return custDetails;
	}
}
