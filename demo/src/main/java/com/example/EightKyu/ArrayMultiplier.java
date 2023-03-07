package com.example.EightKyu;

import java.util.Arrays;

public class ArrayMultiplier {


    public static void multiplier(int[] array){
        int result =0;
        for (int i : array){
            result = i ;

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
       int[] array = { 1, 2, 3,4};
        multiplier(array);
    }
}
