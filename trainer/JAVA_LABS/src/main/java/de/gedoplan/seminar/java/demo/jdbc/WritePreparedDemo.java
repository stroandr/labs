/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WritePreparedDemo {

  public static void main(String[] args) {

    try (Connection dbCon = ConnectionUtil.createConnection();
        PreparedStatement dbStmt = dbCon.prepareStatement("insert into DEMO_SPRACHEN(ID, NAME) values (?,?)");) {

      // Wert eintragen (insert into SPRACHEN values (5, 'VB'))
      dbStmt.setInt(1, 5);
      dbStmt.setString(2, "VB");
      dbStmt.execute();

      // Wert eintragen (insert into SPRACHEN values (6, 'Java'))
      dbStmt.setInt(1, 6);
      dbStmt.setString(2, "Java");
      dbStmt.execute();
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
