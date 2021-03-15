package Programiranje;

import java.util.Scanner;

public class Niz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Unesite duzinu niza");
        int duzinaNIza = scanner.nextInt();
        int [] niz = new int[duzinaNIza];
        for (int i=0; i< niz.length; i++){
            niz[i] =(int)( Math.random()*10)+1;
            System.out.println(niz[i]);

        }


    }
}
