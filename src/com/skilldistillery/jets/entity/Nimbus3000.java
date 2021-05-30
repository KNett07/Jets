package com.skilldistillery.jets.entity;

public class Nimbus3000 extends Jet implements FloatAway {
	protected int soarRate;


public Nimbus3000(String model, int speed, int range, double price, int balance) {
	super(model, speed, range, price);
	this.soarRate = balance;
}

@Override
public void fly() {
	System.out.println(toString());
	System.out.println("This magic broom can travel at a top speed of " + getSpeed() + " for " + (getSpeed()/getRange()) + " hours.");
}
@Override
public void floatAway() {
	System.out.println(getModel() + " now starting to float away at " + getSoarRate() + " per second!");
}

public int getSoarRate() {
	return soarRate;
}

public void setSoarRate(int soarRate) {
	this.soarRate = soarRate;
}


}