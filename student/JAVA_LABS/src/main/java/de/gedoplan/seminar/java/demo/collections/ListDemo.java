package de.gedoplan.seminar.java.demo.collections;

import java.util.*;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */

public class ListDemo {

  public static void demo1() {
    List list = new ArrayList();

    list.add("eins");
    list.add(2); // Autoboxing macht daraus ein "new Integer(2)"
    list.add("drei");

    System.out.println("Element an Index 1: " + list.get(1));
    System.out.println("Listengroesse: " + list.size());
  }

  public static void demo2() {
    List list = new LinkedList();

    list.add("eins");
    list.add("drei");
    list.add(1, 2); // Autoboxing macht aus der "2" ein "new Integer(2)"

    System.out.println("Element an Index 1: " + list.get(1));
    System.out.println("Listengroesse: " + list.size());
  }

  public static void demo3() {
    Collection coll = new ArrayList();

    coll.add("eins");
    coll.add("zwei");
    coll.add("drei");

    System.out.println("Listeninhalt: ");
    Iterator iter = coll.iterator();
    while (iter.hasNext()) {
      String element = (String) iter.next();
      System.out.println("  " + element);
    }
  }

  // for-each-Schleife seit Java 5
  public static void demo4() {
    Collection coll = new ArrayList();

    coll.add("eins");
    coll.add("zwei");
    coll.add("drei");

    System.out.println("Listeninhalt: ");
    for (Object obj : coll) {
      String element = (String) obj;
      System.out.println("  " + element);
    }
  }

  public static void main(String[] args) {
    demo1();
    // demo2();
    // demo3();
    // demo4();
  }
}
