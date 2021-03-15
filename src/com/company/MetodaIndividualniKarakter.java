package com.company;

public class MetodaIndividualniKarakter {
    public static void main(String[] args) {

    ispisiKarakter('A','n', 10);
    }
    public static void ispisiKarakter ( char pocetniKarakter, char zavrsniKarakter, int brojPoLiniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i <= zavrsniKarakter; i++) {
            System.out.print(i + " ");
            brojac++;
            if(brojac==brojPoLiniji ){
                System.out.println( );
                brojac=0;
            }


        }

    }
    }



