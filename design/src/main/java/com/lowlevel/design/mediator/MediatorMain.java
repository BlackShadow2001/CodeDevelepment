package com.lowlevel.design.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MediatorMain {

	public static void main(String[] args) {

		AuctionMediator auctionMediator = new Auction();

		Colleague bidder1 = new Bidder(auctionMediator, "A");
		Colleague bidder2 = new Bidder(auctionMediator, "B");
		Colleague bidder3 = new Bidder(auctionMediator, "C");
		Colleague bidder4 = new Bidder(auctionMediator, "D");

		bidder2.placeBid(500);
		log.info("******+++++++++*******");
		bidder1.placeBid(1200);
		log.info("******+++++++++*******");
		bidder1.placeBid(3000);
	}

}
