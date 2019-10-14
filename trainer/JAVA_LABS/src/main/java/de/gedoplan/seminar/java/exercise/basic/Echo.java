/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.basic;

/**
 * Übung JAVA_BASIC_1
 */
public class Echo {

  /**
   * Haupt-Methode
   * 
   * @param args
   *          Kommandozeilen-Argumente
   */
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i] + " ");
    }
	System.out.println();
  }
}
