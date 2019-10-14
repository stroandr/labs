package de.gedoplan.seminar.java.demo.enums;

public class GrundRechenartDemo {

  public static void main(String[] args) {
    showGrundrechenarten();
  }

  public static void showGrundrechenarten() {
    for (GrundRechenart op : GrundRechenart.values()) {
      showGrundrechenart(30, op, 4.5);
    }
  }

  private static void showGrundrechenart(double val1, GrundRechenart op, double val2) {
    double result = op.eval(val1, val2);
    System.out.println(val1 + " " + op + " " + val2 + " = " + result);
  }
}
