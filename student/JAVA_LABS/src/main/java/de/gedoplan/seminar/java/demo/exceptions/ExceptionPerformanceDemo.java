/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.exceptions;

public class ExceptionPerformanceDemo {

  private static int[] a = new int[10];

  public static void main(String[] args) {
    testArrayLoop();
  }

  public static void testArrayLoop() {
    final int COUNT = 100000000;

    long startTime = System.currentTimeMillis();
    for (int i = 0; i < COUNT; ++i) {
      good();
    }
    System.out.println("good: " + (System.currentTimeMillis() - startTime) + " ms");

    startTime = System.currentTimeMillis();
    for (int i = 0; i < COUNT; ++i) {
      bad();
    }
    System.out.println("bad: " + (System.currentTimeMillis() - startTime) + " ms");
  }

  private static void good() {
    for (int i = 0; i < a.length; ++i) {
      a[i] = i;
    }
  }

  private static void bad() {
    int i = 0;
    try {
      while (true) {
        a[i] = i;
        ++i;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // end loop
    }
  }
}
