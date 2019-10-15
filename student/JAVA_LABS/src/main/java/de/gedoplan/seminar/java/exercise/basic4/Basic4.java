package de.gedoplan.seminar.java.exercise.basic4;

public class Basic4 {

	public static void main(String[] args) {
		int [][] dim2 = new int [4][8];

		for (int y=0; y<4; y++) {
			for (int x=0; x<8; x++) {
				dim2 [y][x]=y*x;
			}
		}
		
		
		int sum = 0;
		for (int y=0; y<4; y++) {
			int sumZeile = 0;
			for (int x=0; x<8; x++) {
				//System.out.println(dim2[y][x]);
				sum = sum + dim2[y][x];
				sumZeile = sumZeile +  dim2[y][x];
			}
			System.out.println("Die Summe der Zeile ist: " + sumZeile);
		}
		System.out.println("Die Summe aller Elemente ist: " + sum);
	}
}
