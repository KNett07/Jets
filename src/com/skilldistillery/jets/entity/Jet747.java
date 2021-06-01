package com.skilldistillery.jets.entity;

public class Jet747 extends Jet implements CargoCarrier {
	protected int warpSpeed;

	public Jet747(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double distance = (getRange() / getSpeed());
		System.out.println(toString());
		System.out.println("This 747 can travel at a top speed of " + getSpeed() + " mph for "
				+ distance + " miles without needing fuel.");
	}

	@Override
	public void loadCargo() {
		System.out.println(getModel() + ": Load em up fly em out!");
	}

}
