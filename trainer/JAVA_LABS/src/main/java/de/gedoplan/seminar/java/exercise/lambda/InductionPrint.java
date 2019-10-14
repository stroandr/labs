package de.gedoplan.seminar.java.exercise.lambda;

import java.util.function.UnaryOperator;

public class InductionPrint {
  public static void main(String[] args) {
    printInduction(1, x -> x * 2, 10);
    System.out.println("-----");
    printInduction(1.0, x -> x / 2.0, 10);
  }

  public static void printInduction(double start, UnaryOperator<Double> induOp, int count) {
    double x = start;
    while (count-- > 0) {
      System.out.println(x);

      x = induOp.apply(x);
    }
  }

  // public static <T> void printInduction(T start, UnaryOperator<T> induOp, int count)
  // {
  // T x = start;
  // while (count-- > 0)
  // {
  // System.out.println(x);
  //
  // x = induOp.apply(x);
  // }
  // }
}
