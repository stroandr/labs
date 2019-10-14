/*
 * Copyright (c) 2016
 * GEDOPLAN Unternehmensberatung und EDV-Organisation GmbH
 * Stieghorster Str. 60, D-33605 Bielefeld, Germany
 * http://www.gedoplan.de
 * All rights reserved.
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Demo-Klasse zur Transaktions-Verarbeitung mit JDBC
 */
public class TransactionDemo {

  /**
   * Haupt-Methode
   *
   * @param args
   *          Kommandozeilen-Argumente
   */
  public static void main(String[] args) {

    try (Connection connection = ConnectionUtil.createConnection(false);
        Statement statement = connection.createStatement();) {

      try {
        statement.executeUpdate("update PERSON set VORNAME = 'Michael' where ID = 3");
        statement.executeUpdate("update PERSON set VORNAME = 'Luise' where UNKNOWN_COLUMN = 5");

        connection.commit();
        System.out.println("Transaktion mit commit festgeschrieben");
      } catch (Exception e) {
        try {
          connection.rollback();
          System.out.println("Transaktion mit rollback abgebrochen");
        } catch (Throwable t) {
          // ignore
        }
        e.printStackTrace(System.err);
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
