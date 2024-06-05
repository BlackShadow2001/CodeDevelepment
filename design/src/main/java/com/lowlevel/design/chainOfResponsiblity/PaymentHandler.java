package com.lowlevel.design.chainOfResponsiblity;

public abstract class PaymentHandler {

	protected PaymentHandler nextPaymentHandler;

	void setNextPaymentHandler(PaymentHandler nextPaymentHandler) {
		this.nextPaymentHandler = nextPaymentHandler;
	}

	abstract void handlePayment(double amount);
}
