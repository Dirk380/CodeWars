package com.example.EightKyu.Arrays;

import java.util.Arrays;

public class LostWithoutMap {

//    public static int[] map(int[] arr) {
//        int[] newArr = new int[arr.length];
//        for (int a=0; a < arr.length; a++) {
//            newArr[a] = arr[a] *2;
//        }
//            return newArr;
//    }
public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(i -> i *2).toArray();
}

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,4};
        map(arr);
    }
}
