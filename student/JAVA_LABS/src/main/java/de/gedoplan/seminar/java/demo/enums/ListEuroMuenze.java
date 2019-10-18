package de.gedoplan.seminar.java.demo.enums;

public class ListEuroMuenze {

	public static void main(String[] args) {
		for (EuroMuenze muenze : EuroMuenze.values()) {
			System.out.println(muenze);
		}

		for (EuroMuenze2 muenze : EuroMuenze2.values()) {
			System.out.println("Die Muenze " + muenze + " hat den Wert: " + muenze.getWert());
		}

	}

}
 