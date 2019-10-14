/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 * 
 */
package de.gedoplan.seminar.java.demo.oo.interfaces;

public class SortableDouble extends Sortable {
  private double value;

  public SortableDouble(double value) {
    this.value = value;
  }

  public String toString() {
    return "" + this.value;
  }

  public boolean isLessThan(Sortable other) {
    return this.value < ((SortableDouble) other).value;
  }
}
