package com.example.EightKyu;

public class Reverse {

    public static void stringBuild(String str){
        StringBuilder sb =  new StringBuilder(str);
        sb.reverse();

        System.out.println(sb);
    }

    public static void main(String[] args) {
        stringBuild("Dirk");
    }
}
