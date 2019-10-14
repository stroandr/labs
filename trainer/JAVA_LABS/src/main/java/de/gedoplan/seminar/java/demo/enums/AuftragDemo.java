package de.gedoplan.seminar.java.demo.enums;

import de.gedoplan.seminar.java.demo.enums.Auftrag.AuftragsTyp;

public class AuftragDemo {

  public static void main(String[] args) {
    showAuftraege();
    showAuftraege14();
  }

  public static void showAuftraege14() {
    System.out.println("----- showAuftraege14 -----");

    Auftrag14[] auftraege = { new Auftrag14("50 Monoblock-Gartenstühle herstellen", Auftrag14.AUFTRAGSTYP_PROD),
        new Auftrag14("100 Schirmständer umlagern", Auftrag14.AUFTRAGSTYP_LAGER),
        new Auftrag14("Spritzform polieren", Auftrag14.AUFTRAGSTYP_WARTUNG) };

    for (Auftrag14 auftrag : auftraege) {
      System.out.println(auftrag);
    }
  }

  public static void showAuftraege() {
    System.out.println("----- showAuftraege -----");

    Auftrag[] auftraege = { new Auftrag("50 Monoblock-Gartenstühle herstellen", AuftragsTyp.PROD),
        new Auftrag("100 Schirmständer umlagern", AuftragsTyp.LAGER),
        new Auftrag("Spritzform polieren", AuftragsTyp.valueOf("WARTUNG")) };

    for (Auftrag auftrag : auftraege) {
      System.out.println(auftrag);
    }
  }

}
