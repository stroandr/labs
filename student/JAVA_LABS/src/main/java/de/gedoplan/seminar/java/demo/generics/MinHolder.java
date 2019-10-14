/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.generics;

public class MinHolder<E extends Comparable<E>> {

  private E value = null;

  public E getValue() {
    return this.value;
  }

  public void setValue(E value) {
    if (this.value == null || this.value.compareTo(value) > 0) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    MinHolder<Integer> wcd = new MinHolder<>();
    wcd.setValue(8);
    wcd.setValue(6);
    wcd.setValue(12);
    System.out.println(wcd.getValue());
  }
}
