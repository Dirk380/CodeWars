package com.example.EightKyu;

public class DeviseByXandN {

    public static void devise(long n, long x, long y) {
        boolean result = n % x == 0 && n % y == 0;
        System.out.println(result);
    }
    public static void main(String[] args) {
        devise(3, 3, 4);
    }
}
