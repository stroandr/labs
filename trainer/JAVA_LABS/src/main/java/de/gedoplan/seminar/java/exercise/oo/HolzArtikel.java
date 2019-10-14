/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.oo;

public class HolzArtikel extends Artikel3 {

  private boolean zuschnitt;

  public HolzArtikel(int artikelnummer, String bezeichnung, double preis, boolean zuschnitt) {
    super(artikelnummer, bezeichnung, preis);
    this.zuschnitt = zuschnitt;
  }

  public boolean getZuschnitt() {
    return this.zuschnitt;
  }

  public void setZuschnitt(boolean zuschnitt) {
    this.zuschnitt = zuschnitt;
  }

  @Override
  public String toString() {
    return super.toString() + ", Zuschnitt möglich = " + this.zuschnitt;
  }
}
