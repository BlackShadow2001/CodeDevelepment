package com.lowlevel.design.command;

public class TurnOnACCommand extends Command {

	private final AirConditioner airConditioner;

	public TurnOnACCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnOnAC();
	}

	@Override
	public void undo() {
		airConditioner.turnOffAC();
	}

}
