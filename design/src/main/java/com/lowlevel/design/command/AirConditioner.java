package com.lowlevel.design.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirConditioner {

	boolean isOn;
	int temperature;

	public void turnOnAC() {
		isOn = true;
		log.info("AC is ON");
	}

	public void turnOffAC() {
		isOn = false;
		log.info("AC is OFF");
	}

	public void setTemperature(int temp) {
		temperature = temp;
		log.info("AC temperature changes to {}", temp);
	}
}
