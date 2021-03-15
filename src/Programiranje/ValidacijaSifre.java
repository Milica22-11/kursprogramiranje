package Programiranje;

public class ValidacijaSifre {
    public static boolean validiraj(String pass){
        final int MINKARAKTERA = 9;
        final int MINSIFRI = 2;
        if (pass.length()< MINKARAKTERA){

            System.out.println("Invalid pass, nema dovoljno karaktera");
            return  false;
        }
        for (int i=0; i<pass.length(); i++){
            char karakter = pass.charAt(i);
            if (!Character.isLetterOrDigit(karakter)){
                System.out.println("Invalid sigra, sadrzi specificne karaktere");
               return false;
            }


        }
        return true;

    }
}
