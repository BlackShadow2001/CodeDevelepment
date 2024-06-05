package com.lowlevel.design.chainOfResponsiblity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditPaymentHandler extends PaymentHandler {

	@Override
	void handlePayment(double amount) {
		if (amount <= 1000)
			log.info("Amount paid by credit card");
		else
			nextPaymentHandler.handlePayment(amount);
	}

}
