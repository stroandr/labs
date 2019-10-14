/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDynamicDemo {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Usage: java de.gedoplan.seminar.java.demo.jdbc.ReadDynamicDemo \"SQL select command\"");
      System.exit(1);
    }
    StringBuilder sqlCmd = new StringBuilder();
    for (int i = 0; i < args.length; ++i) {
      sqlCmd.append(args[i]);
      sqlCmd.append(' ');
    }

    ResultSet dbRes = null;

    try (Connection dbCon = ConnectionUtil.createConnection();
        Statement dbStmt = dbCon.createStatement()) {

      // SQL-Query ausführen
      dbRes = dbStmt.executeQuery(sqlCmd.toString());

      // Tabellenspalten-Namen ausgeben
      ResultSetMetaData dbResMeta = dbRes.getMetaData();
      int colCount = dbResMeta.getColumnCount();
      String separator = "";
      for (int i = 1; i <= colCount; ++i) {
        System.out.print(separator + dbResMeta.getColumnName(i));
        separator = ", ";
      }
      System.out.println();

      // Ergebnis verarbeiten
      int count = 0;
      while (dbRes.next()) {
        separator = "";
        for (int i = 1; i <= colCount; ++i) {
          System.out.print(separator + dbRes.getString(i));
          separator = ", ";
        }
        System.out.println();
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
