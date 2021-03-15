package com.company;

public class PronadjiBrojeve {
    public static void main(String[] args) {
        int brojac = 0;
        for ( int i = 100; i <200; i++){
            if( i % 5 == 0  ^  i % 6 == 0 ){
                brojac++;
                if( brojac % 10 == 0 ){
                    System.out.print(i + " \n");
                }
                else {
                    System.out.print(i + " ");
                }


        }


    }
}
}


