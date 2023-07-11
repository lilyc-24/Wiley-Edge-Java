package com.lily.model.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lily.dto.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		int detailsId = resultSet.getInt("DETAILSID");
		int customerId = resultSet.getInt("CUSTOMERID");
		int shareId = resultSet.getInt("SHAREID");
		String shareType = resultSet.getString("SHARETYPE");
		int quantity = resultSet.getInt("QUANTITY");
		
		Customer customer = new Customer(detailsId, customerId, shareId, shareType, quantity);
		
		return customer;
	}


}
