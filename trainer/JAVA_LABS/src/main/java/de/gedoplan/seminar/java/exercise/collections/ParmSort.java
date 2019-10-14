package de.gedoplan.seminar.java.exercise.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class ParmSort {
  public static void main(String[] args) {
    List list = new ArrayList();

    for (int i = 0; i < args.length; ++i) {
      list.add(args[i]);
    }

    Collections.sort(list);

    Iterator iter = list.iterator();
    while (iter.hasNext()) {
      Object element = iter.next();
      System.out.println(element);
    }
  }
}
