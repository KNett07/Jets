package com.skilldistillery.jets.entity;

public class Nimbus3000 extends Jet implements FloatAway {

	public Nimbus3000(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double distance = (getRange() / getSpeed());
		System.out.println(toString());
		System.out.println("This magic broom can travel at a top speed of " + getSpeed() + " mph for "
				+ distance + " mile without needing another spell.");
	}

	@Override
	public void allFloat() {
		System.out.println(getModel() + ": Wingardium Leviosa!");
	}

}