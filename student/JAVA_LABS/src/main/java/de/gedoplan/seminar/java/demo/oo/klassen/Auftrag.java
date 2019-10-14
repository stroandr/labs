package de.gedoplan.seminar.java.demo.oo.klassen;

public class Auftrag {

  // statische Feld
  private static int nextNumber = 1;

  // statischer Initializer-Block für das Initialisieren von static Feldern
  static {
    nextNumber = selectNextNumberFromDatabase();
  }

  // statische Methode kann nur auf static Felder zugreifen.
  // Methode kann auf Klasse (empfohlen) oder auf Instanzen der Klasse (vermeiden)
  // aufgerufen werden.
  public static void incrementNumber() {
    ++nextNumber;
  }

  public static int selectNextNumberFromDatabase() {
    return 1;
  }

  public int getNextNumber() {
    return nextNumber; // Zugriff auf statisches Feld aus Instanzgebundener Methode
  }
}
