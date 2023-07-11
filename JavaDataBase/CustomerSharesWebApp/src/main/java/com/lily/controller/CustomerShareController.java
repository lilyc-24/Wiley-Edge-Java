package com.lily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lily.dto.CustomerShare;
import com.lily.model.service.CustomerShareService;


@Controller
public class CustomerShareController {
	
	@Autowired
	private CustomerShareService customerShareService;
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("/inputCustomerID")
	public ModelAndView inputCustomerID() {
		return new ModelAndView("InputCustomerID");
	}
	
	@RequestMapping("/displayCustomerShare")
	public ModelAndView displayCustomerShare(@RequestParam("cID") int customerID) {
		ModelAndView modelAndView = new ModelAndView();
		List<CustomerShare> customerShareList = customerShareService.getCustomerShares(customerID);
		
		if (customerShareList ==null) {
			modelAndView.addObject("message", "Customer with ID "+customerID+" does not exist.");
			modelAndView.setViewName("Output");
		}else {
			modelAndView.addObject("csList", customerShareList);
			modelAndView.setViewName("DisplayCustomerShares");
		}
		
		return modelAndView;
	}
}
