package com.lowlevel.design.template;

public class TemplateMain {

	public static void main(String[] args) {

		PaymentFlow paymentFlow = new PayToFriend();
		paymentFlow.sendMoney();

		PaymentFlow paymentFlowMerchant = new PayToMerchant();
		paymentFlowMerchant.sendMoney();
	}

}
