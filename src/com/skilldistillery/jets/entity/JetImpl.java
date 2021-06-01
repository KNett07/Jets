package com.skilldistillery.jets.entity;

public class JetImpl extends Jet {

	public JetImpl(String model, int speed, int range, double price) {
		super(model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println(toString());
	}

}