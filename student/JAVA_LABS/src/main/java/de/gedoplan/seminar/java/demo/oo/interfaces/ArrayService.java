package de.gedoplan.seminar.java.demo.oo.interfaces;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class ArrayService {
  public static void qSort(Comparable[] a) {
    qSort(a, 0, a.length - 1);
  }

  private static void qSort(Comparable[] a, int lo, int hi) {
    if (lo >= hi)
      return;

    // Aufteilung
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
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

        i++;
        j--;
      }
    }

    // Rekursion
    qSort(a, lo, j);
    qSort(a, i, hi);
  }

  public static void main(String[] args) {

    ComparableDouble[] a = {
        new ComparableDouble(2.7),
        new ComparableDouble(10.6),
        new ComparableDouble(1.4),
        new ComparableDouble(5.8),
        new ComparableDouble(2.6),
        new ComparableDouble(2.5),
        new ComparableDouble(1.0),
        new ComparableDouble(3.6)
    };

    ArrayService.qSort(a);

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

  }

}
