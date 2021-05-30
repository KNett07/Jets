package com.skilldistillery.jets.entity;

public class CargoPlane extends Jet implements CargoCarrier {
	protected int maxLoad;
	
	public CargoPlane(String model, int speed, int range, double price, int maxLoad) {
		super(model, speed, range, price);
		this.maxLoad = maxLoad;
	}
	
	@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("This aircraft can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange()) + " hours");
	}
	
	
	
@Override
 public void loadCargo() {
	System.out.println(getModel() + " now initiating cargo load to max load capacity of " + getMaxLoad() + " pounds.");
	
 }

public int getMaxLoad() {
	return maxLoad;
}

public void setMaxLoad(int maxLoad) {
	this.maxLoad = maxLoad;
}

}

