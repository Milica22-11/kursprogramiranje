package com.company;

import java.util.Locale;
import java.util.Scanner;

public class zadatakCas {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println(" Unesi neki string");
        //String unos = scanner.next();
        //System.out.println(unos.length());
        //System.out.println(unos.charAt(5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ocjenu od A-F");
        String ocjena = scanner.next();
        switch (ocjena) {
            case "A":
                System.out.println("5");
                break;
            case "B":
                System.out.println("4");
                break;
            case "C":
                System.out.println("3");
                break;
            case "D":
                System.out.println("2");
                break;
            case "F":
                System.out.println("1");
                break;
            default:
                System.out.println("Unesi ponovo");
        }



    }
}
