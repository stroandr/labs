package de.gedoplan.seminar.java.demo.oo.vererbung;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class PKW extends Auto {
  private boolean cabrio;

  public PKW(String name, double preis, int motorLeistung, boolean cabrio) {
    super(name, preis, motorLeistung);
    this.cabrio = cabrio;
  }

  public String toString() {
    return super.toString() + ", cabrio = " + cabrio;
  }

}
