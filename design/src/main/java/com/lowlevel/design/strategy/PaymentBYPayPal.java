package com.lowlevel.design.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentBYPayPal implements PaymentStrategy {

	private String email;
	private String password;

	@Override
	public void collectPaymentDetails() {
		email = "dummy@gmail.com";
		password = "wereo@RU_1";

	}

	@Override
	public boolean validatePaymentDetails() {
		return true;
	}

	@Override
	public void pay(int amount) {
		log.info("Payment done using payPal is -{}", amount);
	}

}
