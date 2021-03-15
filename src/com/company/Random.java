package com.company;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int unesenaVrijednost;
        int random1 = (int) (Math.random()*10)+1;
        int random2 = (int) (Math.random()*10)+1;
        System.out.println("Koliki je zbir " + random1 + " i " + random2);
        Scanner scanner = new Scanner(System.in);
        unesenaVrijednost = scanner.nextInt();
        if (unesenaVrijednost == (random1+random2)){
            System.out.println("Cestitam");
        }
        else {
            System.out.println("Netacno ste odgovorili, tacan odgovor je:"+ (random1+random2));
        }


    }
}
