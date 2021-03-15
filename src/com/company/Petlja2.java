package com.company;

public class Petlja2 {
    public static void main(String[] args) {
        int brojPismo = 0;
        int brojGlava = 0;
        for (int i = 1; i < 1000000; i++){
           double simulator = Math.random();
            if (simulator < 0.5){
                brojGlava++;
            }
            else {
                brojPismo++;
            }
        }
        System.out.println("Pao je na stranu Glava " + brojGlava);
        System.out.println("Pao je na stranu Pismo " + brojPismo) ;

    }
}
