package com.lowlevel.design.command;

public abstract class Command {

	public abstract void execute();

	public abstract void undo();
}
