package de.gedoplan.seminar.java.demo.oo.interfaces;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class ArrayService_1 {
  public static void qSort(double[] a) {
    qSort(a, 0, a.length - 1);
  }

  private static void qSort(double[] a, int lo, int hi) {
    if (lo >= hi)
      return;

    // Aufteilung
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
        double tmp = a[i];
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
    double[] a = { 2.7, 10.6, 1.4, 5.8, 2.6, 2.5, 1.0, 3.6 };

    ArrayService_1.qSort(a);

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
