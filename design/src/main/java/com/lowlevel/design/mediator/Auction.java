package com.lowlevel.design.mediator;

import java.util.ArrayList;

public class Auction implements AuctionMediator {

	ArrayList<Colleague> colleagueList = new ArrayList<>();

	@Override
	public void addBuilder(Colleague colleague) {
		colleagueList.add(colleague);
	}

	@Override
	public void placeBid(Colleague colleague, int bidAmount) {

		colleagueList.stream().filter(col -> !col.getName().equals(colleague.getName()))
				.forEach(col -> col.receiveBidNotification(bidAmount));
	}

}
