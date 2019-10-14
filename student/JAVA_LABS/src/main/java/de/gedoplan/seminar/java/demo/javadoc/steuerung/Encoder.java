package de.gedoplan.seminar.java.demo.javadoc.steuerung;

/**
 * Basisklasse für Bausteine mit Eingängen.
 * 
 * @author Dirk Weil
 */
public abstract class Encoder extends BusGeraet {
  public Encoder(int adr, int width, Steuerung steuerung) {
    super(adr, width, steuerung);
  }
}
