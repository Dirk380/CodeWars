package com.example.EightKyu.Arrays;

import java.util.Arrays;

public class CatDogYear {

    public static int[] yearCount(final int humanYears){
        int[] calc = new int[3];
        calc[0] = humanYears;
        if (humanYears <2){
            calc[1] = 15;
            calc[2] = 15;
        } else if (humanYears > 1 && humanYears <= 2) {
            calc[1] = 24;
            calc[2] = 24;
        } else {
            calc[1] = 24 +4 *(humanYears -2);
            calc[2] = 24 +5 *(humanYears -2);

        }
        System.out.println(calc[0]);
        System.out.println(calc[1]);
        System.out.println(calc[2]);
        return calc;
    }

    public static void main(String[] args) {
        int humanYears = 10;
        yearCount(humanYears);
    }
}
