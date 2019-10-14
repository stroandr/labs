/*
 * Created on 13.11.2005 by dw
 */
package de.gedoplan.seminar.java.demo.javadoc.steuerung;

import java.io.IOException;

/**
 * Repräsentiert die gesamte Steuerung. Steuerung ist ein Singleton, das die verschiedenen Objekte zur Ansteuerung des
 * Selectrix-Systems wie {@link Zentrale} oder {@link BusGeraet Busgeräte} zur Verfügung stellt.
 */
public class Steuerung {
  private static Steuerung steuerung = null;

  /**
   * Steuerungsobjekt holen (Singleton).
   * 
   * @return Steuerung
   * @throws ConfigException
   *           falls Konfiguration fehlerhaft
   * @throws IOException
   *           bei Kommunikationsfehlern
   */
  public static Steuerung getSteuerung() throws ConfigException, IOException {
    synchronized (Steuerung.class) {
      if (steuerung == null) {
        steuerung = new Steuerung();
      }
    }
    return steuerung;
  }

  /**
   * SX-Zentrale liefern.
   * 
   * @return SX-Zentrale
   */
  public Zentrale getZentrale() {
    return null;
  }

  /**
   * Steuerungsobjekt holen (Singleton).
   * 
   * @deprecated Bitte {@link #getSteuerung()} benutzen.
   * 
   * @return Steuerung
   * @throws ConfigException
   *           falls Konfiguration fehlerhaft
   * @throws IOException
   *           bei Kommunikationsfehlern
   */
  public static Steuerung getInstance() throws ConfigException, IOException {
    return getSteuerung();
  }

}
