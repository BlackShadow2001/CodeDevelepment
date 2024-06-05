package com.lowlevel.design.strategy;

import com.lowlevel.design.nullObject.NullObject;

public class StrategyAndNullObjectPattern {
	public static PaymentStrategy getPaymentStrategy(String message) {
		if (message == "credit")
			return new PaymentByCreditCard();
		else if (message == "pay")
			return new PaymentBYPayPal();
		else
			return new NullObject();
	}

	public static void main(String[] args) {

		PaymentStrategy paymentStrategy = getPaymentStrategy("credit");
		paymentStrategy.collectPaymentDetails();
		paymentStrategy.validatePaymentDetails();
		paymentStrategy.pay(21463534);
		PaymentStrategy paymentStrategyPay = getPaymentStrategy("pay");
		paymentStrategyPay.collectPaymentDetails();
		paymentStrategyPay.validatePaymentDetails();
		paymentStrategyPay.pay(21463534);
		PaymentStrategy paymentStrategyCOD = getPaymentStrategy("cod");
		paymentStrategyCOD.collectPaymentDetails();
		paymentStrategyCOD.validatePaymentDetails();
		paymentStrategyCOD.pay(7976);
	}

}
