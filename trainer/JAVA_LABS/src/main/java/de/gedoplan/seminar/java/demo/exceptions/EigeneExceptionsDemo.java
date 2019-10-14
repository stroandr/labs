package de.gedoplan.seminar.java.demo.exceptions;

public class EigeneExceptionsDemo {

  public static void main(String[] args) {
    testException("test", 5);
    testException("gedoplan", -1);
    testException("gedoplan", 11);
    testException(null, 5);
    testException("gedoplan", 4);
  }

  public static void testException(String name, double betrag) {
    Konto konto = new Konto(10);
    try {
      konto.abheben(name, betrag);
      System.out.println("Erfolgreich " + betrag + " € abgehoben!");
    } catch (NotEnoughMoneyException e) {
      System.out.println("Nicht genug Geld auf dem Konto! Angeforderter Betrag: " + e.getBetrag() + " €; Kontostand: " + e.getKontostand() + " €");
    } catch (NotAuthorizedException e) {
      System.out.println("Berechtigungsproblem! " + e.getMessage());
    } catch (KontoException e) {
      System.out.println("Fehler beim Abheben: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unerwarteter Fehler aufgetreten: " + e);
    }
  }

}
