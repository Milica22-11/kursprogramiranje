package Programiranje;

public class BrojanjeSpecKaraltera {
    public static void main(String[] args) {
        String unosKorisnika = "Ana voli Milovana";
        int brojac = count(unosKorisnika,'a');
        System.out.println(brojac);

    }
    public static int count(String str, char a){
        int brojSlova = 0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==a){
                brojSlova++;
            }


        }

        return brojSlova;
    }
}
