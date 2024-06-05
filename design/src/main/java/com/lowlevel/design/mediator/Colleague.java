package com.lowlevel.design.mediator;

public interface Colleague {

	void placeBid(int bidAmount);

	void receiveBidNotification(int bidAmount);

	String getName();
}
