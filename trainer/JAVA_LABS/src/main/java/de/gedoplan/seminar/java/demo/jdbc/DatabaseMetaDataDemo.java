/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;

/**
 * Demo-Klasse zur Abfrage von Datenbank-Metadaten mit JDBC
 */
public class DatabaseMetaDataDemo {

  /**
   * Haupt-Methode
   *
   * @param args
   *          Kommandozeilen-Argumente
   * @throws ClassNotFoundException
   */
  public static void main(String[] args) throws ClassNotFoundException {

    try (Connection connection = ConnectionUtil.createConnection()) {

      DatabaseMetaData meta = connection.getMetaData();

      System.out.println(
          "RDBMS: " + meta.getDatabaseProductName() + ", Version " + meta.getDatabaseProductVersion());

      System.out.println("JDBC-Treiber: " + meta.getDriverName() + ", Version " + meta.getDriverVersion());

      System.out.println("Datum-/Zeit-Funktionen: " + meta.getTimeDateFunctions());

      System.out.println("Unterstützung SQL92: " + meta.supportsANSI92EntryLevelSQL());

      System.out.println("Unterstützung Outer Join: " + meta.supportsOuterJoins());

      System.out.print("Unterstützung Isolation Level:");
      Map<Integer, String> isolationLevels = new HashMap<>();
      isolationLevels.put(Connection.TRANSACTION_NONE, "TRANSACTION_NONE");
      isolationLevels.put(Connection.TRANSACTION_READ_UNCOMMITTED, "TRANSACTION_READ_UNCOMMITTED");
      isolationLevels.put(Connection.TRANSACTION_READ_COMMITTED, "TRANSACTION_READ_COMMITTED");
      isolationLevels.put(Connection.TRANSACTION_REPEATABLE_READ, "TRANSACTION_REPEATABLE_READ");
      isolationLevels.put(Connection.TRANSACTION_SERIALIZABLE, "TRANSACTION_SERIALIZABLE");
      for (Integer isolationLevel : isolationLevels.keySet()) {
        if (meta.supportsTransactionIsolationLevel(isolationLevel)) {
          System.out.print(" " + isolationLevels.get(isolationLevel));
          if (connection.getTransactionIsolation() == isolationLevel) {
            System.out.print(" (aktueller Wert)");
          }
        }
        System.out.println();
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
