
/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.exercise.exceptions;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUtil {

  public static void show(String fileName) throws IOException {
    RandomAccessFile input = null;
    String line = null;

      input = new RandomAccessFile(fileName, "r");
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }

        input.close();

  }
}
