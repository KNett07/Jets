package com.skilldistillery.jets.entity;

public class Jet747 extends Jet implements CargoCarrier {
	protected int warpSpeed;
	
	public Jet747(String model, int speed, int range, double price, int warpSpeed) {
		super(model, speed, range, price);
		this.warpSpeed = warpSpeed;
	}
	
	@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("This aircraft can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange() + " hours."));
	}
	
	@Override
	public void loadCargo() {
		System.out.println(getModel() + " now initiating warp speed with a booster of " + getWarpSpeed() + " per second." );
	}

	public int getWarpSpeed() {
		return warpSpeed;
	}

	public void setWarpSpeed(int warpSpeed) {
		this.warpSpeed = warpSpeed;
	}
	

}

