package com.lowlevel.design.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCard {

	private String name;
	private String cardNumber;
	private String cvv;
}
