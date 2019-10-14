package de.gedoplan.seminar.java.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class PersonSamples {
  private static final List<Person> persons = new ArrayList<>();

  static {
    persons.add(new Person("Adkins", "Adele Laurie Blue", Gender.FEMALE, "1988-05-05"));
    persons.add(new Person("Bendzko", "Tim", Gender.MALE, "1985-04-09"));
    persons.add(new Person("Bieber", "Justin", Gender.MALE, "1994-03-01"));
    persons.add(new Person("Fenty", "Robyn Rihanna", Gender.FEMALE, "1988-02-20"));
    persons.add(new Person("Müller-Westernhagen", "Marius", Gender.MALE, "1948-12-06"));
  }

  public static List<Person> get() {
    return persons;
  }
}
