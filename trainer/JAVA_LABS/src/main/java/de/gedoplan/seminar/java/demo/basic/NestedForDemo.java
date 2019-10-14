package de.gedoplan.seminar.java.demo.basic;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class NestedForDemo {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print((i + j) + " ");
      }
      System.out.println();
    }
  }
}
