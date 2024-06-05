package com.lowlevel.design.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandMain {

	public static void main(String[] args) {

		AirConditioner airConditioner = new AirConditioner();
		MyRemoteControl myRemoteControl = new MyRemoteControl(new TurnOffACCommand(airConditioner));
		myRemoteControl.pressButton();
		log.info("stack - {}", myRemoteControl.commandHistory);
		myRemoteControl.undo();

		MyRemoteControl myRemoteControlOn = new MyRemoteControl(new TurnOnACCommand(airConditioner));
		myRemoteControlOn.pressButton();
		myRemoteControlOn.undo();
		log.info("stack - {}", myRemoteControl.commandHistory);
	}

}
