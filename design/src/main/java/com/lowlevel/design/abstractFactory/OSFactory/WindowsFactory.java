package com.lowlevel.design.abstractFactory.OSFactory;

import com.lowlevel.design.abstractFactory.OSFactory.widows.WindowsButton;
import com.lowlevel.design.abstractFactory.OSFactory.widows.WindowsCheckBox;
import com.lowlevel.design.abstractFactory.UIFactory.Button;
import com.lowlevel.design.abstractFactory.UIFactory.CheckBox;
import com.lowlevel.design.abstractFactory.UIFactory.UIFactory;

public class WindowsFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

}
