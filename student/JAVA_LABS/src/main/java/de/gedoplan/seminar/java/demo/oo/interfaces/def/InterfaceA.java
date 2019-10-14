package de.gedoplan.seminar.java.demo.oo.interfaces.def;

public interface InterfaceA {

  default void eineMethodeA() {
    System.out.println("MethodeA aus InterfaceA");
  }

  default void eineMethodeAundB() {
    System.out.println("MethodeAundB aus InterfaceA");
  }
}
