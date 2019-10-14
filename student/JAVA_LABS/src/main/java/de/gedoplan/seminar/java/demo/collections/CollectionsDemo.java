package de.gedoplan.seminar.java.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class CollectionsDemo {
  public static void demo1() {
    List list = new ArrayList();

    // ...

    List syncList = Collections.synchronizedList(list);

    // ...
  }

  public static void demo2() {
    List list = new ArrayList();

    // ...

    List constList = Collections.unmodifiableList(list);

    // ...
  }

  public static void demo3() {
    List list = new ArrayList();

    list.add("eins");
    list.add("zwei");
    list.add("drei");

    System.out.println("davor: list = " + list);
    Collections.replaceAll(list, "drei", "eins");
    System.out.println("danach: list = " + list);

    int count = Collections.frequency(list, "eins");
    System.out.println("Liste enthaelt " + count + " x \"eins\"");
  }

  public static void demo4() {
    List list = new ArrayList();

    list.add("eins");
    list.add("zwei");
    list.add("drei");

    Collections.sort(list);

    System.out.println("list = " + list);
  }

  public static void main(String[] args) {
    demo1();
    // demo2();
    // demo3();
    // demo4();
  }
}
