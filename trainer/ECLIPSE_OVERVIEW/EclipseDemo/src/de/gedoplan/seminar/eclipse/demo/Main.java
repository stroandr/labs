package de.gedoplan.seminar.eclipse.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List <Fahrzeug> list = new ArrayList <Fahrzeug> ();
	
	public static void main(String[] args) {
		
		list.add(new Auto("320i", FahrzeugArt.Landfahrzeug, "rot", "BMW", "2 Liter"));
		list.add(new Auto("Golf", FahrzeugArt.Landfahrzeug, "gelb", "VW", "1 Liter"));
		list.add(new Schiff("Queen Mary", FahrzeugArt.Wasserfahrzeug, "schwarz-weiss", "Cunard", "Long Beach", 81235));
		
		FahrzeugWorker fw = new FahrzeugWorker();
		fw.printFahrzeuge(list);
		
	}

}
