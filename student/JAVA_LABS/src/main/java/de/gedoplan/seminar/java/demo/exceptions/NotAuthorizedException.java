package de.gedoplan.seminar.java.demo.exceptions;

public class NotAuthorizedException extends Exception {

  private final String name;

  public NotAuthorizedException(String name) {
    this.name = name;
  }

  @Override
  public String getMessage() {
    return "Der Benutzer " + name + " ist nicht berechtigt, Geld abzuheben.";
  }
}
