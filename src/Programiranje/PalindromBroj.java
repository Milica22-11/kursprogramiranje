package Programiranje;

public class PalindromBroj {
    public static void main(String[] args) {
        System.out.println(Prime(7));
    }
    private static boolean Prime(int broj){
       boolean isValid = true;
       for (int i=2; i<broj; i++){
           if (broj%i == 0){
               isValid = false;
           }
       }
        return isValid;
    }
    public static boolean polindrom(int brojj){
        int palindrom =0;
        int orginalniBroj= brojj;
        while (brojj!=0){
            palindrom*=10;
            int poslednjaCifra= brojj%10;
            palindrom+=poslednjaCifra;
            brojj/=10;
        }
        System.out.println(palindrom);
        return palindrom==brojj;
    }



    }


