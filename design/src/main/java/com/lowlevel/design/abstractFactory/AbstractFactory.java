package com.lowlevel.design.abstractFactory;

import com.lowlevel.design.abstractFactory.OSFactory.MacFactory;
import com.lowlevel.design.abstractFactory.OSFactory.WindowsFactory;
import com.lowlevel.design.abstractFactory.UIFactory.Button;
import com.lowlevel.design.abstractFactory.UIFactory.CheckBox;
import com.lowlevel.design.abstractFactory.UIFactory.UIFactory;

public class AbstractFactory {
	public static class Application {
		private CheckBox checkBox;
		private Button button;

		public Application(UIFactory uiFactory) {
			this.checkBox = uiFactory.createCheckBox();
			this.button = uiFactory.createButton();
		}

		public void printStatement() {
			checkBox.printMessage();
			button.printMessage();
		}
	}

	public static void main(String[] args) {

		Application application = new Application(new WindowsFactory());
		application.printStatement();

		System.out.println("==================");

		Application application2 = new Application(new MacFactory());
		application2.printStatement();
	}

}
