package com.skilldistillery.jets.entity;

public class Balloon3000 extends Jet implements FloatAway {
	public Balloon3000(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void allFloat() {
		System.out.println(getModel() + ": We have started the fire and the balloon will take us away soon!");
	}

	@Override
	public void fly() {
		double distance = (getRange() / getSpeed());
		System.out.println(toString());
		System.out.println("This balloon can travel at a top speed of " + getSpeed() + " mph for " + distance
				+ " without needing fuel.");
	}

}
