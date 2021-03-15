package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unijeti jednocifreni broj od 1-7");
        int dan = scanner.nextInt();
        switch (dan){
            case 1:
                System.out.println("Ponedjeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Srijeda");
                break;
            case 4:
                System.out.println("Cetvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("Pogresan unos, molimo unesite broj u rasponu od 1-7");
                scanner.close();

        }
    }


    }

