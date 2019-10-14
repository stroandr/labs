package de.gedoplan.seminar.java.demo.exceptions;

public class MulticatchDemo {

  private static Konto konto = new Konto(100);

  public static void main(String[] args) {
    try {
      // mehr code...
      abbuchen();
      // mehr code...
      abbuchen2();
      // mehr code...
      abbuchen3();
      // mehr code...
    } catch (Exception e) { // Allgemeine Fehlerbehandlung der Anwendung, Ausgeben aller unerwarteten Fehler
      System.err.println("Ein unerwarteter Fehler ist aufgetreten...");
      e.printStackTrace(System.err);
    }
  }

  public static void abbuchen() {
    try {
      konto.abheben("gedoplan", 20);
    } catch (KontoException e) {
      System.out.println("Meldung an den Anwender geben: " + e.getMessage()); // doppelter Code
    } catch (NotAuthorizedException e) {
      System.out.println("Meldung an den Anwender geben:  " + e.getMessage()); // doppelter Code
    }
  }

  public static void abbuchen2() {
    try {
      konto.abheben("gedoplan", 20);
    } catch (Exception e) { // Schlechte Lösung, fängt alle Exceptions ab, z.B. auch NullPointerException
      System.out.println("Meldung an den Anwender geben: " + e.getMessage()); // Kann dem Anwender eine unverständliche technische Meldung anzeigen
    }
  }

  public static void abbuchen3() {
    try {
      konto.abheben("gedoplan", 20);
    } catch (KontoException | NotAuthorizedException e) { // Beste Lösung zur Vermeidung von Code-Redundanzen
      System.out.println("Meldung an den Anwender geben: " + e.getMessage());
    }
  }
}
