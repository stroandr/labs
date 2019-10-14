package de.gedoplan.seminar.java.demo.oo.interfaces.def;

public interface InterfaceB {

  default void eineMethodeB() {
    System.out.println("MethodeB aus InterfaceB");
  }

  default void eineMethodeAundB() {
    System.out.println("MethodeAundB aus InterfaceB");
  }
}
