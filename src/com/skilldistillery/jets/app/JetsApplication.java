package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.skilldistillery.jets.entity.Airfield;
import com.skilldistillery.jets.entity.Balloon3000;
import com.skilldistillery.jets.entity.Biplane250;
import com.skilldistillery.jets.entity.CargoPlane;
import com.skilldistillery.jets.entity.Jet;
import com.skilldistillery.jets.entity.Jet747;
import com.skilldistillery.jets.entity.Nimbus3000;

public class JetsApplication {
	private Airfield airfield;

	public static Scanner input;
	protected int currentLength = 5;

	public JetsApplication() {
		
	}

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.airfield = jetsApp.readJetsFromFile("Jets.txt");
		jetsApp.launch(jetsApp.airfield);
		input.close();

	}

	public Airfield readJetsFromFile(String file) {
		Airfield jets = new Airfield();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(file))) {
			Jet jet;
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFields = line.split(",");
				String type = jetFields[0];
				String model = jetFields[1];
				int speed = Integer.parseInt(jetFields[2]);
				int range = Integer.parseInt(jetFields[3]);
				double price = Double.parseDouble(jetFields[4]);

				switch (type) {
				case "A":
					jet = new Jet747(model, speed, range, price);
					jets.addJet(jet);
					break;
				case "B":
					jet = new Balloon3000(model, speed, range, price);
					jets.addJet(jet);
					break;
				case "C":
					jet = new Biplane250(model, speed, range, price);
					jets.addJet(jet);
					break;
				case "D":
					jet = new CargoPlane(model, speed, range, price);
					jets.addJet(jet);
					break;
				case "E":
					jet = new Nimbus3000(model, speed, range, price);
					jets.addJet(jet);
					break;

				}
			}
			bufIn.close();
		} catch (IOException e) {
			System.out.println(e);

		}
		return jets;
	}

	private void launch(Airfield af) {
		input = new Scanner(System.in);
		boolean notNine = true;
		String choice; 
		while (notNine) {
			mainMenu();
			choice = input.nextLine();
			switch (choice) {
			case "1":
				af.listFleet();
				break;
			case "2":
				af.flyAllJets();
				break;
			case "3":
				af.fastestJet();
				break;
			case "4":
				af.longestRange();
				break;
			case "5":
				af.allCargoJets();
				break;
			case "6":
				af.allFloatAway();
				break;
			case "7":
				Jet jet2 = af.addJetToFleet(input);
				af.addJet(jet2);
				break;
			case "8":
				Jet jet3 = af.removeJetFromFleet(input);
				af.removeJet(jet3);
				
				break;
			case "9":
				System.out.println("Thank you for visiting, goodbye!");
				notNine = false;
				break;
				
			}
			
			
		}

	}

	public void mainMenu() {
		System.out.println("****Welcome to the Airfield, what would you like to do with your fleet?****");
		System.out.println("\t1. List Fleet");
		System.out.println("\t2. Fly all jets");
		System.out.println("\t3. View fastest Jet");
		System.out.println("\t4. View jet with longest range");
		System.out.println("\t5. Load all Cargo Jets");
		System.out.println("\t6. Float away!");
		System.out.println("\t7. Add a jet to the Fleet");
		System.out.println("\t8. Remove a jet from the Fleet");
		System.out.println("\t9. Quit");

	}

//		for(int i = 0; i < jets.length; i++) {
//			System.out.println("Model: " + jets[i].getModel() + "/nSpeed: " + jets[i].getSpeed() 
//					+ "/nRange: " + jets[i].getRange() + "/nPrice: " + jets[i].getPrice());
//			System.out.println();
//		}

//	}
//
//	private void flyAllJets() {
//		for(int i = 0; i < jets.length; i++) {
//			jets[i].fly();
//		}
//
//	}
//
//	private void fastestJet() {
//		Jet fastest = jets[0];
//		for (int i = 1; 1 < jets.length; i++) {
//			if (fastest.getSpeed() < jets[i].getSpeed()) {
//				fastest = jets[i];
//			}
//		}
//		System.out.println(fastest);
//	}
//
//	private void longestRange() {
//		Jet longest = jets[0];
//		for (int i = 1; i < jets.length; i++) {
//			if (longest.getRange() < jets[i].getRange()) {
//				longest = jets[i];
//			}
//		}
//		System.out.println(longest.toString());
//	}
//
//	private void allCargoJets() {
//		for(int i = 0; i < jets.length; i++) {
//			if(jets[i] instanceof CargoCarrier) {
//				((CargoPlane) jets[i]).loadCargo();
//			}
//		}
//
//	}
//
//	private void allFloatAway() {
//		for(int i = 0; i < jets.length; i++) {
//			if(jets[i] instanceof FloatAway) {
//				((Balloon3000) jets[i]).allFloat();
//			}
//		}
//		
//
//	}
//
//	private Jet addJetToFleet() {
//		int range, speed;
//		double price;
//		String model;
//		System.out.println("Please enter a model: ");
//		model = input.next();
//		System.out.println("Please enter a speed: ");
//		speed = input.nextInt();
//		System.out.println("Please enter a range: ");
//		range = input.nextInt();
//		System.out.println("Please enter a price: ");
//		price = input.nextDouble();
//		Jet jet = new JetImpl(model, speed, range, price);
//		return jet;
//		
//
//	}
//
//	private void removeJetFromFleet() {
//		System.out.println("Enter the model of jet you would like to remove: ");
//		for(Jet jet : airfield.getFlyAllJets()) {
//			airfield.getFlyAllJets().remove(jet);

}
//		System.out.println("");
//
//	}
