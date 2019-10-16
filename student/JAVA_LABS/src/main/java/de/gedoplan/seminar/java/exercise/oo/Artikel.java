package de.gedoplan.seminar.java.exercise.oo;

//import de.gedoplan.seminar.java.exercise.basic.string;

public class Artikel {
	private int artikelnummer;
	private String bezeichnung;
	private double preis;
	private double steuersatz = 1.0;

	public Artikel(int artikelnummer, String bezeichnung, double preis) {
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		
	}
	
	public Artikel(int artikelnummer, String bezeichnung) {
		this(artikelnummer,bezeichnung,0.0);
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
	
	public double berechneBruttopreis() {
		return this.preis * this.steuersatz;
	}
	
	public void setSteuersatz(double steuersatz) {
		this.steuersatz=steuersatz;
	}


	public String toString() {
		return "Artikel [artikelnummer=" + artikelnummer + ", bezeichnung=" + bezeichnung + ", preis=" + preis
				+ ", steuersatz=" + steuersatz + "]";
	}
 
	

	
	
	

}
