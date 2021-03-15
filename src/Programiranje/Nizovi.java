package Programiranje;

import java.util.Scanner;

public class Nizovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nizOcjena = new int[10];
        double sumaUnesenihOcjena = 0;
        int brojacOcjenaIznadProsjeka = 0;
        for (int i=0; i<nizOcjena.length;i++){
            System.out.println("Unesite broj na poziciju "+ i);
            nizOcjena[i]=scanner.nextInt();
            sumaUnesenihOcjena+= nizOcjena[i];
        }
        double prosjek = sumaUnesenihOcjena/nizOcjena.length;
        for (int i = 0; i< nizOcjena.length;i++){
            if (prosjek < nizOcjena[i]){
                brojacOcjenaIznadProsjeka++;
            }
            System.out.println("prosjek " + prosjek);

        }


    }
}
