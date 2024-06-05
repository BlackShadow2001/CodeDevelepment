package com.lowlevel.design.structual.adapter;

public class PenAdapter implements Pen {

	private final ModernPen modernPen;

	public PenAdapter(ModernPen modernPen) {
		this.modernPen = modernPen;
	}

	@Override
	public void write(String assignment) {

		modernPen.writeImplementation(assignment);
	}

}
