package de.gedoplan.seminar.java.demo.oo.vererbung;

public class Auto extends Fahrzeug {

  private int motorLeistung;

  public Auto(String name, double preis, int motorLeistung) {
    super(name, preis);
    this.motorLeistung = motorLeistung;
  }

  public String toString() {
    return super.toString() + ", motorLeistung = " + motorLeistung;
  }

}
