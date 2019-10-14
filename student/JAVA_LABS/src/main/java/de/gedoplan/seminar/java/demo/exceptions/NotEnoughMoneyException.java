package de.gedoplan.seminar.java.demo.exceptions;

public class NotEnoughMoneyException extends KontoException {

  private double kontostand;
  private double betrag;

  public NotEnoughMoneyException(double kontostand, double betrag) {
    this.kontostand = kontostand;
    this.betrag = betrag;
  }

  public double getKontostand() {
    return kontostand;
  }

  public double getBetrag() {
    return betrag;
  }

}
