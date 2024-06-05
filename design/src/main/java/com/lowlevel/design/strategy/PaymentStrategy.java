package com.lowlevel.design.strategy;

/**
 * Created the strategy, based on need we can add additional payments like
 * debit,netbanking,upi payment etc...
 * 
 * @author rubin
 *
 */
public interface PaymentStrategy {

	void collectPaymentDetails();

	boolean validatePaymentDetails();

	void pay(int amount);
}
