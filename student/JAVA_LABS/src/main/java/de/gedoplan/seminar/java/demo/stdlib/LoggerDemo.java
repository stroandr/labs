package de.gedoplan.seminar.java.demo.stdlib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class LoggerDemo {

  public static void main(String[] args) {
    // Log4j
    log4j();

    // Java util Logging
    jul();
  }

  private static void log4j() {

    Logger logger = LogManager.getLogger(LoggerDemo.class);

    logger.error("Fehler log4j");

    logger.warn("Warnung log4j");

    logger.info("Information log4j");

    logger.debug("Debug-Meldung log4j");
  }

  private static void jul() {
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoggerDemo.class.getName());

    // wird nicht geloggt aufgrund von logging.properties Konfiguration im JRE
    logger.fine("Fine mit JUL");

    logger.info("Info mit JUL");

    logger.warning("Warning mit JUL");

    logger.severe("Severe mit JUL");
  }
}
