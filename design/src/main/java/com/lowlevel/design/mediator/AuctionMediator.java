package com.lowlevel.design.mediator;

public interface AuctionMediator {

	void addBuilder(Colleague colleague);

	void placeBid(Colleague colleague, int bidAmount);
}
