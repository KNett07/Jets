package com.skilldistillery.jets.entity;

public class JetImpl extends Jet{



public JetImpl(String model, int speed, int range, double price) {
	super(model,speed,range,price);
	
}

@Override 
public void fly() {
	System.out.println(toString());
	System.out.println("This aicraft can travel at a top speed for " + (getSpeed()/getRange()) + " hours.");
}


//@Override
//public String toString() {
//	return "The information for this Jet [Model: " + getModel() + ", Speed: " + getSpeed() + ", Range:" + getRange() + ", Price; " + getPrice() + " thousand ";
		
 
//}

}