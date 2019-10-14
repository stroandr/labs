/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import de.gedoplan.seminar.java.demo.jdbc.ConnectionUtil;

public class CustUpd {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Usage: java de.gedoplan.seminar.java.exercise.jdbc.CustUpd id yyyy-mm-dd");
      System.exit(2);
    }

    int custId = Integer.parseInt(args[0]);
    String lastContact = args[1];

    try (Connection dbCon = ConnectionUtil.createConnection();
        Statement dbStmt = dbCon.createStatement();) {

      // Run SQL
      String sqlCmd = "update EXERCISE_CUST set LAST_CONTACT={d '" + lastContact + "'} where CUST_ID=" + custId;
      System.out.println(sqlCmd);

      int count = dbStmt.executeUpdate(sqlCmd);
      System.out.println("(" + count + " rows updated)");
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
