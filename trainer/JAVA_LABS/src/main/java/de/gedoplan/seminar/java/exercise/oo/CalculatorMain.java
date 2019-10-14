
package de.gedoplan.seminar.java.exercise.oo;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class CalculatorMain {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Programm benoetigt 3 Parameter: zahl op zahl");
      System.exit(2);
    }

    Calculator mc = new Calculator();
    mc.setOperand1(Integer.parseInt(args[0]));
    mc.setOperator(args[1].charAt(0));
    mc.setOperand2(Integer.parseInt(args[2]));

    System.out.println(mc.evaluate());
  }
}
