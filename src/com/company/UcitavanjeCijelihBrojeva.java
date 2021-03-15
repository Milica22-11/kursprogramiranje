package com.company;

import java.util.Scanner;

public class UcitavanjeCijelihBrojeva {
    public static void main(String[] args) {
        System.out.println(" Unijeti broje izmeđe 0 i 999");
        Scanner scanner = new Scanner(System.in);
        int cifra = scanner.nextInt();
        int prviBroj = cifra / 100;
        int drugiBroj = (cifra % 100) / 10;
        int treciBroj = cifra % 10;
        int rezultat = prviBroj + drugiBroj + treciBroj;
        System.out.println("rezultat " + rezultat);


    }
}
