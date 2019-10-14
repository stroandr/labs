package de.gedoplan.seminar.java.demo.lambda;

import java.time.LocalDate;
import java.util.List;

//@formatter:off

public class PersonPrint5 {
  private static List<Person> personList = PersonSamples.get();

  public static void main(String[] args) {
    printAll();
    System.out.println("-----");
    printDisplayNameOfFemalesUnder30();
  }

  static void printAll() {
    personList.forEach(System.out::println);
  }

  static void printDisplayNameOfFemalesUnder30() {
    LocalDate nowMinus30 = LocalDate.now().minusYears(30);

    personList.stream()
        .filter(p -> p.getGender() == Gender.FEMALE)
        .filter(p -> p.getBirthDate().isAfter(nowMinus30))
        .map(p -> p.getFirstName() + " " + p.getLastName())
        .forEach(System.out::println);
  }
}
