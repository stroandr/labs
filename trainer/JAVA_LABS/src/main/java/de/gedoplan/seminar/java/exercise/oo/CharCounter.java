
package de.gedoplan.seminar.java.exercise.oo;

public class CharCounter {

  private int[] counter = new int['z' - 'a' + 1];

  public void process(char c) {

    if (c >= 'a' && c <= 'z') {
      ++this.counter[c - 'a'];
    }

  }

  public int getCount(char c) {

    if (c >= 'a' && c <= 'z') {
      return this.counter[c - 'a'];
    }

    return 0;
  }
}
