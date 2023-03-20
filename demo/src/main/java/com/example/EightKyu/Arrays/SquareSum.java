package com.example.EightKyu.Arrays;

public class SquareSum {

    public static void square(int[] n){
        int result =0;
        for(int i : n){
            result += (i*i);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int [] n = {1, 2, 2};
        square(n);
    }
}
