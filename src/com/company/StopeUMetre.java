package com.company;

import java.util.Scanner;

public class StopeUMetre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unijeti stope da izracuna metre");
       double stope = scanner.nextDouble();
       final double METRI = 0.305;
       double rezultat = stope * METRI;
        System.out.println("Broj ucitanih stopa  u metrima je: " + rezultat);
    }
}
