package com.lowlevel.design.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bidder implements Colleague {

	private final AuctionMediator auctionMediator;

	private final String name;

	public Bidder(AuctionMediator auctionMediator, String name) {
		this.auctionMediator = auctionMediator;
		this.name = name;
		this.auctionMediator.addBuilder(this);
	}

	@Override
	public void placeBid(int bidAmount) {
		this.auctionMediator.placeBid(this, bidAmount);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		log.info("Bidder : {} got the notification that someone has put bid of : {}", name, bidAmount);
	}

	@Override
	public String getName() {
		return name;
	}

}
