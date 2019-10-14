package de.gedoplan.seminar.java.exercise.exceptions.automat;

public class AutomatMain {
	
	public static void main(String[] args) {
		 testAutomatException(5, "D-123");
		// testAutomatException(5, null);
		// testAutomatException(5, "FR-778");
//		 testAutomatException(12, "D-778");
	}

	public static void testAutomatException(int anzahlFlaschen, String code) {
		Automat automat = new Automat(5);
		
		try {
			double pfand = automat.flaschenEinwerfen(anzahlFlaschen, code);
			System.out.println(anzahlFlaschen + " Flaschen erfolgreich angenommen.");
			System.out.println("Ihr Pfandgeld €: " + pfand );
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCodeException e) {
			System.out.println(e.getMessage());
		} catch (AutomatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Unerwarteter Fehler aufgetreten: " + e);
		}
	}
}
