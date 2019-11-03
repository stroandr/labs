package de.gedoplan.seminar.java.demo.basic;

public class Echo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        for (String s : args) {
            System.out.print((s) + " ");
        }
    }
}
