package com.company;

public class DuplanjeSkolarine {
    public static void main(String[] args) {

        double skolarina = 5000 ;
        final double POVECANJE = 1.07;
        double godine = 0;
        double uduplanaSkolarina = skolarina*2;



        while ( skolarina<=uduplanaSkolarina){
            godine++;
            skolarina*=POVECANJE;
            System.out.println(godine);
        }






    }
}
