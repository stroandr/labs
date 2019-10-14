package de.gedoplan.seminar.java.demo.stdlib;

import java.text.Collator;
import java.util.Locale;

public class CollatorDemo {

    public static void main(String[] args) {

        //Unicode compare A liegt vor B
        int result = "A".compareTo("B");
        System.out.println("String compare A->B: " + result);

        //Unicode compare Ä liegt hinter B
        result = "Ä".compareTo("B");
        System.out.println("String compare Ä->B: " + result);

        // Collator mit Locale.German: Ä liegt vor B im deutschen Alphabet
        Collator collator = Collator.getInstance(Locale.GERMAN);
        result = collator.compare("Ä", "B");
        System.out.println("Collator compare Ä->B: " + result);
    }
}
