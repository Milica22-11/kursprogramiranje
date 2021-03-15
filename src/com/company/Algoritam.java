package com.company;

import java.util.Scanner;

public class Algoritam {
    public static void main(String[] args) {
       //0 algoritam
        //1) obavijestiti korisnika da uneseneku sumu
        final double stopaPdva = 1.17;
        System.out.println("Unesite vrijednsoti da izracunamo pdv na nju");
        //2) trebamo uzeti podatak iz konzole
        Scanner scanner = new Scanner(System.in);
        double unesenaVrijednost = scanner.nextDouble();
        //3)izracunati
        double sumaSaPdvOm = unesenaVrijednost * stopaPdva;
        //4) ispisati rezultat
        System.out.println("Ukupan iznos sa pdv-om " + sumaSaPdvOm);
        }
    }

