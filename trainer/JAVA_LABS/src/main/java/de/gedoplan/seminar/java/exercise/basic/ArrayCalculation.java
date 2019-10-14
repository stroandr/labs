package de.gedoplan.seminar.java.exercise.basic;

/**
 * Kalkulation der Elemente eines zwei dimensionalen Arrays.
 * Jedes Element des Arrays wird mit dem Produkt aus Zeile und Spalte gefuellt.
 * Es wird die Summe jeder Zeile und die Gesamtsumme berechnet und ausgegeben.
 *
 * @author Reinhard Brueggemeyer
 */
public class ArrayCalculation {

    public static void main(String[] args) {
        int maxLine = 8;
        int maxRow = 4;
        int totalValue = 0;
        int[][] myArray = new int[maxLine][maxRow];

        for (int i = 0; i < maxLine; i++) {
            int lineValue = 0;
            for (int j = 0; j < maxRow; j++) {
                int fieldValue = (i + 1) * (j + 1);
                myArray[i][j] = fieldValue;
                lineValue = lineValue + fieldValue;
                totalValue = totalValue + fieldValue;
            }
            System.out.println("Wert der Zeile " + (i + 1) + ": " + lineValue);
        }
        System.out.println("Gesamtwert: " + totalValue);
    }
}
