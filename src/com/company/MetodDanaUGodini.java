package com.company;

import java.util.Scanner;

public class MetodDanaUGodini {
    public static int izracunaj(int godina) {
        if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
            return 366;
        }
        return 365;
    }

}
