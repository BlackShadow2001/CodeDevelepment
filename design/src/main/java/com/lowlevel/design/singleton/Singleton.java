package com.lowlevel.design.singleton;

public class Singleton {

	public static void main(String[] args) {
		/**
		 * This is not possible becase of Eager eager = new Eager();
		 */

		Eager eager = Eager.getInstance();
	}

}
