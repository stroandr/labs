/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.demo.oo.interfaces;

/**
 * Die Service-Klasse <code>SortService</code> stellt Implementierungen des Quicksort-Algorithmus
 * zur Sortierung eines Feldes mit unterschiedlichen Elementtypen zur Verfügung:
 * <ul>
 * <li>Feld mit <code>double</code>-Elementen</li>
 * <li>Verallgemeinerung mit abstrakter Oberklasse auf Feld mit <code>Sortable</code>-Elementen</li>
 * <li>Verallgemeinerung mit Interface auf Feld mit <code>Comparable</code>-Elementen</li>
 * </ul>
 */
public class SortService {

  /**
   * Diese Methode implementiert den rekursiven Quicksort-Algorithmus zur Sortierung eines Feldes
   * von Gleitkommazahlen vom Typ <code>double</code>.
   *
   * @param a
   *          Feld
   * @param lo
   *          low-Feldposition (initial 0)
   * @param hi
   *          high-Feldposition (initial Feldlänge-1)
   */
  public void quicksortForDouble(double[] a, int lo, int hi) {
    if (lo >= hi) {
      return;
    }

    double mark = a[(lo + hi) / 2];
    int i = lo;
    int j = hi;
    while (i <= j) {
      while (a[i] < mark) {
        i++;
      }
      while (a[j] > mark) {
        j--;
      }
      if (i <= j) {
        double e = a[i];
        a[i] = a[j];
        a[j] = e;
        i++;
        j--;
      }
    }

    this.quicksortForDouble(a, lo, j);
    this.quicksortForDouble(a, i, hi);
  }

  /**
   * Diese Methode implementiert den rekursiven Quicksort-Algorithmus zur Sortierung eines Feldes
   * von Objekten vom Typ <code>Sortable</code>.
   *
   * @param a
   *          Feld
   * @param lo
   *          low-Feldposition (initial 0)
   * @param hi
   *          high-Feldposition (initial Feldlänge-1)
   */
  public void quicksortForSortable(Sortable[] a, int lo, int hi) {
    if (lo >= hi) {
      return;
    }

    Sortable mark = a[(lo + hi) / 2];
    int i = lo;
    int j = hi;
    while (i <= j) {
      while (a[i].isLessThan(mark)) {
        i++;
      }
      while (mark.isLessThan(a[j])) {
        j--;
      }
      if (i <= j) {
        Sortable e = a[i];
        a[i] = a[j];
        a[j] = e;
        i++;
        j--;
      }
    }

    this.quicksortForSortable(a, lo, j);
    this.quicksortForSortable(a, i, hi);
  }

  /**
   * Diese Methode implementiert den rekursiven Quicksort-Algorithmus zur Sortierung eines Feldes
   * von Objekten vom Typ <code>Comparable</code>.
   *
   * @param a
   *          Feld
   * @param lo
   *          low-Feldposition (initial 0)
   * @param hi
   *          high-Feldposition (initial Feldlänge-1)
   */
  public void quicksortForComparable(Comparable[] a, int lo, int hi) {
    if (lo >= hi) {
      return;
    }

    Comparable mark = a[(lo + hi) / 2];
    int i = lo;
    int j = hi;
    while (i <= j) {
      while (a[i].compareTo(mark) < 0) {
        i++;
      }
      while (a[j].compareTo(mark) > 0) {
        j--;
      }
      if (i <= j) {
        Comparable e = a[i];
        a[i] = a[j];
        a[j] = e;
        i++;
        j--;
      }
    }

    this.quicksortForComparable(a, lo, j);
    this.quicksortForComparable(a, i, hi);
  }
}
