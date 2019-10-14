
package de.gedoplan.seminar.java.exercise.javadoc;

public class Fahrzeug {
  private String name;
  private double preis;

  public Fahrzeug(String name, double preis) {
    this.name = name;
    this.preis = preis;
  }

  @Override
  public String toString() {
    return "name = " + this.name + ", preis = " + this.preis;
  }
}
