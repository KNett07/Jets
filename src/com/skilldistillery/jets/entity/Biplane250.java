package com.skilldistillery.jets.entity;

public class Biplane250 extends Jet implements CargoCarrier {
	protected int oneBagOrTwo;


public Biplane250(String model, int speed, int range, double price) {
	super(model, speed, range, price);
}

@Override
public void fly() {
	System.out.println(toString());
	System.out.println("This aircraft can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange()) + " hours.");
	
}
public void loadCargo() {
	System.out.println(getModel() + " now initiating cargo load to max load capacity ");
}

}