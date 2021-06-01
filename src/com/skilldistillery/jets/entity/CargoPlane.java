package com.skilldistillery.jets.entity;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double distance = (getRange() / getSpeed());
		System.out.println(toString());
		System.out.println("This cargo plane can travel at a top speed of " + getSpeed() + " mph for "
				+ distance + " miles without needing fuel.");
	}

	@Override
	public void loadCargo() {
		System.out.println(getModel() + ": I think we can fit a little more on there...");

	}

}
