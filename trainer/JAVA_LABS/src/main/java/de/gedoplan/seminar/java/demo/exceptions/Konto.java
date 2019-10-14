package de.gedoplan.seminar.java.demo.exceptions;

public class Konto {

  private double kontostand;

  public Konto(int kontostand) {
    this.kontostand = kontostand;
  }

  public void abheben(String name, double betrag) throws KontoException, NotAuthorizedException {
    if (name == null) {
      throw new IllegalArgumentException("Es muss ein Name angegeben werden.");
    }
    if (!name.equals("gedoplan")) {
      throw new NotAuthorizedException(name);
    }
    if (betrag <= 0) {
      throw new KontoException("Der Betrag muß eine positive Zahl sein.");
    }
    if (betrag >= kontostand) {
      throw new NotEnoughMoneyException(kontostand, betrag);
    }

    kontostand -= betrag;
  }

}
