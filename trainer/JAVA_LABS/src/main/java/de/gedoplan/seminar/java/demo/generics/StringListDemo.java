/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.generics;

import java.util.*;

public class StringListDemo {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("eins");
    list.add("zwei");
    list.add("drei");

    Iterator<String> iter = list.iterator();
    while (iter.hasNext()) {
      String element = iter.next();
      System.out.println(element);
    }

    System.out.println();

    for (String element : list) {
      System.out.println(element);
    }
  }
}
