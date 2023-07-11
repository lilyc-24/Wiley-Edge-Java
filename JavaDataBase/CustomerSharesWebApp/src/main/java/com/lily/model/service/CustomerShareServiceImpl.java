package com.lily.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lily.dto.Customer;
import com.lily.dto.CustomerList;
import com.lily.dto.CustomerShare;
import com.lily.dto.Share;

@Service
public class CustomerShareServiceImpl implements CustomerShareService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerShare> getCustomerShares(int customerID) {
		
		List<CustomerShare> customerShares = new ArrayList<CustomerShare>();
		CustomerList customerList;
		
		try {
			customerList = restTemplate.getForObject("http://localhost:8084/customers/"+customerID, CustomerList.class);
		}catch (Exception e) {
			return null;
		}		
		
		
		for(Customer customer:customerList.getCustomerList()) {
			Share share;
			try {
				share = restTemplate.getForObject("http://localhost:8086/shares/"+customer.getShareId(), Share.class);
				CustomerShare customerShare = new CustomerShare(customerID, share.getShareName(), customer.getShareQuantity(), share.getMarketPrice(), (share.getMarketPrice()*customer.getShareQuantity()), customer.getShareType());
				customerShares.add(customerShare);
			}catch (Exception e) {
				CustomerShare customerShare = new CustomerShare(customerID, "Not valid share name", customer.getShareQuantity(), 0, 0, customer.getShareType());
				customerShares.add(customerShare);
			}
			
		}
		return customerShares;
	}

}
