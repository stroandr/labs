/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.oo;

public class ElektroArtikel extends Artikel3 {

  private int leistung;

  public ElektroArtikel(int artikelnummer, String bezeichnung, double preis, int leistung) {
    super(artikelnummer, bezeichnung, preis);
    this.leistung = leistung;
  }

  public int getLeistung() {
    return this.leistung;
  }

  public void setLeistung(int leistung) {
    this.leistung = leistung;
  }

  @Override
  public String toString() {
    return super.toString() + ", elektrische Leistung = " + this.leistung + " Watt";
  }
}
