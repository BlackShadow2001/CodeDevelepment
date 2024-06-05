package com.lowlevel.design.structual.adapter;

public class AdapterMain {

	public static void main(String[] args) {

		PenAdapter penAdapter = new PenAdapter(new ModernPen());
		penAdapter.write("Notes");
	}

}
