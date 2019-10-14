package de.gedoplan.seminar.java.exercise.enums;

public class PortemonnaieTest {

  public static void main(String[] args) {
    testGesamtWert();
  }

  public static void testGesamtWert() {
    Portemonnaie portemonnaie = new Portemonnaie();

    portemonnaie.add(EuroMuenze2.ZWEI_EURO, 2);
    portemonnaie.add(EuroMuenze2.EIN_EURO, 1);
    portemonnaie.add(EuroMuenze2.ZEHN_CENT, 3);
    portemonnaie.add(EuroMuenze2.EIN_CENT, 4);

    System.out.println("Gesamtwert: " + portemonnaie.getGesamtWert() + " Cent");
  }

}
