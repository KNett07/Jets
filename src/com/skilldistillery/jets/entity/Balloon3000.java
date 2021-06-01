package com.skilldistillery.jets.entity;

public class Balloon3000 extends Jet implements FloatAway {
	protected int floatRate;
	public Balloon3000(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void allFloat() {
		System.out.println(getModel() + ": We have started the fire and the balloon will fill and take us away soon!");
		System.out.println("Floating away at a rate of: " + floatRate + " per minute.");
	}
	
	@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("this aircraft can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange()) + " hours.");
	}

	public int getFloatRate() {
		return floatRate;
	}

	public void setFloatRate(int floatRate) {
		this.floatRate = floatRate;
	}
	
	

}
