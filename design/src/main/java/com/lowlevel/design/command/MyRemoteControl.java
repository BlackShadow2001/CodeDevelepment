package com.lowlevel.design.command;

import java.util.Stack;

public class MyRemoteControl {

	Stack<Command> commandHistory = new Stack<>();
	private final Command command;

	public MyRemoteControl(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
		commandHistory.add(command);
	}

	public void undo() {
		if (!commandHistory.isEmpty())
			commandHistory.pop().undo();
	}
}
