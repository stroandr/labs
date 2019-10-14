/*
 * Created on 28.12.2005 by dw
 */
package de.gedoplan.seminar.java.demo.javadoc.util;

/**
 * Hilfsklasse zum Auspacken primitiver Werte aus entsprechenden Objekten.
 * 
 */
public class Unboxer {
  /**
   * Boole'schen Wert auspacken. Die Methode arbeitet wie Boolean.booleanValue, prüft jedoch zunächst, ob das
   * Quellobjekt null ist. In dem Fall wird der angegebene Defaultwert geliefert.
   * 
   * @param obj
   *          Boolean-Objekt
   * @param defaultValue
   *          Default-Wert
   * @return ausgepackter Wert
   */
  public static boolean booleanValue(Boolean obj, boolean defaultValue) {
    return obj != null ? obj.booleanValue() : defaultValue;
  }

  /**
   * Ganzzahligen Wert auspacken. Die Methode arbeitet wie Integer.intValue, prüft jedoch zunächst, ob das Quellobjekt
   * null ist. In dem Fall wird der angegebene Defaultwert geliefert.
   * 
   * @param obj
   *          Integer-Objekt
   * @param defaultValue
   *          Default-Wert
   * @return ausgepackter Wert
   */
  public static int intValue(Integer obj, int defaultValue) {
    return obj != null ? obj.intValue() : defaultValue;
  }

}
