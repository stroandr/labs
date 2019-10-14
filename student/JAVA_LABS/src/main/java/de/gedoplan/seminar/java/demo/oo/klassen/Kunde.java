package de.gedoplan.seminar.java.demo.oo.klassen;

public class Kunde {

  private int kundenNummer;
  private String name;
  private double umsatz;

  public Kunde() {
    this("?");
  }

  public Kunde(String n) {
    this(n, 0.0);
  }

  public Kunde(String n, double u) {
    name = n;
    umsatz = u;
  }

  public int getKundenNummer() {
    return kundenNummer;
  }

  public void setKundenNummer(int kundenNummer) {
    this.kundenNummer = kundenNummer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getUmsatz() {
    return umsatz;
  }

  public void setUmsatz(double umsatz) {
    this.umsatz = umsatz;
  }

  public void drucken() {
    System.out.println("Umsatz: " + umsatz);
  }

  public String toString() {
    return "Kunde [name = " + name + ", umsatz = " + umsatz + "]";
  }

}
