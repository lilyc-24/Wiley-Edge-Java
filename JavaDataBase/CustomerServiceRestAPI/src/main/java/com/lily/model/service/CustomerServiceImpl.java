package com.lily.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lily.dto.Customer;
import com.lily.model.persistance.CustomerPersistanceImpl;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerPersistanceImpl customerDao;
	
	@Override
	public List<Customer> getCustomersByID(int customerId) {
		try {
			return customerDao.getByCustomerID(customerId);
		}catch (Exception e) {
			return null;
		}
			
		}
		
	}


