package de.gedoplan.seminar.java.demo.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//@formatter:off

public class PersonPrint4 {
  private static List<Person> personList = PersonSamples.get();

  public static void main(String[] args) {
    printFemales();
    System.out.println("-----");
    printUnder30();
    System.out.println("-----");
    printAll();
  }

  static void printFemales() {
    workOn(personList,
        p -> {
          return p.getGender() == Gender.FEMALE;
        },
        p -> {
          System.out.println(p);
        });
  }

  static void printUnder30() {
    LocalDate nowMinus30 = LocalDate.now().minusYears(30);
    workOn(personList,
        p -> p.getBirthDate().isAfter(nowMinus30),
        p -> System.out.println(p));
  }

  static void printAll() {
    workOn(personList,
        p -> true,
        System.out::println);
  }

  static void workOn(List<Person> persons, Predicate<Person> filter, Consumer<Person> func) {
    for (Person person : persons) {
      if (filter.test(person)) {
        func.accept(person);
      }
    }
  }
}
