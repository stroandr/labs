/**
 * (c) Enterprise Java Team, GEDOPLAN GmbH
 */
package de.gedoplan.seminar.java.demo.enums;

public enum GrundRechenart {
  PLUS {
    @Override
    public double eval(double val1, double val2) {
      return val1 + val2;
    }
  },
  MINUS {
    @Override
    public double eval(double val1, double val2) {
      return val1 - val2;
    }
  },
  MAL {
    @Override
    public double eval(double val1, double val2) {
      return val1 * val2;
    }
  },
  DURCH {
    @Override
    public double eval(double val1, double val2) {
      return val1 / val2;
    }
  };

  public abstract double eval(double val1, double val2);
}
