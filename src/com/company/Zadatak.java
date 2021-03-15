package com.company;

import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        //0 obavjestiti korisnika da unese broj sekundi kao cijeli broj
        int brojSekundi;
        System.out.println("Unijeti sekunde da se izracunaju minute");
        //1)treba uzeti podatke
        Scanner scanner = new Scanner(System.in);
        brojSekundi = scanner.nextInt();
        //2)izracunati
        int sekunde = brojSekundi%60;
        int minute = brojSekundi/60;
        //3)ispis rezultata
        System.out.print(brojSekundi + "je" + minute + "minuta i" + sekunde + "sekundi");

    }

    }

