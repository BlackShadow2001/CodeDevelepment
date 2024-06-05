package com.lowlevel.design.prototype;

public class NewDemo implements ProtoTypeInterface {
	private String name;
	private int count;

	public NewDemo(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "NewDemo [name=" + name + ", count=" + count + "]";
	}

	@Override
	public NewDemo clone() {
		return new NewDemo(name, count);
	}
}
