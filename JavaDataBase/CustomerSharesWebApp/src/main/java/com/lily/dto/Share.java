package com.lily.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Share {
	
	private int shareId;
	private String shareName;
	private double marketPrice;

}
