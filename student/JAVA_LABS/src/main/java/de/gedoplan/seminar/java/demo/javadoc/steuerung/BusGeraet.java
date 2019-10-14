package de.gedoplan.seminar.java.demo.javadoc.steuerung;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Basisklasse für Bausteine am SX-Bus.
 *
 * @author Dirk Weil
 */
public abstract class BusGeraet {
  private int adr;
  private int width;

  private Zentrale zentrale;

  private int value;

  private long nextRead;
  private static final long READ_INTERVAL = 100;

  protected Log logger = LogFactory.getLog(this.getClass());

  /**
   * Neues Busgerät erzeugen.
   *
   * @param adr
   *          (Start-)Adresse (1..103)
   * @param width
   *          Anzahl Adressen
   * @param steuerung
   *          Referenz auf das Steuerungs-Singleton
   */
  public BusGeraet(int adr, int width, Steuerung steuerung) {
    this.width = width;
    this.adr = adr;
    this.zentrale = steuerung.getZentrale();
  }

  /**
   * (Start-)Adresse liefern.
   *
   * @return Adresse (1..103)
   */
  public int getAdr() {
    return this.adr;
  }

  /**
   * Anzahl belegter Adressen liefern.
   *
   * @return Adress-Anzahl
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Wert abfragen. Es wird nur frühestens alle READ_INTERVAL ms ein echter Zugriff gemacht. Zwischendurch wird der
   * zuvor gelesene Wert erneut geliefert.
   *
   * @throws IOException
   *           bei Fehlern im Zugriff auf die Zentraleinheit
   */
  public synchronized int getValue() throws IOException {
    boolean readFromCache = true;
    if (System.currentTimeMillis() > this.nextRead) {
      readFromCache = false;
      this.value = 0;

      int i = this.width - 1;
      int adr = this.adr + i;
      while (true) {
        this.value = (this.value << 8) + this.zentrale.readChannel(adr);
        if (i <= 0) {
          break;
        }
        --i;
        --adr;
      }

      this.nextRead = System.currentTimeMillis() + READ_INTERVAL;
    }

    if (this.logger.isDebugEnabled()) {
      this.logger.debug("getValue: " + this.adr + ":" + this.value + (readFromCache ? " (cached value)" : ""));
    }

    return this.value;
  }

  /**
   * Teilwert abfragen. Es wird nur frühestens alle READ_INTERVAL ms ein echter Zugriff gemacht. Zwischenduch wird der
   * zuvor gelesene Wert erneut geliefert.
   *
   * @param bitOffset
   *          Bit-Nummer des höchstwertigen Bits des abzufragenden Teils
   * @param bitCount
   *          Anzahl abzufragender Bits
   * @return Teilwert
   * @throws IOException
   *           bei Kommunikationsfehlern
   */
  public int getValue(int bitOffset, int bitCount) throws IOException {
    return getValue() >>> bitOffset & ~(0xff << bitCount);
  }

  /**
   * Wert setzen. Diese Methode ist hier nur protected. Soll sie allgemein nutzbar sein, muss sie von der abgeleiteten
   * Klasse public uberschrieben werden.
   *
   * @param value
   *          Neuer Wert
   * @throws IOException
   */
  protected synchronized void setValue(int value) throws IOException {
    if (this.logger.isDebugEnabled()) {
      this.logger.debug("setValue: " + this.adr + ":" + this.value + "-->" + value);
    }

    this.value = value;

    int adr = this.adr;
    int i = this.width;
    while (true) {
      this.zentrale.writeChannel(adr, value);

      --i;
      if (i <= 0) {
        break;
      }
      ++adr;
      value >>>= 8;
    }

    this.nextRead = System.currentTimeMillis() + READ_INTERVAL;
  }

  /**
   * Teilwert setzen. Diese Methode ist hier nur protected. Soll sie allgemein nutzbar sein, muss sie von der
   * abgeleiteten Klasse public uberschrieben werden.
   *
   * @param value
   *          Neuer Teilwert
   * @param bitOffset
   *          Bit-Nummer des höchstwertigen Bits des zu setzenden Teils
   * @param bitCount
   *          Anzahl zu setzender Bits
   * @throws IOException
   */
  protected synchronized void setValue(int value, int bitOffset, int bitCount) throws IOException {
    int mask = ~(0xff << bitCount) << bitOffset;
    setValue(getValue() & ~mask | (value << bitOffset) & mask);
  }

  /**
   * Stringdarstellung des Objektes liefern.
   *
   * @return Stringdarstellung
   */
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "@" + this.adr;
  }

  /**
   * Konfigurierte Parameter abfragen. Dies sind die Parameter, die im Konfigurationsfile eingetragen sind, nicht
   * unbedingt die aktuell programmierten Werte!
   *
   * @return Textliche Beschreibung der konfigurierten Parameter
   */
  public abstract String getConfigProgParm();

  /**
   * Programmiermodus beginnen. Sollte dazu noch eine manuelle Bedienung notwendig sein, muss ein entsprechender Text
   * als Returnwert geliefert werden.
   *
   * @return Bedienungsanweisung; null, falls manuelle Bedienung nicht nötig
   */
  public abstract String startProgMode();

  /**
   * Programmiermodus beenden. Sollte dazu noch eine manuelle Bedienung notwendig sein, muss ein entsprechender Text als
   * Returnwert geliefert werden.
   *
   * @return Bedienungsanweisung; null, falls manuelle Bedienung nicht nötig
   */
  public abstract String endProgMode();

  /**
   * Aktuell einprogrammierte Werte abfragen. Vor Aufruf dieser Methode wird stets der Programmiermodus gestartet.
   *
   * @return Textliche Beschreibung der aktuell programmierten Parameter
   */
  public abstract String getCurrentProgParm();

  /**
   * Konfigurierte Parameter einprogrammieren. Vor Aufruf dieser Methode wird stets der Programmiermodus gestartet.
   * Sollte nach der Programmierung noch eine manuelle Bedienung notwendig sein, muss ein entsprechender Text als
   * Returnwert geliefert werden.
   *
   * @return Bedienungsanweisung; null, falls manuelle Bedienung nicht nötig
   */
  public abstract String setProgParm();
}
