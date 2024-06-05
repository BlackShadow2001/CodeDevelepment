package com.lowlevel.design.singleton;

public class Eager {

	private static Eager exampleA = new Eager();

	private Eager() {

	}

	public static Eager getInstance() {
		return exampleA;
	}
}
