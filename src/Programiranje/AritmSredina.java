package Programiranje;

import java.util.Scanner;

public class AritmSredina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite 5 decimalnih brojeva");
        double [] niz = new double[5];
        for (int i =0; i<niz.length;i++){
            niz[i]= scanner.nextDouble();

        }
        System.out.println(average(niz));
    }

    public static int average(int[]array) {
        int prosjek;
        int zbirElemenata = 0;
        for (int i =0; i<array.length;i++){
            zbirElemenata+=array[i];

        }
        prosjek=zbirElemenata/array.length;
        return prosjek;
    }
    public static double average(double[]array) {
        double prosjek;
        double zbirElemenata = 0;
        for (int i =0; i<array.length;i++){
            zbirElemenata+=array[i];

        }
        prosjek=zbirElemenata/array.length;
        return prosjek;
    }






}
