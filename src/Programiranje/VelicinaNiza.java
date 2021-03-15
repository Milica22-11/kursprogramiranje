package Programiranje;

import java.util.Scanner;

public class VelicinaNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite duzinu niza");
        int duz = scanner.nextInt();
        int[] niz = new int[duz];
        int indexNajveci = niz[0];
        int najveciBroj= 0;

        for (int i = 0; i < duz; i++) {
            System.out.println("Unesite vrijednost niza");
            niz[i] = scanner.nextInt();
            if (niz[i]>najveciBroj){
                najveciBroj=niz[i];
                indexNajveci=i;

            }
        }
        System.out.println(najveciBroj);
        System.out.println(indexNajveci);

        }



    }


