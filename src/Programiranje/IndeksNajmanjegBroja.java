package Programiranje;

import java.util.Scanner;

public class IndeksNajmanjegBroja {
    public static void main(String[] args) {

        int [] niz = {1,2,4,5,6,7,-6,4,0};
        System.out.println(indexNajmanjegElemnta(niz));

    }
    public static int indexNajmanjegElemnta(int[]array){
        int najmanjiElemnt = array[0];
        int index = 0;
        for (int i =0; i<array.length;i++){
            if (array[i]<najmanjiElemnt){
                najmanjiElemnt=array[i];
                index=i;

            }


        }

        return index;

    }


}
