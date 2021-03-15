package com.company;

import java.util.Scanner;

public class FunteIf {
    public static void main(String[] args) {
        double kursFunte = 2.20;
        double rezultat = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pretvoriti finte u kovertibilne marke");
        double funte = scanner.nextDouble();
        if (funte>0){
            rezultat = kursFunte * funte;
            System.out.println("rezultat" + rezultat);
        }
        else {
            System.out.println("Unijeli ste negativnu vrijednost");
        }

        }



    }

