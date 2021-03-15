package Programiranje;

public class ProsjekNizaBrojeva {
    public static void main(String[] args) {

        double[] niz = {1.15, 2.30, 4.15};
        System.out.println(averge(niz));

    }

    public static int averge(int[] niz) {
        int suma = 0;
        int brojelemenata = niz.length;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        int prosjek = suma / brojelemenata;
        return prosjek;

    }

    public static double averge(double[] array) {
        double suma = 0;
        double brojelemenata = array.length;
        for (int i = 0; i < brojelemenata; i++) {
            suma += array[i];

        }
        double prosjek = suma / brojelemenata;
        return prosjek;
    }
}
