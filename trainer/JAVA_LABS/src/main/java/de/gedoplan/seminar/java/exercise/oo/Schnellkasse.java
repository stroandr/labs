package de.gedoplan.seminar.java.exercise.oo;

public class Schnellkasse {
    private double summe = 0.;

    public void addArtikel(Artikel1 artikel, int anzahl) {
        this.summe += artikel.berechneBruttopreis() * anzahl;
    }

    public void removeArtikel(Artikel1 artikel, int anzahl) {
        this.summe -= artikel.berechneBruttopreis() * anzahl;
    }

    public void printSumme() {
        System.out.println("Bruttopreis aller Artikel: " + summe);
    }
}
