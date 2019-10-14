package de.gedoplan.seminar.java.demo.oo.vererbung;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class Fahrrad extends Fahrzeug {
  private String typ;

  public Fahrrad(String name, double preis, String typ) {
    super(name, preis);
    this.typ = typ;
  }

  public String toString() {
    return super.toString() + ", typ = " + typ;
  }
}
