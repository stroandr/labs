/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.gedoplan.seminar.java.demo.jdbc.ConnectionUtil;

public class CustList {

  public static void main(String[] args) {
    ResultSet dbRes = null;

    try (Connection dbCon = ConnectionUtil.createConnection();
        Statement dbStmt = dbCon.createStatement();) {

      // SQL-Query ausführen
      dbRes = dbStmt.executeQuery("select CUST_ID, NAME, ADDRESS, LAST_CONTACT from EXERCISE_CUST");

      // Ergebnis verarbeiten
      int count = 0;
      while (dbRes.next()) {
        int id = dbRes.getInt(1);
        String name = dbRes.getString(2);
        String address = dbRes.getString(3);
        Date lastContact = dbRes.getDate(4);

        System.out.println(id + ", " + name + ", " + address + ", " + lastContact);

        ++count;
      }
      System.out.println("(" + count + " rows)");
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
