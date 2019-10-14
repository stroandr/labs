/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.exercise.enums;

public enum EuroMuenze2 {
  EIN_CENT(1, "kupferfarben"), ZWEI_CENT(2, "kupferfarben"), FUENF_CENT(5, "kupferfarben"), ZEHN_CENT(10, "goldfarben"), ZWANZIG_CENT(20, "goldfarben"), FUENFZIG_CENT(50, "goldfarben"), EIN_EURO(100,
      "silbern mit goldenem Rand"), ZWEI_EURO(200, "goldfarben mit silbernem Rand");

  private int wert;
  private String farbe;

  private EuroMuenze2(int wert, String farbe) {
    this.wert = wert;
    this.farbe = farbe;
  }

  public int getWert() {
    return this.wert;
  }

  public String getFarbe() {
    return this.farbe;
  }

  public static void main(String[] args) {
    EuroMuenze2[] muenzen = EuroMuenze2.values();
    for (EuroMuenze2 muenze : muenzen) {
      System.out.println(muenze + " (" + muenze.getWert() + " Cent, " + muenze.getFarbe() + ")");
    }
  }
}
