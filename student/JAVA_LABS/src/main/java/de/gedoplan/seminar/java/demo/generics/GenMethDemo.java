/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenMethDemo {

  public static <T> void dup(Collection<? super T> dest, Collection<? extends T> src) {
    dest.clear();
    for (T entry : src) {
      dest.add(entry);
    }
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Otto");
    list.add("Hugo");
    list.add("Willi");

    Set<Object> set = new TreeSet<>();
    dup(set, list);

    for (Object entry : set) {
      System.out.println(entry);
    }
  }
}
