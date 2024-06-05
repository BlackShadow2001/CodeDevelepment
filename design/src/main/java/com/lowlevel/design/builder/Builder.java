package com.lowlevel.design.builder;

public class Builder {

	public static void main(String[] args) {

		ElementObject elementObjectBuild = new ElementObjectBuilder().setName("New").setCount(2).build();
		System.out.println(elementObjectBuild.toString());

	}

}
