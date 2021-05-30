package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entity.Airfield;
import com.skilldistillery.jets.entity.Jet;

public class JetsApplication {

	public static Scanner input;
	private Airfield airfield;
	private static Jet[] jets = new Jet[10];
	protected int currentLength = 5;

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.launch();

	}

	private void launch() {
		while (true) {
			mainMenu();
			System.out.println();
		}

	}

	public void mainMenu() {
		System.out.println("****Welcome to the Airfield, what would you like to do with your fleet?****");
		System.out.println("1. List Fleet");
//		TODO prints out model, speed, range and price of every jet in the fleet
		System.out.println("2. Fly all jets");
//		TODO calls fly method on entire fleet - lists name and flytime, based on speed and range
		System.out.println("3. View fastest Jet");
//		TODO search the collection to find the fastest and print all of its information
		System.out.println("4. View jet with longest range");
//		TODO search collection to find longest range and print all info on that jet
		System.out.println("5. Load all Cargo Jets");
//		TODO call  for only cargo jets to load
		System.out.println("6. Float away!");
//		TODO call for only balloons to load
		System.out.println("7.Add a jet to the Fleet");
//		TODO leave room for more jets to be added
		System.out.println("8. Remove a jet from the Fleet");
//		TODO take one out with remove command
		System.out.println("9. Quit");
//		TODO Quit entire program
		
		input = new Scanner(System.in);
		String choice = input.nextLine();
//		switch(choice) {
//		case 1:
//			listFleet();
//			break;
//		case 2:
//			flyAllJets();
//			break;
//		case 3:
//			fastestJet();
//			break;
//		case 4:
//			longestRange();
//			break;
//		case 5:
//			allCargoJets();
//			break;
//		case 6:
//			allFloatAway();
//			break;
//		case 7:
//			addJetToFleet();
//			break;
//		case 8:
//			removeJetFromFleet();
//			break;
//		case 9:
//			System.out.println("Thank you for visiting, goodbye!");
//			break;
//		} while(choice != 9);
//		
//		
//		private void listFleet() {
//			
//		}
//		
//		private void flyAllJets() {
//			
//		}
//		
//		private void fastestJet(){
//			
//		}
//		private void longestRange() {
//			
//		}
//		private void allCargoJets() {
//			
//		}
//		private void allFloatAway() {
//			
//		}
//		private void addJetToFleet() {
//			
//		}
//		private void removeJetFromFleet() {
//			
//		}
		
		
		
		
		
		
	}

}
