package com.company;
import java.util.Scanner;
public class CijenaVoznje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite distancu");
        double distancaVoznje = scanner.nextDouble();
        System.out.println("Unesite potrosnju");
        double potrosnja = scanner.nextDouble();
        System.out.println("Unesite cijenu po litri");
        double cijenaPoLitri = scanner.nextDouble() ;

        double cijenaVoznje = distancaVoznje/100 * potrosnja * cijenaPoLitri;
        System.out.println("cijena voznje za navedenu distancu " + cijenaVoznje);
    }
}
