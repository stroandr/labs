package de.gedoplan.seminar.java.demo.stdlib;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
  public static void main(String[] args) {
    showText("en", "customer");
    showText("en", "country");
    showText("en", "town");

    showText("de", "customer");
    showText("de", "country");
    showText("de", "town");
  }

  private static void showText(String language, String key) {
    System.out.println("language=" + language + ", key=" + key + ", value=" + getText(language, key));
  }

  private static String getText(String language, String key) {
    return getText(new Locale(language), key);
  }

  private static String getText(Locale locale, String key) {
    try {
      ResourceBundle bundle = ResourceBundle.getBundle("de.gedoplan.seminar.java.demo.stdlib.messages", locale);
      return bundle.getString(key);
    } catch (MissingResourceException e) {
      return "???" + key + "???";
    }
  }

}
