package com.company;

import java.util.Scanner;

public class OcjeneIf {
    public static void main(String[] args) {
        int bodovi = 0;
        System.out.println("Unijeti broj bodova");
        Scanner scanner = new Scanner(System.in);
        bodovi = scanner.nextInt();
        if (bodovi> 90){
            System.out.println("Ocjena 10");
        }
        //rang od 80 - 89
        if (bodovi< 90 && bodovi>= 80) {
            System.out.println("Ocjena 9");
        }
        if (bodovi<80 && bodovi>=70){
            System.out.println("Ocjena 8");
        }
        if (bodovi<70 && bodovi>=60){
            System.out.println("Ocjena 7");
        }
        if (bodovi<60 && bodovi>=50){
            System.out.println("Ocjena 6");
        }
        if (bodovi<50 ){
            System.out.println("Niste polozili");
        }
    }
}
