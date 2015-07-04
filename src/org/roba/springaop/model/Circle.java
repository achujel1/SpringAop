package org.roba.springaop.model;

public class Circle {
	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
		// Adding a print line message to see which values have been initialized
		// by Spring
		System.out.println("Circle setter called. Argument: " + name);
		throw (new RuntimeException());
	}

	public String setNameandReturn(String name) {
		this.name = name;
		// Adding a print line message to see which values have been initialized
		// by Spring
		System.out.println("Circle setter called. Argument: " + name);
		return name;
	}

}
