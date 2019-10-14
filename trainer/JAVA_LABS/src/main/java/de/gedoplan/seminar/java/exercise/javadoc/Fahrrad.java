
package de.gedoplan.seminar.java.exercise.javadoc;

public class Fahrrad extends Fahrzeug {
  private String typ;

  public Fahrrad(String name, double preis, String typ) {
    super(name, preis);
    this.typ = typ;
  }

  @Override
  public String toString() {
    return super.toString() + ", typ = " + this.typ;
  }
}
