package com.example.EightKyu.Arrays;

import java.util.Arrays;


public class MoneyCounter {

    public static int sortArray(final int n ){
        int [] monkey = new int[n];
        System.out.println(Arrays.stream(monkey).sum());
        return Arrays.stream(monkey).sum();
    }

    public static void main(String[] args) {

        sortArray(6);
    }
}
