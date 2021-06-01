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
				System.out.println("Thank you for visiting the Airfield, buh bye!");
				notNine = false;
				break;

			}

		}

	}

	public void mainMenu() {
		System.out.println("****Welcome to the Airfield, what would you like to do with your fleet?****");
		System.out.println("\t\t1. Fleet Details");
		System.out.println("\t\t2. Fly the Fleet");
		System.out.println("\t\t3. Fastest Jet");
		System.out.println("\t\t4. Longest Range Jet");
		System.out.println("\t\t5. Load all Cargo Jets");
		System.out.println("\t\t6. Float away!");
		System.out.println("\t\t7. Add to the Fleet");
		System.out.println("\t\t8. Remove from the Fleet");
		System.out.println("\t\t9. Quit");
		System.out.println("****************************************************************************");

	}

}
