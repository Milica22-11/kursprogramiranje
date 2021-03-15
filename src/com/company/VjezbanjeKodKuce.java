package com.company;

import java.util.Scanner;

//(Konverzija sa kilograma na kilograme) Napišite program koji prikazuje sledeću tabelu (imajte napo napo napojni da je
// 1 kilogram 2,2 funte):
public class VjezbanjeKodKuce {
    public static void main(String[] args) {
        //5.1
        int unos;
        int zbir=0;
        int prosjek=0;
        int brojacPozitivnih = 0;
        int brojacNegativnih = 0;

        System.out.println("Unesite nekakve brojeve a program ce izracunati prosjek");
        Scanner scanner = new Scanner(System.in);
        unos = scanner.nextInt();
        while (unos != 0) {
            if (unos > 0) {
                System.out.println("Unesite opet broj");
                brojacPozitivnih++;
                unos = scanner.nextInt();

            } else if (unos < 0) {
                System.out.println("Unesite opet broj");
                brojacNegativnih++;
                unos = scanner.nextInt();
            }
            zbir+=unos;
        }
        System.out.println("Broj pozitivnih je: " + brojacPozitivnih);
        System.out.println("Broj negativnih je: " + brojacNegativnih);
        System.out.println("Zbir unesenih brojeva je: " + zbir);
        prosjek=zbir/(brojacNegativnih+brojacPozitivnih);
        System.out.println("Prosjek je: " + prosjek);




        //5.5
        //Scanner scanner = new Scanner(System.in);
        //double kursPounds = 2.20;
       // double pounds = 0;
        //System.out.println("Unesi vrijednost kilograma");
        //double funte = scanner.nextDouble();
        //pounds  = funte * kursPounds;
        //System.out.println("Odgovara vrijednosti od " + pounds + "kilogrami ") ;
       // double kursKilograma = 0.4545;
        //double kilo = 0;
        //System.out.println("Unesite vrijednost pounds");
       // double kilogrami = scanner.nextDouble();
       // kilogrami = kursKilograma * kilogrami;
       // System.out.println("Odgovara vrijednsoti od " + kilogrami + "kilo ");

        //5.3
        //kursPounda = 2.20;
        //double rezultat = 0;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Unesi vrijednost kilograma");
        // double funte = scanner.nextDouble();
        // rezultat = funte * Pounds;
        // System.out.println("Odgovara vrijednosti od " + kilogrami+ "pounds ") ;

    }

    }


