package com.lowlevel.design.command;

public class TurnOffACCommand extends Command {

	private final AirConditioner airConditioner;

	public TurnOffACCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnOffAC();
	}

	@Override
	public void undo() {
		airConditioner.turnOnAC();
	}

}
