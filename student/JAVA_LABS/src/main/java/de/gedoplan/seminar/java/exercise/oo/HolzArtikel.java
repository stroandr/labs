package de.gedoplan.seminar.java.exercise.oo;

public class HolzArtikel extends Artikel {
	private boolean zuschnitt;

	public HolzArtikel(int artikelnummer, String bezeichnung, double preis, boolean zuschnitt) {
		super(artikelnummer, bezeichnung, preis);
		this.zuschnitt = zuschnitt;
	}


	public String toString() {
		return "HolzArtikel [zuschnitt=" + zuschnitt + ", berechneBruttopreis()=" + berechneBruttopreis() + ", toString()=" + super.toString() + "]";
	}
	

}
