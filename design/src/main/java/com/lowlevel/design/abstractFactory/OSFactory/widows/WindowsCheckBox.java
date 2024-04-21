package com.lowlevel.design.abstractFactory.OSFactory.widows;

import com.lowlevel.design.abstractFactory.UIFactory.CheckBox;

public class WindowsCheckBox implements CheckBox {

	@Override
	public void printMessage() {
		System.out.println("Windows check box was clicked");
	}

}
