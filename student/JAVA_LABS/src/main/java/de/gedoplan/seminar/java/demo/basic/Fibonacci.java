package de.gedoplan.seminar.java.demo.basic;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class Fibonacci {
  // Ausgabe der Fibonacci-Folge bis 50
  public static void main(String[] args) {
    int lo = 1;
    int hi = 1;
    System.out.println(lo);
    while (hi < 50) {
      System.out.println(hi);
      int oldHi = hi;
      hi = lo + hi;
      lo = oldHi;
    }
  }
}
