package de.gedoplan.seminar.java.exercise.oo;

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
	}

}
