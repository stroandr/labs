package de.gedoplan.seminar.java.exercise.oo;

public class ElektroArtikel extends Artikel {
	private double leistung;

	public ElektroArtikel(int artikelnummer, String bezeichnung, double preis, double leistung) {
		super(artikelnummer, bezeichnung, preis);
		this.leistung = leistung;
	}

	
	public String toString() {
		return "ElektroArtikel [leistung=" + leistung + ", berechneBruttopreis()=" + berechneBruttopreis()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
