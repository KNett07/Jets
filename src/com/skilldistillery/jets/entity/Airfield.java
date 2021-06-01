package com.skilldistillery.jets.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	List<Jet> jets1;

	public Airfield() {
		jets1 = new ArrayList<>();

	}

	public void addJet(Jet j) {
		jets1.add(j);
	}

	public void removeJet(Jet j) {
		jets1.remove(j);
	}

	public void listFleet() {
		System.out.println("Entire Current Fleet: ");

		for (int i = 0; i < jets1.size(); i++) {
			System.out.println(this.jets1.get(i).toString());
			System.out.println();

		}
	}

	public void flyAllJets() {
		for (int i = 0; i < jets1.size(); i++) {
			jets1.get(i).fly();

		}

	}

	public void fastestJet() {
		Jet fastest = jets1.get(0);
		for (int i = 1; i < jets1.size(); i++) {
			if (fastest.getSpeed() < jets1.get(i).getSpeed()) {
				fastest = jets1.get(i);
			}
		}
		System.out.println(fastest.toString());
	}

	public void longestRange() {
		Jet longest = jets1.get(0);
		for (int i = 1; i < jets1.size(); i++) {
			if (longest.getRange() < jets1.get(i).getRange()) {
				longest = jets1.get(i);
			}
		}
		System.out.println(longest.toString());
	}

	public void allCargoJets() {
		for (int i = 0; i < jets1.size(); i++) {
			if (jets1.get(i) instanceof CargoCarrier) {
				((CargoCarrier) jets1.get(i)).loadCargo();
			}
		}

	}

	public void allFloatAway() {
		for (int i = 0; i < jets1.size(); i++) {
			if (jets1.get(i) instanceof FloatAway) {
				((FloatAway) jets1.get(i)).allFloat();
			}
		}

	}

	public Jet addJetToFleet(Scanner input) {

		int range, speed;
		double price;
		String model;
		System.out.println("Please enter a model: ");
		model = input.nextLine();
		System.out.println("Please enter a speed: ");
		speed = input.nextInt();
		System.out.println("Please enter a range: ");
		range = input.nextInt();
		System.out.println("Please enter a price: ");
		price = input.nextDouble();
		input.nextLine();
		Jet jet = new JetImpl(model, speed, range, price);
		return jet;

	}

	public Jet removeJetFromFleet(Scanner input) {
		System.out.println("Enter the model of jet you would like to remove: ");
		String model = input.nextLine();
		Jet jetToRemove = null;

		for (Jet jet : jets1) {
			if (model.equalsIgnoreCase(jet.getModel())) {
				jetToRemove = jet;
			}

		}
		System.out.println("");
		return jetToRemove;

	}

}
