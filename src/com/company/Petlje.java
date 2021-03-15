package com.company;

import java.util.Scanner;

public class Petlje {
    public static void main(String[] args) {
        System.out.println(" Unesite cijele brojeve, 0 zatvara program");
        Scanner scanner = new Scanner(System.in);

        int unosOdKorisnika  = -1;
        int zbirSvihBrojeva = 0 ;
        double prosjek = 0 ;
        int brojac = 0 ;


        while (unosOdKorisnika !=0 ){
            unosOdKorisnika = scanner.nextInt();
            zbirSvihBrojeva += unosOdKorisnika ;
            brojac ++ ;
        }
        System.out.println("zbirSvihBrojeva " + zbirSvihBrojeva);
        prosjek = (double) zbirSvihBrojeva/brojac;
        System.out.println("Prosjek je " + prosjek);



    }



}

