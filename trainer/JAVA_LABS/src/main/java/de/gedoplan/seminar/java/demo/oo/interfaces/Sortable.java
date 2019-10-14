/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.demo.oo.interfaces;

/**
 * Die abstrakte Klasse <code>Sortable</code> repräsentiert Objekte, die über eine natürliche
 * Ordnung verfügen und somit sortierbar sind.
 */
public abstract class Sortable {

  /**
   * Diese abstrakte Vergleichsmethode definiert die natürliche Ordnung.
   *
   * @param object
   *          Vergleichsobjekt
   * @return <code>true</code> wenn <code>this</code> kleiner als <code>object</code> ist,
   *         <code>false</code> sonst
   */
  public abstract boolean isLessThan(Sortable object);
}
