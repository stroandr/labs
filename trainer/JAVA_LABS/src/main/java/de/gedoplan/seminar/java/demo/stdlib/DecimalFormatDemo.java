package de.gedoplan.seminar.java.demo.stdlib;

import java.text.*;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class DecimalFormatDemo {

  public static void main(String[] args) {
    double d = 17.2 + 4.31;

    DecimalFormat formatter = new DecimalFormat("000.000");

    String s = formatter.format(d);

    System.out.println(s);
  }
}
