package de.gedoplan.seminar.java.demo.annotations;

public class DeprecatedDemo {

  public static void demo1() {
    DeprecatedClass.oldMethod1();
    DeprecatedClass.oldMethod2();
  }

  @SuppressWarnings("deprecation")
  public static void demo2() {
    DeprecatedClass.oldMethod1();
    DeprecatedClass.oldMethod2();
  }
}
