package de.gedoplan.seminar.java.demo.enums;

public enum SkatKarte {
  SIEBEN(0), ACHT(0), NEUN(0), BUBE(2), DAME(3), KOENIG(4), ZEHN(10), ASS(11);

  private final int wert;

  private SkatKarte(int wert) {
    this.wert = wert;
  }

  public int getWert() {
    return this.wert;
  }
}
