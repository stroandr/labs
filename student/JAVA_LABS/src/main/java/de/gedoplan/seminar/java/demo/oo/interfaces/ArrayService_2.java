package de.gedoplan.seminar.java.demo.oo.interfaces;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class ArrayService_2 {
  public static void qSort(Sortable[] a) {
    qSort(a, 0, a.length - 1);
  }

  private static void qSort(Sortable[] a, int lo, int hi) {
    if (lo >= hi)
      return;

    // Aufteilung
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
        Sortable tmp = a[i];
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
    SortableDouble[] a = {
        new SortableDouble(2.7),
        new SortableDouble(10.6),
        new SortableDouble(1.4),
        new SortableDouble(5.8),
        new SortableDouble(2.6),
        new SortableDouble(2.5),
        new SortableDouble(1.0),
        new SortableDouble(3.6)
    };

    ArrayService_2.qSort(a);

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

  }
}
