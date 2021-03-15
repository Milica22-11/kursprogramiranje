package com.company;

import java.util.Scanner;

public class djeliviBroj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi cijeli broj");
        int broj = scanner.nextInt();
        for ( int i = 1; i < broj; i++ ){
            if ( i % 13 == 0){
                System.out.print(i + " ");

            }

        }

    }
}
