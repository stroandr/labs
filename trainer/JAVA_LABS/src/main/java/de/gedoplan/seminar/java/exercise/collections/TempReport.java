package de.gedoplan.seminar.java.exercise.collections;

import java.util.HashMap;
import java.util.Map;

public class TempReport {

  private static Map tempMap = new HashMap();

  public static void main(String[] args) {
    registerTemp("London", 8.6);
    registerTemp("Paris", 12.3);
    registerTemp("Berlin", 11.1);

    for (int i = 0; i < args.length; ++i) {
      System.out.println(args[i] + ": " + getTemp(args[i]) + "°C");
    }
  }

  private static void registerTemp(String name, double temp) {
    // Hier Code einfügen: Temperatur für angegebene Stadt merken

    Double tempObj = new Double(temp);
    tempMap.put(name, tempObj);

  }

  private static double getTemp(String name) {
    double temp = 0;

    // Hier Code einfügen: Temperatur für angegebene Stadt in temp bereitstellen

    Double tempObj = (Double) tempMap.get(name);
    temp = tempObj.doubleValue();

    return temp;
  }
}
