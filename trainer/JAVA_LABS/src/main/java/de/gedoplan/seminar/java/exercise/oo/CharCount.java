
package de.gedoplan.seminar.java.exercise.oo;

import java.io.FileReader;
import java.io.IOException;

public class CharCount {
  public static void main(String[] args) throws IOException {
    String fileName = args.length > 0 ? args[0] : "pom.xml";
    FileReader fileReader = new FileReader(fileName);

    CharCounter counter = new CharCounter();

    while (true) {
      int zeichenCode = fileReader.read();
      if (zeichenCode < 0) {
        break;
      }

      char zeichen = (char) zeichenCode;

      counter.process(zeichen);
    }

    System.out.println("Kleinbuchstaben in " + fileName + ": ");
    for (char zeichen = 'a'; zeichen <= 'z'; ++zeichen) {
      System.out.println(zeichen + ": " + counter.getCount(zeichen));
    }
  }
}
