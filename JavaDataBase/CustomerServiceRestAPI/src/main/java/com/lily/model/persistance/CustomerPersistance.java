package com.lily.model.persistance;

import java.util.List;

import com.lily.dto.Customer;

public interface CustomerPersistance {

	public List<Customer> getByCustomerID(int customerId);
}
