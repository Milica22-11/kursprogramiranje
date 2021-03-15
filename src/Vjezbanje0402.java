import java.util.Scanner;

public class Vjezbanje0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pogodite koji je nasumican broj");
        int nasumicanBroj = (int) (Math.random() * 10) ;
        System.out.println("Nasumican broj " + nasumicanBroj);
        while (true) {
            int korisnikovPokusaj = scanner.nextInt();

            if (nasumicanBroj == korisnikovPokusaj) {
                System.out.println("Cestitam");
            } else if (nasumicanBroj > korisnikovPokusaj) {
                System.out.println("Pokusajte sa vecim brojem");
            } else {
                System.out.println("Pokusajte sa manjim brojem");
            }


        }
    }
}
