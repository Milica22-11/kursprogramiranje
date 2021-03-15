package com.company;

import java.util.Scanner;

public class PrestupneGodine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite pocetnu");
        int pocetnaGodina = scanner.nextInt();
        System.out.println("Unesite krajnju");
        int krajnjaGodina = scanner.nextInt();


        for(int godina = pocetnaGodina; godina <= krajnjaGodina; godina++){
            if((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)){
                System.out.print(  godina + " ");
            }
        }
    }
}
