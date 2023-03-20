package com.example.EightKyu.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AvgArray {

    public static double avgArr(int[] array){
        System.out.println(Arrays.stream(array).sum()/array.length);
        double result =(double) Arrays.stream(array).sum()/array.length;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
    int [] array = { 1,1,1};
        avgArr(array);
    }
}
