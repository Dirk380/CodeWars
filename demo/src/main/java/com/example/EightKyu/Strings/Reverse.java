package com.example.EightKyu.Strings;

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
