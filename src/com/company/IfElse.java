package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unijeti jednocifreni broj od 1-7");
        int dan = scanner.nextInt();
        if (dan == 1){
            System.out.println("Ponedeljak");
        }
        else if (dan == 2){
            System.out.println("Utorak");
        }
        else if ( dan == 3){
            System.out.println("Srijeda");
        }
        else if ( dan == 4){
            System.out.println("Cetvrtak");
        }
        else if ( dan == 5){
            System.out.println("Petak");
        }
        else if ( dan == 6){
            System.out.println("Subota");
        }
        else if ( dan == 7){
            System.out.println("Nedelja");
        }
        else {
            System.out.println("Pogresan unos, molimo unesite broj u rasponu od 1-7");
        }
        scanner.close();


            }
        }

