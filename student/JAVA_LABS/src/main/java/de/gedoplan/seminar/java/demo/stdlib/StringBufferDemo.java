package de.gedoplan.seminar.java.demo.stdlib;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class StringBufferDemo {

  public static void main(String[] args) {
    StringBuffer buf = new StringBuffer();

    buf.append("Hallo, ");
    buf.append("Welt !");

    String s = buf.toString();

    System.out.println(s);

    /*
     * Alternative:
     * String s;
     * s += "Hallo, ";
     * s += "Welt";
     * System.out.println(s);
     * 
     * 
     * String s = "Hallo, " + "Welt";
     */
  }
}
