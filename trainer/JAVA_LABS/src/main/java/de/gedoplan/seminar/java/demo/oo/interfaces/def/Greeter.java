package de.gedoplan.seminar.java.demo.oo.interfaces.def;

public interface Greeter {

  default void greet() {
    System.out.println("Hello from class " + getClass().getSimpleName());
  }

}
