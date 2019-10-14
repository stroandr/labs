package de.gedoplan.seminar.java.exercise.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class Portemonnaie {
  private Map<EuroMuenze2, Integer> geldFach = new EnumMap<>(EuroMuenze2.class);

  public void add(EuroMuenze2 muenze, int anzahl) {
    int anzahlAlt = this.geldFach.containsKey(muenze) ? this.geldFach.get(muenze) : 0;
    int anzahlNeu = anzahlAlt + anzahl;
    if (anzahlNeu < 0) {
      throw new IllegalArgumentException("Zuwenig Muenzen vorhanden");
    }
    this.geldFach.put(muenze, anzahlNeu);
  }

  public int getGesamtWert() {
    int wert = 0;
    for (Entry<EuroMuenze2, Integer> entry : this.geldFach.entrySet()) {
      wert += entry.getKey().getWert() * entry.getValue();
    }
    return wert;
  }
}
