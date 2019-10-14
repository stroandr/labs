/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.demo.annotations;

public class DeprecatedClass {
  /**
   * @deprecated In neuen Programmen newMethod() benutzen!
   */
  public static void oldMethod1() {
    // ...
  }

  @Deprecated
  public static void oldMethod2() {
    // ...
  }

  public static void newMethod() {
    // ...
  }
}
