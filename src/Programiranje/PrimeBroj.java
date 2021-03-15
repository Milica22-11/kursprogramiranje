package Programiranje;

public class PrimeBroj {
    public static void main(String[] args) {
       for (int i = 1; i<10000; i++){
           if(IsPrime(i)){
               System.out.println(i);
           }
       }

    }

    private static boolean IsPrime(int number) {
        boolean isvalid = true;
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                isvalid = false;
            }
        return isvalid;
    }


}

