package de.gedoplan.seminar.java.exercise.oo;

public class SchnellkasseMain {

    public static void main(String[] args) {
        Artikel1 butter = new Artikel1(1, "Butter", 2.);
        Artikel1 brot = new Artikel1(2, "Brot", 3.60);
        Artikel1 milch = new Artikel1(3, "Milch", 1.20);

        Schnellkasse schnellkasse = new Schnellkasse();
        schnellkasse.addArtikel(butter, 2);
        schnellkasse.printSumme();

        schnellkasse.removeArtikel(butter,1);
        schnellkasse.printSumme();

        schnellkasse.addArtikel(brot, 1);
        schnellkasse.addArtikel(milch,3);
        schnellkasse.printSumme();
    }

}
