package com.company;

import java.util.Scanner;

public class OduzimanjeNasumicnihBrojeva {
    public static void main(String[] args) {
        int razlika;
        int unos;
        int privremena;

        int broj1 = (int) (Math.random() * 8) + 1;
        int broj2 = (int) (Math.random() * 9) + 1;
        if (broj1 < broj2) {
            privremena = broj1;
            broj1 = broj2;
            broj2 = privremena;
        }            Scanner scanner = new Scanner(System.in);

        razlika = broj1 - broj2;
        System.out.println("Kolika je razlika " + broj1 + " i " + broj2);

       do {
           unos = scanner.nextInt();
       }
        while ( unos != razlika);
        System.out.println("Cestitam");




    }
}
