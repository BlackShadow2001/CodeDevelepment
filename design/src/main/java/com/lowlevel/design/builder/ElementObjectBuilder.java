package com.lowlevel.design.builder;

/**
 * We can create this builder using abstract or interface also
 * 
 * @author rubin
 *
 */
public class ElementObjectBuilder {

	private String name;
	private String lastName;
	private int price;
	private int count;

	public ElementObjectBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public ElementObjectBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ElementObjectBuilder setPrice(int price) {
		this.price = price;
		return this;
	}

	public ElementObjectBuilder setCount(int count) {
		this.count = count;
		return this;
	}

	public ElementObject build() {
		return new ElementObject(name, lastName, price, count);
	}
}
