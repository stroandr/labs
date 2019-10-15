package de.gedoplan.seminar.java.exercise.oo;

//import de.gedoplan.seminar.java.exercise.basic.string;

public class Artikel {
	private int artikelnummer;
	private String bezeichnung;
	private double preis;

	public Artikel(int artikelnummer, String bezeichnung, double preis) {
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		
	}
	
	public Artikel(int artikelnummer, String bezeichnung) {
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
	}
	
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}
 
	public String toString() {
		return "Artikel [artikelnummer=" + artikelnummer + ", bezeichnung=" + bezeichnung + ", preis=" + preis + "]";
	}

	
	
	

}
