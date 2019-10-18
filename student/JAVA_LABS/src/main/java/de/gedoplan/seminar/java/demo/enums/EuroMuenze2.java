package de.gedoplan.seminar.java.demo.enums;

public enum EuroMuenze2 {
	cent1(0.01), cent2(0.02), cent5(0.05), cent10(0.1), cent20(0.2), cent50(0.5), euro1(1.0), euro2(2.0);

	private double wert;

	private EuroMuenze2(double wert) {
		this.wert = wert;
	}

	public double getWert() {
		return this.wert;
	}

}
