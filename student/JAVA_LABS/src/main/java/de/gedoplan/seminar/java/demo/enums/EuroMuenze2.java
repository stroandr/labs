package de.gedoplan.seminar.java.demo.enums;

public enum EuroMuenze2 {
	CENT1(1), CENT2(2), CENT5(5), CENT10(10), CENT20(20), CENT50(50), EURO1(100), EURO2(200);

	private int wert;

	private EuroMuenze2(int wert) {
		this.wert = wert;
	}

	public int getWert() {
		return this.wert;
	}

}
