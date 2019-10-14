package de.gedoplan.seminar.java.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

  public static Connection createConnection() throws SQLException {
    return createConnection(true);
  }

  public static Connection createConnection(boolean autoCommit) throws SQLException {
    /* Bestimmen der Zugriffs-Parameter */
    String driver = "org.h2.Driver";
    String url = "jdbc:h2:~/h2/seminar;AUTO_SERVER=TRUE";

    /* Laden und Registrieren der JDBC-Treiber-Klasse */
    /* ab JDBC 4 nicht mehr notwendig */
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("Fehler bei Herstellen einer Verbindung", e);
    }

    /* Festlegen der Login-Daten */
    Properties credentials = new Properties();
    credentials.setProperty("user", "seminar");
    credentials.setProperty("password", "seminar");
    Connection connection = DriverManager.getConnection(url, credentials);
    connection.setAutoCommit(autoCommit);
    return connection;
  }
}
