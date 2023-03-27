package com.example.EightKyu.Strings;

public class RemoveChar {

    public static String removeExcla(String s){
        return s.replaceAll("!", "");
    }

    public static void main(String[] args) {
    String s = "Hello world!!";
    removeExcla(s);
    }
}
