/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArtAvg {

  public static void main(String[] args) {
    List<FoodArtikel> foodList = new ArrayList<FoodArtikel>();
    foodList.add(new FoodArtikel(4812, "Butter", 0.85, "20060324"));
    foodList.add(new FoodArtikel(4813, "Spaghetti", 0.30, "20081231"));

    List<Artikel> gesamtList = new ArrayList<Artikel>();

    gesamtList.add(new Artikel(4711, "Klebebandabroller", 5.45));
    gesamtList.add(new Artikel(4712, "Klebeband", 0.80));
    gesamtList.add(new Artikel(4713, "Lineal", 1.55));
    gesamtList.addAll(foodList);

    System.out.println("Mittlerer Preis (nur Food): " + getPreisDurchschnitt(foodList));
    System.out.println("Mittlerer Preis (gesamt):   " + getPreisDurchschnitt(gesamtList));
  }

  private static double getPreisDurchschnitt(Collection<? extends Artikel> coll) {
    double preis = 0;
    for (Artikel artikel : coll) {
      preis += artikel.getPreis();
    }

    if (preis == 0) {
      return 0;
    }

    return preis / coll.size();
  }
}
