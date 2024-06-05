package com.lowlevel.design.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayToFriend extends PaymentFlow {

	@Override
	void validateRequest() {
		log.info("Validate logic for pay to friend");
	}

	@Override
	void calculateFees() {
		log.info("There is no fees for pay to friend");
	}

	@Override
	void debitAmount() {
		log.info("Debit amount logic for PayToFriend");
	}

	@Override
	void creditAmount() {
		log.info("Credit amount logic for PayToFriend");
	}

}
