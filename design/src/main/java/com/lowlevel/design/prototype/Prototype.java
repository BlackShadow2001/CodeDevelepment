package com.lowlevel.design.prototype;

public class Prototype {

	public static void main(String[] args) {

		NewDemo newDemo = new NewDemo("Name", 2);
		NewDemo newDemoClone = newDemo.clone();
		System.out.println("newDemoCLone - " + newDemoClone.toString());
	}

}
