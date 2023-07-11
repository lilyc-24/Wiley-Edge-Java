package com.lily.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerShare {
	
	private int customerId;
	private String shareName;
	private int quantity;
	private double unitPrice;
	private double totalValuation;
	private String shareType;
}
