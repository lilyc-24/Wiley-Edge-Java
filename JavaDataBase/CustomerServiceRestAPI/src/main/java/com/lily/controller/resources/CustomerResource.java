package com.lily.controller.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lily.dto.CustomerList;
import com.lily.model.service.CustomerServiceImpl;

@RestController
public class CustomerResource {
	
	@Autowired
	private CustomerServiceImpl customerService;

	@GetMapping(path = "/customers/{customerID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerList> getCustomerByID(@PathVariable("customerID") int customerID){
		CustomerList customerList = new CustomerList(customerService.getCustomersByID(customerID));
		
		if(customerList.getCustomerList().size()>0) {
			return new ResponseEntity<CustomerList>(customerList, HttpStatus.FOUND);
		}else {
			return new ResponseEntity<CustomerList>(customerList,HttpStatus.NOT_FOUND);
		}
	}
}
