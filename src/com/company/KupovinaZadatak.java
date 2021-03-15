package com.company;

import java.util.Scanner;

public class KupovinaZadatak {
    public static void main(String[] args) {
        double tezinaPakovanja1 ;
        double tezinaPakovanja2 ;
        double cijenaPakovanja1 ;
        double cijenaPakovanja2 ;
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite tezinu i cijenu paketa 1");
        tezinaPakovanja1 = unos.nextDouble();
        cijenaPakovanja1 = unos.nextDouble();
        System.out.println("Unesite tezinu i cijenu paketa 2");
        tezinaPakovanja2= unos.nextDouble();
        cijenaPakovanja2 = unos.nextDouble();

        double vrijednostPakovanja1 = cijenaPakovanja1/tezinaPakovanja1;
        double vrijednostPakovanja2 = cijenaPakovanja2/tezinaPakovanja2;

        if (vrijednostPakovanja1>vrijednostPakovanja2){
            System.out.println("Pakovanje2 je isplativije od pakovanja1 "+ vrijednostPakovanja1);
        }
        else{
            System.out.println("Pakovanje1 je isplativije od pakovanja2 "+ vrijednostPakovanja2);
        }
    }
}
