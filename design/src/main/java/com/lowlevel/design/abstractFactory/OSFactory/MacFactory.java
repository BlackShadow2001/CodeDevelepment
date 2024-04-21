package com.lowlevel.design.abstractFactory.OSFactory;

import com.lowlevel.design.abstractFactory.OSFactory.widows.MacButton;
import com.lowlevel.design.abstractFactory.OSFactory.widows.MacCheckBox;
import com.lowlevel.design.abstractFactory.UIFactory.Button;
import com.lowlevel.design.abstractFactory.UIFactory.CheckBox;
import com.lowlevel.design.abstractFactory.UIFactory.UIFactory;

public class MacFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

}
