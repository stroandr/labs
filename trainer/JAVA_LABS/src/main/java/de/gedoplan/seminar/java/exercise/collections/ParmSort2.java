package de.gedoplan.seminar.java.exercise.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class ParmSort2 {
  public static void main(String[] args) {
    SortedSet set = new TreeSet();

    for (int i = 0; i < args.length; ++i) {
      set.add(args[i]);
    }

    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      Object element = iter.next();
      System.out.println(element);
    }
  }
}
