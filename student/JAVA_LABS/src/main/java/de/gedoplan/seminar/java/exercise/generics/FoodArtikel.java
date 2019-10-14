
package de.gedoplan.seminar.java.exercise.generics;

public class FoodArtikel extends Artikel {
  private String mhd;

  public FoodArtikel(int artNr, String bez, double preis, String mhd) {
    super(artNr, bez, preis);
    this.mhd = mhd;
  }

  public String getMhd() {
    return this.mhd;
  }

  public void setMhd(String mhd) {
    this.mhd = mhd;
  }
}
