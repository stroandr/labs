package de.gedoplan.seminar.java.demo.oo.vererbung;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class Fahrzeug {
  private String name;
  private double preis;

  public Fahrzeug(String name, double preis) {
    this.name = name;
    this.preis = preis;
  }

  public String toString() {
    return "name = " + name + ", preis = " + preis;
  }
}
