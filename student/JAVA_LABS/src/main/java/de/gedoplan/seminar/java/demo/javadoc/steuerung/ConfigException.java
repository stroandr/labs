/*
 * Created on 21.12.2005 by dw
 */
package de.gedoplan.seminar.java.demo.javadoc.steuerung;

public class ConfigException extends Exception {
  public ConfigException(String message) {
    super(message);
  }

  public ConfigException(Exception e) {
    super(e);
  }
}
