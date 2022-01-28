package com.ty;

public class Person {
	private String name;
	private Mobile mobile;

	void walk() {
		System.out.println("person is walking");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

}
