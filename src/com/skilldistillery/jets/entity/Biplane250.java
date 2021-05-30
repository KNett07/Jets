package com.skilldistillery.jets.entity;

public class Biplane250 extends Jet implements CargoCarrier {
	protected int oneBagOrTwo;


public Biplane250(String model, int speed, int range, double price, int oneBagOrTwo) {
	super(model, speed, range, price);
	this.oneBagOrTwo = oneBagOrTwo;
}

@Override
public void fly() {
	System.out.println(toString());
	System.out.println("This aircraft can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange()) + " hours.");
	
}
public void loadCargo() {
	System.out.println(getModel() + " now deciding if each guest can bring one bag or two: " + getOneBagOrTwo() + " bags.");
}

public int getOneBagOrTwo() {
	return oneBagOrTwo;
}

public void setOneBagOrTwo(int oneBagOrTwo) {
	this.oneBagOrTwo = oneBagOrTwo;
}


}