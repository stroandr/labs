package de.gedoplan.seminar.java.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class MethodParameterDemo {

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    addElement(stringList, "ein String");
    System.out.println(stringList);
  }

  public static <T> void addElement(List<T> list, T element) {
    list.add(element);
  }
}
