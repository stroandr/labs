
package de.gedoplan.seminar.java.exercise.generics;

public class Artikel {

  private int artNr;

  private String bez;

  private double preis;

  public Artikel(int artNr, String bez, double preis) {
    this.artNr = artNr;
    this.bez = bez;
    this.preis = preis;
  }

  public int getArtNr() {
    return this.artNr;
  }

  public void setArtNr(int artNr) {
    this.artNr = artNr;
  }

  public String getBez() {
    return this.bez;
  }

  public void setBez(String bez) {
    this.bez = bez;
  }

  public double getPreis() {
    return this.preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" + this.artNr + "," + this.bez + "," + this.preis + "}";
  }
}
