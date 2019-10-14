package de.gedoplan.seminar.java.demo.collections;

import java.util.*;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */

public class MapDemo {

  public static void demo1() {
    Map map = new HashMap();

    map.put("eins", "one");
    map.put("zwei", "two");
    map.put("drei", "three");

    String translation = (String) map.get("zwei");

    System.out.println("\"zwei\" ==> \"" + translation + "\"");
  }

  public static void main(String[] args) {
    demo1();
  }
}
