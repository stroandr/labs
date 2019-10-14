package de.gedoplan.seminar.eclipse.demo;

import java.util.List;

public class FahrzeugWorker {

	public FahrzeugWorker () {

	}

	public void printFahrzeuge(List <Fahrzeug> list) {

			int i=0; // TEMP VAIRABLE. IST FÜR DIE DEMO DURCH EINE FOR SCHLEIFE ZU ERSETZEN

						System.out.println("Das ist ein Schiff:");
						((Schiff) list.get(i)).printFahrzeugDaten();

						System.out.println("Das ist ein Auto:");
						((Auto) list.get(i)).printFahrzeugDaten();

	}

}
