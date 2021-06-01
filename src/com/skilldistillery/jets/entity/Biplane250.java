package com.skilldistillery.jets.entity;

public class Biplane250 extends Jet implements CargoCarrier {

	public Biplane250(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double distance = (getRange() / getSpeed());
		System.out.println(toString());
		System.out.println("This biplane can travel at a top speed of " + getSpeed() + " mph for "
				+ distance + " miles without needing fuel.");

	}

	public void loadCargo() {
		System.out.println(getModel() + ": Does this thing fly on hopes and dreams?!");
	}

}