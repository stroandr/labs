package de.gedoplan.seminar.java.demo.lambda;

import java.util.List;

// @formatter:off

public class PersonPrint2 {
  private static List<Person> personList = PersonSamples.get();

  public static void main(String[] args) {
    printAll();
    System.out.println("-----");
    printLastNames();
  }

  static void printAll() {
    workOn(personList,
        (Person p) -> {
          System.out.println(p);
        });
  }

  static void printLastNames() {
    workOn(personList,
        p -> {
          System.out.println(p.getLastName());
        });
  }

  static void workOn(List<Person> persons, PersonConsumer func) {
    for (Person person : persons) {
      func.accept(person);
    }
  }
}
