package de.gedoplan.seminar.java.demo.oo.vererbung;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class LKW extends Auto {
  private double nutzlast;

  public LKW(String name, double preis, int motorLeistung, double nutzlast) {
    super(name, preis, motorLeistung);
    this.nutzlast = nutzlast;
  }

  public String toString() {
    return super.toString() + ", nutzlast = " + nutzlast;
  }

}
