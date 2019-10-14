/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.demo.enums;

public class Auftrag14 {
  private String bezeichnung;
  private int typ;

  public static final int AUFTRAGSTYP_PROD = 1;
  public static final int AUFTRAGSTYP_LAGER = 2;
  public static final int AUFTRAGSTYP_WARTUNG = 3;

  public Auftrag14(String bezeichnung, int typ) {
    this.bezeichnung = bezeichnung;
    this.typ = typ;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("Auftrag {");
    result.append(this.bezeichnung);
    result.append(", ");
    switch (this.typ) {
    case AUFTRAGSTYP_PROD:
      result.append("PROD");
      break;

    case AUFTRAGSTYP_LAGER:
      result.append("LAGER");
      break;

    case AUFTRAGSTYP_WARTUNG:
      result.append("WARTUNG");
      break;
    }
    result.append("}");
    return result.toString();
  }
}
