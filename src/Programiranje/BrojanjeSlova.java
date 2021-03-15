package Programiranje;

public class BrojanjeSlova {
    public static void main(String[] args) {

    String unosKorisnika = "Dobro dosli";
    int brojSlova = countLetters(unosKorisnika);
        System.out.println(brojSlova);
        System.out.println(countLetters(unosKorisnika));
    }

    public static int countLetters(String unosKorisnika) {
        int brojac =0;
        for (int i=0; i<unosKorisnika.length();i++){
            if (Character.isLetter(unosKorisnika.charAt(i))){
                brojac++;
            }
        }
return brojac;
    }

}
