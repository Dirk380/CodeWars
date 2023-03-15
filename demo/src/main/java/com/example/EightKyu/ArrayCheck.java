package com.example.EightKyu;

import java.util.Arrays;

public class ArrayCheck {

    public static void checkArray(Object[] a, Object b) {
       for (Object x : a){
           if(b.equals(x)){
               System.out.println("true");
           }
       }

    }

    public static void main(String[] args) {
        Object[] a = {"Dirk", "Sohpie"};
        Object b = "Dirk";
        checkArray(a, b);
    }
}
