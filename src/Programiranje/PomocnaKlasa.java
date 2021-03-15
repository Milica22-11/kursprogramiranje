package Programiranje;

import java.util.Scanner;

public class PomocnaKlasa {

    public static void main(String[] args) {
        int[] niz = PomocnaKlasa.unesiNiz(3);
        for (int broj : niz) {
            System.out.println("broj " + broj);

        }


    }

    public static int[] unesiNiz(int brojUnosa) {
        System.out.println("Unesite " + brojUnosa + " integera ");
        Scanner scanner = new Scanner(System.in);
        int[] niz = new int[brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }
        return niz;
    }

}
