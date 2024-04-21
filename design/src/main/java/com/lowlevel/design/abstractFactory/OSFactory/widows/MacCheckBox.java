package com.lowlevel.design.abstractFactory.OSFactory.widows;

import com.lowlevel.design.abstractFactory.UIFactory.CheckBox;

public class MacCheckBox implements CheckBox {

	@Override
	public void printMessage() {
		System.out.println("Mac check box was clicked");
	}

}
