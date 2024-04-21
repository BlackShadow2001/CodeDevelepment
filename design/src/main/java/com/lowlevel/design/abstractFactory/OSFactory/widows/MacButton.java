package com.lowlevel.design.abstractFactory.OSFactory.widows;

import com.lowlevel.design.abstractFactory.UIFactory.Button;

public class MacButton implements Button {

	@Override
	public void printMessage() {
		System.out.println("Mac button was clicked ");
	}

}