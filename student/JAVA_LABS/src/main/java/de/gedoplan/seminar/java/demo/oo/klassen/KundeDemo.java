package de.gedoplan.seminar.java.demo.oo.klassen;

public class KundeDemo {

  public static void main(String[] args) {
    demoKunde();
    // demoKunde3();
  }

  public static void demoKunde() {
    Kunde kunde1; // Objektreferenz
    kunde1 = new Kunde(); // Objekt erzeugen

    Kunde kunde2 = new Kunde(); // beides auf einmal

    System.out.println(kunde2 == kunde1);

    kunde2 = null; // Objekt freigeben

    System.out.println(kunde2 == null);

    kunde2 = kunde1;

    System.out.println(kunde2 == kunde1);
  }

  public static void demoKunde2() {
    {
      Kunde k1;
      {
        Kunde k2 = new Kunde();

        k1 = k2;

        // k1 und k2 sind gültig und referenzieren das gleiche Objekt
      }
      // nur k1 ist noch gültig
    }
    // k1 und k2 sind ungültig; das Objekt existiert ggf. noch, kann aber nicht mehr zugegriffen werden

  }

  public static void demoKunde3() {
    // toString-Methode wird für Umwandlung zu String automatisch verwendet

    Person person = new Person();
    // toString default:
    System.out.println(person);

    // eigene toString Methode
    Kunde kunde1 = new Kunde();
    System.out.println(kunde1);
    Kunde kunde2 = new Kunde("Meier");
    System.out.println(kunde2);
    Kunde kunde3 = new Kunde("Schmidt", 1.89);
    System.out.println(kunde3);
  }
}
