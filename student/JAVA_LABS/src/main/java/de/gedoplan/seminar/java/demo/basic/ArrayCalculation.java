package de.gedoplan.seminar.java.demo.basic;

public class ArrayCalculation {
    public static void main(String[] args) {
        int[][] dim2 = new int[8][4];
        int gesamtSumme = 0;
        for (int zeile = 0; zeile < dim2.length; zeile++) {
            int zeilenSumme = 0;
            for (int spalte = 0; spalte < dim2[zeile].length; spalte++) {
                dim2[zeile][spalte] = (zeile + 1) * (spalte + 1);
                zeilenSumme += dim2[zeile][spalte];
            }
            System.out.println("Die Zeile " + zeile + " hat die Summe: " + zeilenSumme);
            gesamtSumme += zeilenSumme;
        }
        System.out.println("Die Gesamtsumme ist: " + gesamtSumme);
    }
}
