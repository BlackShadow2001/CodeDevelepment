package com.lowlevel.design.chainOfResponsiblity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankPaymentHandler extends PaymentHandler {

	@Override
	void handlePayment(double amount) {
		if (amount <= 500)
			log.info("Amount paid by bank");
		else
			nextPaymentHandler.handlePayment(amount);
	}

}
