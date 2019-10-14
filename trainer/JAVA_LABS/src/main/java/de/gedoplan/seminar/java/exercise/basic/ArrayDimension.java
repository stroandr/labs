/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.exercise.basic;

/**
 * Übung JAVA_BASIC_3
 */
public class ArrayDimension {

  /**
   * Haupt-Methode
   * 
   * @param args
   *          Kommandozeilen-Argumente
   */
  public static void main(String[] args) {
    /* eindimensionales Feld */
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    /* zweidimensionales Feld */
    int[][] array2dim = { { 11, 12, 13 }, { 21, 22, 23 } };
    for (int i = 0; i < array2dim.length; i++) {
      for (int j = 0; j < array2dim[i].length; j++) {
        System.out.print(array2dim[i][j] + " ");
      }
      System.out.println();
    }
  }
}
