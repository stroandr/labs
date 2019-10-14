/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.exercise.enums;

public enum EuroMuenze {
  EIN_CENT, ZWEI_CENT, FUENF_CENT, ZEHN_CENT, ZWANZIG_CENT, FUENFZIG_CENT, EIN_EURO, ZWEI_EURO;

  public static void main(String[] args) {
    EuroMuenze[] muenzen = EuroMuenze.values();
    for (EuroMuenze muenze : muenzen) {
      System.out.println(muenze);
    }
  }
}
