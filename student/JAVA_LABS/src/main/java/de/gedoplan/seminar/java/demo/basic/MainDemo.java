package de.gedoplan.seminar.java.demo.basic;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class MainDemo {

    public static void main(String[] args) {
        System.out.println("Anzahl Argumente: " + args.length);
        System.out.println("Erstes Element: " + args[0]);
        System.out.println("Zweites Element: " + args[1]);
    for (int x=0; x < args.length; x++) {
    	System.out.println("Element " + x + ": " + args[x]);
    }
    }
}
