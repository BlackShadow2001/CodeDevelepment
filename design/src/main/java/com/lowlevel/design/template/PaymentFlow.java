package com.lowlevel.design.template;

public abstract class PaymentFlow {

	abstract void validateRequest();

	abstract void calculateFees();

	abstract void debitAmount();

	abstract void creditAmount();

	/**
	 * This is the template method: which defines the order of steps to execute the
	 * task.
	 */
	final void sendMoney() {
		validateRequest();
		calculateFees();
		debitAmount();
		creditAmount();
	}

}
