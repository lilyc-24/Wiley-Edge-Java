package com.lily.model.service;

import java.util.List;

import com.lily.dto.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomersByID(int customerId);
	
}
