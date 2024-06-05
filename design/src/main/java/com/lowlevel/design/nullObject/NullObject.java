package com.lowlevel.design.nullObject;

import com.lowlevel.design.strategy.PaymentStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * To avoid checking not null for object, we creating null object for some
 * default class usage.
 * 
 * @author rubin
 *
 */
@Slf4j
public class NullObject implements PaymentStrategy {

	@Override
	public void collectPaymentDetails() {
		log.info("Payment details for null object like for default payment method(Cash on delivery)");

	}

	@Override
	public boolean validatePaymentDetails() {
		log.info("Validating the user");
		return false;
	}

	@Override
	public void pay(int amount) {
		log.info("Payment will done at the time of delivery");
	}

}
