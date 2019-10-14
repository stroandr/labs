package de.gedoplan.seminar.java.exercise.exceptions.automat;

public class Automat {

  private int maxAnzahlFlaschen;

  private static double EINZELPFAND = 0.25;

  public Automat(int maxAnzahlFlaschen) {
    this.maxAnzahlFlaschen = maxAnzahlFlaschen;
  }

  public double flaschenEinwerfen(int anzahlFlaschen, String code) throws Exception {

    if (code == null) {
      throw new IllegalArgumentException("Es muss ein Code angegeben werden.");
    }

    if (!code.startsWith("D-")) {
      throw new InvalidCodeException(code);
    }
    if (maxAnzahlFlaschen < anzahlFlaschen) {
      throw new AutomatException("Maximalanzahl Flaschen überschritten.");
    }

    return anzahlFlaschen * EINZELPFAND;
  }
}
