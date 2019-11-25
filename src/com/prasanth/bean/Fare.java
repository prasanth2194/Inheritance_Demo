package com.prasanth.bean;

public class Fare extends Company {
	String origin;
	String destination;

	public String getOrigin() {
		return origin;
	}

	public Fare(String origin, String destination) {
		super();
		// this is not required. Compiler adds this by default.
		this.origin = origin;
		this.destination = destination;
	}

	public Fare(String origin, String destination, String company) {
		super(company);
		// this is required because, compiler wont add parameterized constructor
		// Also above constructor must be defined in Company class
		this.origin = origin;
		this.destination = destination;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "CompanyName: " + super.getCompanyName() + ", Fare [origin=" + origin + ", destination=" + destination
				+ "]";
	}

}
