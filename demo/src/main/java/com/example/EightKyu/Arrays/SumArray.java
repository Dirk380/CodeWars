package com.example.EightKyu.Arrays;

import java.util.Arrays;

public class SumArray {

    public static double sumArr (double[] numbers){
        System.out.println(Arrays.stream(numbers).sum());
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        double[] numbers = {-2.9};
        sumArr(numbers);
    }
}
