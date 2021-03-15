package com.company;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        // 0 obavijestiti korisnika da unese podatke
        double celzijus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unijeti fahrenheite da izracuna celzijuse");
        //1 treba uzeti podatke
        celzijus = scanner.nextDouble();

        //2 izracunati
        double fahrenheite = (9.0 / 5) * celzijus + 32;
        System.out.print("tamperatura u celzijusima " + celzijus + " je " + fahrenheite);

    }
}
