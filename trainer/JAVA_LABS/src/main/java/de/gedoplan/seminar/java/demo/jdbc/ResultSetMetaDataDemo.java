/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * Demo-Klasse zur Abfrage von Selektions-Metadaten mit JDBC
 */
public class ResultSetMetaDataDemo {

  /**
   * Haupt-Methode
   *
   * @param args
   *          Kommandozeilen-Argumente
   * @throws ClassNotFoundException
   */
  public static void main(String[] args) throws ClassNotFoundException {
    executeDynamicSQL("select VORNAME, NACHNAME, ORT from PERSON");
  }

  /**
   * Demo-Methode für die Ausführung einer übergebenen SQL-Select-Abfrage
   *
   * @param sql
   *          SQL-Select-Abfrage
   * @throws ClassNotFoundException
   */
  private static void executeDynamicSQL(String sql) throws ClassNotFoundException {
    try (Connection connection = ConnectionUtil.createConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql)) {

      /* Spaltennamen ausgeben */
      ResultSetMetaData meta = result.getMetaData();
      int columnCount = meta.getColumnCount();
      String separator = "";
      for (int i = 1; i <= columnCount; ++i) {
        System.out.print(separator + meta.getColumnName(i));
        separator = ", ";
      }
      System.out.println();

      /* Ergebnisdaten ausgeben */
      int countRecord = 0;
      while (result.next()) {
        separator = "";
        for (int i = 1; i <= columnCount; ++i) {
          System.out.print(separator + result.getString(i));
          separator = ", ";
        }
        System.out.println();
        ++countRecord;
      }

      /* Anzahl der selektierten Datensätze ausgeben */
      System.out.println("(" + countRecord + " Datensätze)");
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
