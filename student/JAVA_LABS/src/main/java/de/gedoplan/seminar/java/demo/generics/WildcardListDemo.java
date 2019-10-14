/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.generics;

import java.util.*;

public class WildcardListDemo {

  private static void showAll(Collection<?> coll) {
    for (Object item : coll) {
      System.out.println(item);
    }
  }

  private static void demo1() {
    List<String> list = new ArrayList<>();
    list.add("eins");
    list.add("zwei");
    list.add("drei");
    showAll(list);

    Set<Integer> set = new TreeSet<>();
    set.add(4);
    set.add(2);
    set.add(6);
    showAll(set);
  }

  private static double sum(Collection<? extends Number> coll) {
    double result = 0;
    for (Number item : coll) {
      result += item.doubleValue();
    }
    return result;
  }

  private static void demo2() {
    Set<Integer> set = new TreeSet<>();
    set.add(4);
    set.add(2);
    set.add(6);

    System.out.println(sum(set));
  }

  private static void fillWithFibonacci(Collection<? super Integer> coll, int limit) {
    coll.clear();

    int last = 0;
    int current = 1;
    while (current <= limit) {
      coll.add(current);
      int next = last + current;
      last = current;
      current = next;
    }
  }

  private static void demo3() {
    List<Number> list = new ArrayList<>();
    fillWithFibonacci(list, 50);
    showAll(list);
  }

  public static void main(String[] args) {
    demo1();
    demo2();
    demo3();
  }
}
