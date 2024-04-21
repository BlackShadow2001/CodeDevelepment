package com.lowlevel.design.abstractFactory.OSFactory.widows;

import com.lowlevel.design.abstractFactory.UIFactory.Button;

public class WindowsButton implements Button {

	@Override
	public void printMessage() {
		System.out.println("Windows button was clicked ");
	}

}
