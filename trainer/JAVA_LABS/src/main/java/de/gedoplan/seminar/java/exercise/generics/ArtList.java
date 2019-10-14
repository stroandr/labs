/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.generics;

import java.util.ArrayList;
import java.util.List;

public class ArtList {

  public static void main(String[] args) {
    List<Artikel> list = new ArrayList<Artikel>();

    list.add(new Artikel(4711, "Klebebandabroller", 5.45));
    list.add(new Artikel(4712, "Klebeband", 0.80));
    list.add(new Artikel(4713, "Lineal", 1.55));

    for (Artikel artikel : list) {
      System.out.println(artikel);
    }
  }
}
