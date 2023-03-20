package com.example.EightKyu;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MeanArray {

    // traditionele manier
//    public static int avgArray(int[] marks){
//        int avg = 0;
//        for (int a : marks){
//            avg += a;
//        }
//        return avg / marks.length;
//    }

    //streams manier
    public static int avgArray(int[] marks){
        System.out.println((IntStream.of(marks).sum())/marks.length);
        return (IntStream.of(marks).sum())/marks.length;
    }

    public static void main(String[] args) {
        int[] marks = { 1, 55, 3,4};
        avgArray(marks);
    }
}
