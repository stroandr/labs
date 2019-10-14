package de.gedoplan.seminar.java.demo.oo.klassen;

public class AuftragDemo {

  public static void main(String[] args) {
    Auftrag.incrementNumber();

    Auftrag auftrag = new Auftrag();
    auftrag.incrementNumber();
    System.out.println("NextNumber: " + auftrag.getNextNumber());
  }
}
