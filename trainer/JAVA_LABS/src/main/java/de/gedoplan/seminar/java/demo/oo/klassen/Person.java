package de.gedoplan.seminar.java.demo.oo.klassen;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class Person // Klassendeklaration
{
  // Instanzvariablen-Deklaration
  private double groesse;

  // Methoden-Deklaration
  public void setGroesse(double g) {
    groesse = g;
  }

  public double getGroesse() {
    return groesse;
  }

  public void druckeDaten() {
    System.out.println("Groesse: " + groesse);
  }
}
