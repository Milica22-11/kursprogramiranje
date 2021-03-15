package com.company;

public class PronadjiNajmanjiBroj {
    public static void main(String[] args) {
        int broj = 0;
        while ( broj*broj*broj<12000){
             broj++;

        }
        System.out.println("Trazeni broj je " + (broj - 1) );




    }
}
