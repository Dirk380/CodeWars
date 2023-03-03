package com.example;

public class SheepCounter {
    static Boolean[] arrayOfSheeps = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};


    // loop through arrayOfSheeps and when true counter ++;
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter++;
            }


        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        countSheeps(arrayOfSheeps);
    }
}

