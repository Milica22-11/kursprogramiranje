package Programiranje;

public class IzbacivanjeBroja {
    public static void main(String[] args) {
        String ime = "Mili6ca";
        String cistoIme = izbac( ime,'6' );
        System.out.println(cistoIme);
    }

    public static String izbac (String str, char ch) {
        String rjesenje = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                rjesenje += str.charAt(i);
            }

        }

        return rjesenje;
    }


}