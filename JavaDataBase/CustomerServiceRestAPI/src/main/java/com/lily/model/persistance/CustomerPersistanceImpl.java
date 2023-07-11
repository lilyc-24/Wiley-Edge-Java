package com.lily.model.persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lily.dto.Customer;

@Repository
public class CustomerPersistanceImpl implements CustomerPersistance {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Customer> getByCustomerID(int customerId) {
		String query = "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";
		return jdbcTemplate.query(query, new CustomerRowMapper(), customerId);
	}

}
