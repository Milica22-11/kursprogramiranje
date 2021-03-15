package com.company;

import java.util.Scanner;

public class Ocjene {
    public static void main(String[] args) {
        int bodovi = 0;
        System.out.println("Unijeti broj bodova");
        Scanner scanner = new Scanner(System.in);
        bodovi = 70;
        if (bodovi > 90) {
            System.out.println("Ocjena 10");
        }
        //rang od 80 - 89
        if (bodovi < 90 && bodovi >= 80) {
            System.out.println("Ocjena 9");
        }
    }
}



