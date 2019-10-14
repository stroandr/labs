package de.gedoplan.seminar.java.demo.exceptions;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionsResourcesDemo {

  public static void main(String[] args) throws IOException {
    System.out.println("### einfaches \"try\" ###");
    show("pom.xml");

    System.out.println();
    System.out.println("### \"try-with-resources\" ###");
    showTryWithResources("pom.xml");
  }

  public static void show(String fileName) throws IOException {
    RandomAccessFile input = null;
    String line = null;

    try {
      input = new RandomAccessFile(fileName, "r");
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
    } finally {
      try {
        if (input != null) {
          input.close();
        }
      } catch (Throwable t) {
        // ignore
      }
    }
  }

  public static void showTryWithResources(String fileName) throws IOException {
    String line = null;
    try (RandomAccessFile input = new RandomAccessFile(fileName, "r")) {
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
    }
  }
}
