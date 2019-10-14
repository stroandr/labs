/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.oo;

public class Artikel2 {

  private static int nextId = 1;

  private int id;

  private int artikelnummer;

  private String bezeichnung;

  private double preis;

  public Artikel2() {
    this.id = Artikel2.getNextId();
    this.artikelnummer = 0;
    this.bezeichnung = "unbekannt";
    this.preis = 0.0;

    // alternativ:
    // this(0, "unbekannt", 0.0);
  }

  public Artikel2(int artikelnummer, String bezeichnung) {
    this.id = Artikel2.getNextId();
    this.artikelnummer = artikelnummer;
    this.bezeichnung = bezeichnung;

    // alternativ:
    // this(artikelnummer, bezeichnung, null);
  }

  public Artikel2(int artikelnummer, String bezeichnung, double preis) {
    this.id = Artikel2.getNextId();
    this.artikelnummer = artikelnummer;
    this.bezeichnung = bezeichnung;
    this.preis = preis;
  }

  private static int getNextId() {
    return nextId++;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getArtikelnummer() {
    return this.artikelnummer;
  }

  public void setArtikelnummer(int artikelnummer) {
    this.artikelnummer = artikelnummer;
  }

  public String getBezeichnung() {
    return this.bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public double getPreis() {
    return this.preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  @Override
  public String toString() {
    return "Artikel: ID = "
        + this.id
        + ", Nummer = "
        + this.artikelnummer
        + ", Bezeichnung = "
        + this.bezeichnung
        + ", Preis = "
        + this.preis;
  }

}
