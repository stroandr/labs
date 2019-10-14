/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.basic;

/**
 * Übung JAVA_BASIC_2
 */
public class CharCode {

  /**
   * Haupt-Methode
   * 
   * @param args
   *          Kommandozeilen-Argumente
   */
  public static void main(String[] args) {
    for (char character = 'A'; character <= 'Z'; character++) {
      int code = character;
      System.out.println("char: " + character + ", code: " + code);
    }
  }
}
