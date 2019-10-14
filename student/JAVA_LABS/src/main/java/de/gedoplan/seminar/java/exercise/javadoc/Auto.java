
package de.gedoplan.seminar.java.exercise.javadoc;

public class Auto extends Fahrzeug {

  private int motorLeistung;

  public Auto(String name, double preis, int motorLeistung) {
    super(name, preis);
    this.motorLeistung = motorLeistung;
  }

  @Override
  public String toString() {
    return super.toString() + ", motorLeistung = " + this.motorLeistung;
  }

}
