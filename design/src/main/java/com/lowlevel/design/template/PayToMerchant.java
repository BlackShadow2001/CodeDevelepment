package com.lowlevel.design.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayToMerchant extends PaymentFlow {

	@Override
	void validateRequest() {
		log.info("Validate logic for pay to merchant");
	}

	@Override
	void calculateFees() {
		log.info("There is 2% fees for pay to merchant");
	}

	@Override
	void debitAmount() {
		log.info("Debit amount logic for PayToMerchant");
	}

	@Override
	void creditAmount() {
		log.info("Credit amount logic for PayToMerchant");
	}

}
