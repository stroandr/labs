package de.gedoplan.seminar.java.demo.exceptions;

public class ExceptionsDemo {

  public static void main(String[] args) {
    testException();
  }

  public static void testException() {
    try {
      System.out.println("try begin");
      tueIrgendWas(-1);
      System.out.println("try end");
    } catch (Exception e) {
      System.out.println("catch: " + e);
    } finally {
      System.out.println("finally");
    }

    System.out.println("main end");
  }

  private static void tueIrgendWas(int i) throws Exception {
    System.out.println("tueIrgendWas begin");

    switch (i) {
    case 0:
      i = 10 / i; // Loest ArithmethicException aus
      break;

    case 1:
      throw new Exception("Ich gebe auf ...");
    }

    System.out.println("tueIrgendWas end");
  }
}
