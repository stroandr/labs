/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.exceptions;

public class CalculatorMain {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Programm benoetigt 3 Parameter: zahl op zahl");
      System.exit(2);
    }

    try {
      Calculator mc = new Calculator();
      mc.setOperand1(Integer.parseInt(args[0]));
      mc.setOperator(args[1].charAt(0));
      mc.setOperand2(Integer.parseInt(args[2]));

      System.out.println(mc.evaluate());
    } catch (Exception ex) {
      System.err.println("Fehler in Calculator:" + ex);
    }
  }
}
