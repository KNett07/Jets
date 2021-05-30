package com.skilldistillery.jets.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	
	List<Jet> jets1 = readJetsFromFile("jets.txt");
	private List<Jet> jets;
	private Scanner kb = new Scanner(System.in);
	
	public void listFleet() {
		System.out.println("This is the whole fleet: ");
		
		for (int i = 0; i < jets1.size(); i++) {
			System.out.println(this.jets1.get(i));
			System.out.println();
			
		}
	}
	private List<Jet> readJetsFromFile(String file) {
		List<Jet> jets = new ArrayList<Jet>();
		try 
			(BufferedReader bufIn = new BufferedReader(new FileReader(file))){
			Jet jet;
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFields = line.split(" , ");
				String model = jetFields[0];
				int speed = Integer.parseInt(jetFields[1]);
				int range = Integer.parseInt(jetFields[2]);
				double price = Double.parseDouble(jetFields[3]);
				String type = jetFields[4];
//				jets.add(jets);
			}
			bufIn.close();
		} catch (IOException e) {
			System.out.println(e);
			
		}
		return jets;
	}



private boolean fly() {
	return true;
}


}
