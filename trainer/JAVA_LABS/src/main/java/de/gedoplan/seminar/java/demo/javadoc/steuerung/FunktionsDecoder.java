package de.gedoplan.seminar.java.demo.javadoc.steuerung;

import java.io.IOException;

/**
 * 
 * @author Dirk Weil
 */
public abstract class FunktionsDecoder extends BusGeraet {
  public FunktionsDecoder(int adr, int width, Steuerung steuerung) {
    super(adr, width, steuerung);
  }

  @Override
  public void setValue(int value) throws IOException {
    super.setValue(value);
  }

  @Override
  public void setValue(int value, int bitOffset, int bitCount) throws IOException {
    super.setValue(value, bitOffset, bitCount);
  }
}
