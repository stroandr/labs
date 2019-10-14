package de.gedoplan.seminar.java.demo.lambda;

import java.util.List;

//@formatter:off

public class PersonPrint0 {
  private static List<Person> personList = PersonSamples.get();

  public static void main(String[] args) {
    printAll();
    System.out.println("-----");
    printLastNames();
  }

  static void printAll() {
    for (Person person : personList) {
      System.out.println(person);
    }
  }

  static void printLastNames() {
    for (Person person : personList) {
      System.out.println(person.getLastName());
    }
  }
}
