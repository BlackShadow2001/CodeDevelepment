package com.lowlevel.design.chainOfResponsiblity;

public class ChainOfResposibility {

	public static void main(String[] args) {

		PaymentHandler paymentHandlerBank = new BankPaymentHandler();

		PaymentHandler paymentHandlercredit = new CreditPaymentHandler();
		PaymentHandler paymentHandlerUpi = new UPIPaymentHandler();

		paymentHandlerBank.setNextPaymentHandler(paymentHandlercredit);

		paymentHandlercredit.setNextPaymentHandler(paymentHandlerUpi);

		paymentHandlerBank.handlePayment(500);
		paymentHandlerBank.handlePayment(600);
		paymentHandlerBank.handlePayment(200);
		paymentHandlerBank.handlePayment(1200);

	}

}
