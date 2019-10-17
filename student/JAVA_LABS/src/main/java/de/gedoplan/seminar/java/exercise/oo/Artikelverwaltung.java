package de.gedoplan.seminar.java.exercise.oo;

import java.util.Arrays;

public class Artikelverwaltung {

	public static void main(String[] args) {
		
		Artikel myCar = new Artikel(47, "Mercedes", 19900);
			System.out.println(myCar);	
			
		Artikel myHouse = new Artikel(13, "Stadtvilla");
		System.out.println(myHouse);
		myHouse.setPreis(400000);
		System.out.println(myHouse);
		System.out.println("Das Objekt " + myHouse + " hat den Bruttopreis: " + myHouse.berechneBruttopreis());
		myHouse.setSteuersatz(1.07);
		System.out.println("Das Objekt " + myHouse + " hat den Bruttopreis: " + myHouse.berechneBruttopreis());
		
		ElektroArtikel bohrmaschine = new ElektroArtikel(44, "Metabo", 130, 33);
		System.out.println(bohrmaschine);
		
		HolzArtikel tisch = new HolzArtikel(100, "Smoer", 12, true);
		System.out.println(tisch);
		
		System.out.println(tisch.compareTo(myHouse));
		System.out.println(myHouse.compareTo(myHouse));
		System.out.println(myCar.compareTo(tisch));
		
		Artikel[] dinge = {tisch, myHouse, myCar};
		//System.out.println(SortService.quicksortForComparable(tisch, myHouse, myCar));
		//System.out.println(Arrays.toString(Arrays.sort(dinge)));
		
	}

}
