package de.gedoplan.seminar.java.demo.oo.interfaces;

public class ComparableDouble implements Comparable {
  private double value;

  public ComparableDouble(double value) {
    this.value = value;
  }

  public String toString() {
    return "" + this.value;
  }

  public int compareTo(Object other) {
    ComparableDouble o = (ComparableDouble) other;
    if (this.value < o.value) {
      return -1;
    } else if (this.value > o.value) {
      return 1;
    } else {
      return 0;
    }
  }
}
