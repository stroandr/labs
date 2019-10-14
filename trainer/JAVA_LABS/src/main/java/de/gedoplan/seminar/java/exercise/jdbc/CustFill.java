/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import de.gedoplan.seminar.java.demo.jdbc.ConnectionUtil;

public class CustFill {

  public static void main(String[] args) {
    try (Connection dbCon = ConnectionUtil.createConnection();
        Statement dbStmt = dbCon.createStatement();) {
      // Tabelle anlegen
      try {
        dbStmt.executeUpdate("drop table EXERCISE_CUST");
      } catch (SQLException e) {
      }
      dbStmt
          .executeUpdate("create table EXERCISE_CUST (CUST_ID INTEGER NOT NULL, NAME VARCHAR(30) NOT NULL, ADDRESS VARCHAR(100) NOT NULL, LAST_CONTACT DATE NULL)");

      // Werte eintragen
      dbStmt
          .executeUpdate("insert into EXERCISE_CUST(CUST_ID, NAME, ADDRESS) values (100, 'Audi', 'Ingolstadt')");
      dbStmt
          .executeUpdate("insert into EXERCISE_CUST(CUST_ID, NAME, ADDRESS) values (200, 'BMW', 'München')");
      dbStmt
          .executeUpdate("insert into EXERCISE_CUST(CUST_ID, NAME, ADDRESS) values (300, 'Porsche', 'Stuttgart')");
      dbStmt
          .executeUpdate("insert into EXERCISE_CUST(CUST_ID, NAME, ADDRESS) values (400, 'VW', 'Wolfsburg')");
    } catch (SQLException e) {
      e.printStackTrace(System.err);

      while (true) {
        e = e.getNextException();
        if (e == null) {
          break;
        }

        System.err.println("Nested exception: " + e);
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
