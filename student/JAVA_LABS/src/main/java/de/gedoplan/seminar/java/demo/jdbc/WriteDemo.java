/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteDemo {

  public static void main(String[] args) {
    try (Connection dbCon = ConnectionUtil.createConnection();
        Statement dbStmt = dbCon.createStatement()) {

      // Tabelle anlegen
      try {
        dbStmt.executeUpdate("drop table DEMO_SPRACHEN");
      } catch (SQLException e) {
      }
      dbStmt.executeUpdate("create table DEMO_SPRACHEN (ID INTEGER NOT NULL, NAME VARCHAR(50) NOT NULL)");

      // Werte eintragen
      dbStmt.executeUpdate("insert into DEMO_SPRACHEN(ID, NAME) values (1, 'COBOL')");
      dbStmt.executeUpdate("insert into DEMO_SPRACHEN(ID, NAME) values (2, 'C')");
      dbStmt.executeUpdate("insert into DEMO_SPRACHEN(ID, NAME) values (3, 'Smalltalk')");
      dbStmt.executeUpdate("insert into DEMO_SPRACHEN(ID, NAME) values (4, 'C++')");
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
