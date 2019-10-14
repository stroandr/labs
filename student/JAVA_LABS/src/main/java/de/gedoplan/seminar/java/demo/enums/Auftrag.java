/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.demo.enums;

public class Auftrag {
  public static enum AuftragsTyp {
    PROD, LAGER, WARTUNG
  };

  private String bezeichnung;
  private AuftragsTyp typ;

  public Auftrag(String bezeichnung, AuftragsTyp typ) {
    this.bezeichnung = bezeichnung;
    this.typ = typ;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("Auftrag {");
    result.append(this.bezeichnung);
    result.append(", ");
    // switch ( this.typ )
    // {
    // case PROD:
    // result.append("PROD");
    // break;
    //
    // case LAGER:
    // result.append("LAGER");
    // break;
    //
    // case WARTUNG:
    // result.append("WARTUNG");
    // break;
    // }
    // einfacher:
    result.append(this.typ.toString());

    result.append("}");

    return result.toString();
  }
}
