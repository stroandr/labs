package de.gedoplan.seminar.java.demo.oo.interfaces.def;

public class ImplAB implements InterfaceA, InterfaceB {

  @Override
  public void eineMethodeAundB() { // Überschreiben notwendig da sonst Konflikt
    InterfaceB.super.eineMethodeAundB(); // Explizites Auswählen einer der Default-Implementierungen
  }

  public static void main(String[] args) {
    new ImplAB().eineMethodeA();
    new ImplAB().eineMethodeB();
    new ImplAB().eineMethodeAundB();
  }

}
