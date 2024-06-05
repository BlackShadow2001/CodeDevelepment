package com.lowlevel.design.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentByCreditCard implements PaymentStrategy {

	private CreditCard creditCard;

	@Override
	public void collectPaymentDetails() {
		this.creditCard = new CreditCard("name", "xxxx xxxx xx45", "yy7");
	}

	@Override
	public boolean validatePaymentDetails() {
		log.info("PaymentByCreditCard : validatePaymentDetails - {}", creditCard);
		return true;
	}

	@Override
	public void pay(int amount) {
		log.info("paymet done for - {} is -{}", creditCard, amount);

	}

}
