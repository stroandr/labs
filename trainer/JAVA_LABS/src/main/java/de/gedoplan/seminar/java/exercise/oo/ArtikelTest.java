package de.gedoplan.seminar.java.exercise.oo;

import de.gedoplan.seminar.java.demo.oo.interfaces.ArrayService;
import de.gedoplan.seminar.java.demo.oo.interfaces.ArrayService_2;
import de.gedoplan.seminar.java.demo.oo.interfaces.Sortable;

public class ArtikelTest {

    public static void main(String[] args) {
        testErzeugenArtikel();
        // testBerechneBruttopreis();
        // testArtikelVererbung();
        // testQuicksortForSortable();
        // testQuicksortForComparable();
    }

    public static void testErzeugenArtikel() {
        System.out.println("Artikelliste:");

        Artikel1 artikel1 = new Artikel1();
        artikel1.setArtikelnummer(4711);
        artikel1.setBezeichnung("Schraube");
        artikel1.setPreis(10.00);
        System.out.println(artikel1.toString());

        Artikel1 artikel2 = new Artikel1(4712, "Eimer");
        System.out.println(artikel2.toString());

        Artikel1 artikel3 = new Artikel1(4713, "Hammer", 4.95);
        System.out.println(artikel3.toString());

        System.out.println();
    }

    public static void testBerechneBruttopreis() {
        Artikel1 artikel1 = new Artikel1();
        artikel1.setBezeichnung("Ratzefummel-BigPack");
        artikel1.setPreis(10.00);
        double bruttopreis = artikel1.berechneBruttopreis();
        System.out.println("Bruttopreis: " + bruttopreis);
    }

    public static void testArtikelVererbung() {
        Artikel3 artikel4 = new ElektroArtikel(4811, "Gartenlampe", 19.95, 100);
        System.out.println(artikel4.toString());

        HolzArtikel artikel5 = new HolzArtikel(4911, "Parkettplatten", 29.95, false);
        System.out.println(artikel5.toString());
    }

    public static void testQuicksortForSortable() {
        Sortable[] array = {new Artikel3(4711, "Schraube", 0.10), new Artikel3(4712, "Eimer", 2.29),
                new Artikel3(4713, "Hammer", 4.95), new ElektroArtikel(4611, "Gartenlampe", 39.95, 100),
                new HolzArtikel(4411, "Parkettplatten", 29.95, false)};

        ArrayService_2.qSort(array);

        System.out.println("Artikelliste nach Artikelnummer:");
        for (Sortable element : array) {
            System.out.println(element);
        }

        System.out.println();
    }

    public static void testQuicksortForComparable() {
        Comparable[] array = {new Artikel3(4711, "Schraube", 0.10), new Artikel3(4712, "Eimer", 2.29),
                new Artikel3(4713, "Hammer", 4.95), new ElektroArtikel(4611, "Gartenlampe", 39.95, 100),
                new HolzArtikel(4411, "Parkettplatten", 29.95, false)};

        ArrayService.qSort(array);

        System.out.println("Artikelliste nach Artikelpreis:");
        for (Comparable element : array) {
            System.out.println(element);
        }

        System.out.println();
    }
}
