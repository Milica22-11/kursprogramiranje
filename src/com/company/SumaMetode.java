package com.company;

import java.util.Scanner;

public class SumaMetode {
    public static void main(String[] args) {

    }
    public static int sumDigits(long number){
        long suma = 0;
        while (number > 0){
            long poslednjaCifra = number%10;
            suma += poslednjaCifra;
            number= number / 10;



        }

        return (int)suma;
    }





}

