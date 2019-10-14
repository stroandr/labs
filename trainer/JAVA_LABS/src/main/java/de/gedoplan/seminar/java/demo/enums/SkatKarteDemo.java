package de.gedoplan.seminar.java.demo.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SkatKarteDemo {

  public static void main(String[] args) {
    showSkatKarten();
    showBlatt();
    showKartenTyp();
  }

  public static void showSkatKarten() {
    System.out.println("----- showSkatKarten -----");

    SkatKarte[] karten = SkatKarte.values();
    for (SkatKarte spielkarte : karten) {
      System.out.println(spielkarte + " hat den Wert " + spielkarte.getWert());
    }
  }

  public static void showBlatt() {
    System.out.println("----- showBlatt -----");

    // Set<SkatKarte> blatt = EnumSet.of(SkatKarte.ASS, SkatKarte.DAME,
    // SkatKarte.NEUN, SkatKarte.SIEBEN);
    Set<SkatKarte> blatt = EnumSet.noneOf(SkatKarte.class); // erstellt ein leeres Set
    blatt.add(SkatKarte.ASS);
    blatt.add(SkatKarte.DAME);
    blatt.add(SkatKarte.NEUN);
    blatt.add(SkatKarte.SIEBEN);

    for (SkatKarte skatKarte : blatt) {
      System.out.println(skatKarte);
    }
  }

  public static void showKartenTyp() {
    System.out.println("----- showBlatt -----");

    Map<SkatKarte, Boolean> typMap = new EnumMap<>(SkatKarte.class);
    typMap.put(SkatKarte.SIEBEN, false);
    typMap.put(SkatKarte.ACHT, false);
    typMap.put(SkatKarte.NEUN, false);
    typMap.put(SkatKarte.ZEHN, false);
    typMap.put(SkatKarte.BUBE, true);
    typMap.put(SkatKarte.DAME, true);
    typMap.put(SkatKarte.KOENIG, true);
    typMap.put(SkatKarte.ASS, false);

    for (Entry<SkatKarte, Boolean> entry : typMap.entrySet()) {
      System.out.println(entry.getKey() + " ist Bild: " + entry.getValue());
    }
  }
}
