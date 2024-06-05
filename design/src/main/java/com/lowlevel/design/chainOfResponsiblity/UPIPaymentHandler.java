package com.lowlevel.design.chainOfResponsiblity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UPIPaymentHandler extends PaymentHandler {

	@Override
	void handlePayment(double amount) {
		if (amount <= 1500)
			log.info("Amount paid by UPI");
		else
			nextPaymentHandler.handlePayment(amount);
	}

}
