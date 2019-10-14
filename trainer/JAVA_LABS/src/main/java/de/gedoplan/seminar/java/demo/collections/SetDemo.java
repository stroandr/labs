package de.gedoplan.seminar.java.demo.collections;

import java.util.*;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */

public class SetDemo {

  public static void demo1() {
    Set set = new HashSet();

    set.add("eins");
    set.add("zwei");
    set.add("drei");

    boolean hasZwei = set.contains("zwei");

    System.out.println("\"zwei\" ist in der Menge: " + hasZwei);
  }

  public static void demo2() {
    Set set = new TreeSet();

    set.add("eins");
    set.add("zwei");
    set.add("drei");

    System.out.println("Inhalt der Menge: ");
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      System.out.println("  " + iter.next());
    }
  }

  public static void main(String[] args) {
    demo1();
    // demo2();
  }
}
