package com.lowlevel.design.builder;

public class ElementObject {

	private String name;
	private String lastName;
	private int price;
	private int count;

	public ElementObject(String name, String lastName, int price, int count) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "ElementObject [name=" + name + ", lastName=" + lastName + ", price=" + price + ", count=" + count + "]";
	}

}
