package de.gedoplan.seminar.java.demo.basic;

public class Playground {
    public static void main(String[] args) {

        for (int i = 0, j = 1; i < 10; i++, j *= 2) {
            System.out.println("2^" + i + "= " + j);
        }
    }
}
