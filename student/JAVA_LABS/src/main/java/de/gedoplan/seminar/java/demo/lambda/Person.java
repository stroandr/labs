package de.gedoplan.seminar.java.demo.lambda;

import java.time.LocalDate;

public class Person {
  private String lastName;
  private String firstName;
  private Gender gender;
  private LocalDate birthDate;

  public Person(String lastName, String firstName, Gender gender, LocalDate birthDate) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.gender = gender;
    this.birthDate = birthDate;
  }

  public Person(String lastName, String firstName, Gender gender, String birthDate) {
    this(lastName, firstName, gender, LocalDate.parse(birthDate));
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public Gender getGender() {
    return this.gender;
  }

  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  @Override
  public String toString() {
    return "Person [lastName=" + this.lastName + ", firstName=" + this.firstName + ", gender=" + this.gender + ", birthDate=" + this.birthDate + "]";
  }
}
