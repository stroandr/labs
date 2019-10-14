/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.oo;

import de.gedoplan.seminar.java.demo.oo.interfaces.Sortable;

public class Artikel3 extends Sortable implements Comparable {

  private static int nextId = 1;

  private int id;

  private int artikelnummer;

  private String bezeichnung;

  private double preis;

  public Artikel3() {
    this.id = Artikel3.getNextId();
    this.artikelnummer = 0;
    this.bezeichnung = "unbekannt";
    this.preis = 0.0;

    // alternativ:
    // this(0, "unbekannt", 0.0);
  }

  public Artikel3(int artikelnummer, String bezeichnung) {
    this.id = Artikel3.getNextId();
    this.artikelnummer = artikelnummer;
    this.bezeichnung = bezeichnung;

    // alternativ:
    // this(artikelnummer, bezeichnung, null);
  }

  public Artikel3(int artikelnummer, String bezeichnung, double preis) {
    this.id = Artikel3.getNextId();
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
    return "Artikel:  ID = "
        + this.id
        + ", Nummer = "
        + this.artikelnummer
        + ", Bezeichnung = "
        + this.bezeichnung
        + ", Preis = "
        + this.preis;
  }

  @Override
  public boolean isLessThan(Sortable object) {
    int n1 = this.getArtikelnummer();
    int n2 = ((Artikel3) object).getArtikelnummer();
    return n1 < n2;
  }

  @Override
  public int compareTo(Object object) {
    Artikel3 artikel = (Artikel3) object;
    if (this.getPreis() < artikel.getPreis()) {
      return -1;
    } else if (this.getPreis() > artikel.getPreis()) {
      return 1;
    } else {
      return 0;
    }

    // oder kürzer:
    // return this.getPreis().compareTo(((Artikel3)object).getPreis());
    // dazu muss aber der Preis vom Wrapper-Typ sein. Primitiv hat keine Methoden (compareTo)

  }
}
