package com.lily.model.service;

import java.util.List;

import com.lily.dto.CustomerShare;

public interface CustomerShareService {

	public List<CustomerShare> getCustomerShares(int customerID);
	
}
