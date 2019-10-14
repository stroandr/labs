package de.gedoplan.seminar.java.demo.oo.vererbung;

public class FahrzeugTest1 {
  public static void main(String[] Args) {
    fahrzeugTest_1();
    fahrzeugTest_2();
    fahrzeugTest_3();
  }

  public static void fahrzeugTest_1() {
    Auto a = new Auto("Peugeot 405", 38500, 90);
    Fahrrad f = new Fahrrad("Adler", 1250, "Trecking");
    System.out.println(a.toString());
    System.out.println(f.toString());
  }

  public static void fahrzeugTest_2() {
    Auto a = new Auto("Peugeot 405", 38500, 90);
    Fahrrad f = new Fahrrad("Adler", 1250, "Trecking");

    zeige(a);
    zeige(f);
  }

  public static void fahrzeugTest_3() {

    PKW p = new PKW("Peugeot 206CC", 26000, 105, true);
    LKW l = new LKW("MAN", 157800, 250, 7.5);

    zeige(p);
    zeige(l);
  }

  public static void zeige(Fahrzeug f) {
    System.out.println("Fahrzeugdaten: " + f.toString());
  }

}
