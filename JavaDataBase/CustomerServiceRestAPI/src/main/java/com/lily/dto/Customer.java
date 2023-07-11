package com.lily.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

	private int detailsId;
	private int customerId;
	private int shareId;
	private String shareType;
	private int shareQuantity;
}
