package de.gedoplan.seminar.java.demo.stdlib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class FileDemo {

  public static void main(String[] args) throws IOException {
    fileDemo();
    outputStreamDemo();
    inputStreamDemo();
  }

  public static void fileDemo() throws IOException {
    File file = new File("."); // File Objekt für aktuelles Arbeitsverzeichnis
    System.out.println("Verzeichnis?: " + file.isDirectory()); // Abfragen, ob es ein Verzeichnis ist
    System.out.println("Pfad: " + file.getCanonicalPath()); // Vollständigen Pfad als String ausgeben
    for (File f : file.listFiles()) { // Alle in dem Verzeichnis enthaltenen Dateien ausgeben
      System.out.println(f.getName());
    }

    // Ein File-Objekt für eine noch nicht existierende Datei erzeugen
    File newFile = new File(file, "test.txt");
    System.out.println("Existiert die Datei " + newFile.getName() + "? " + newFile.exists());
    newFile.createNewFile(); // Die neue Datei anlegen
    System.out.println("Existiert die Datei " + newFile.getName() + "? " + newFile.exists());
    newFile.delete(); // Entfernen der Datei aus dem Dateisystem
  }

  public static void outputStreamDemo() {
    try (OutputStream os = new FileOutputStream("./test.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, Charset.forName("UTF-8")));) {
      writer.write("Erste Zeile");
      writer.newLine();
      writer.write("Zweite Zeile\nDritte Zeile");
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void inputStreamDemo() {
    try (InputStream is = new FileInputStream("./test.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void filesWriteDemo() {
    String s = "Erste Zeile\nZweite Zeile\nDritte Zeile";
    try {
      // Schreiben eines ByteArrays in eine Datei
      Files.write(Paths.get(".", "test.txt"), s.getBytes(Charset.forName("UTF-8")));
      // Schreiben einer Liste von Strings, jeder Eintrag der Liste wird eine Zeile
      Files.write(Paths.get(".", "test.txt"), Arrays.asList("Erste Zeile", "Zweite Zeile", "Dritte Zeile"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void filesReadDemo() {
    // Liest die Datei am Stück ein und liefert eine Liste vom Typ String mit einem Eintrag für jede Zeile zurück
    try {
      for (String line : Files.readAllLines(Paths.get(".", "test.txt"))) {
        System.out.println(line);
      }
      // Alternative: Einlesen als Byte-Array
      // new String(Files.readAllBytes(Paths.get(".", "test.txt")), Charset.forName("UTF-8"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void streamLinesDemo() {
    try { // Variante mit Java 8 Stream, Lazy, Datei wird zeilenweise
      // eingelesen und verarbeitet.
      // Erlaubt das Verwenden der Java 8 Stream Features wie filter
      // und mapping
      Files.lines(Paths.get(".", "test.txt")).forEach(line -> System.out.println(line));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
