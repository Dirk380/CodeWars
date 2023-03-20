package com.example.EightKyu.Strings;

public class StringMultiplier {


    public static void stringMulti(int repeat, String str){
        for (int i=0; i<repeat; i++){
            System.out.print(str);
        }
    }
    public static void main(String[] args) {
    stringMulti(2, "Hello");
    }
}
