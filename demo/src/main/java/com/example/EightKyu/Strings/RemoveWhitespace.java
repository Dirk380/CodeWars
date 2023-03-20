package com.example.EightKyu.Strings;

public class RemoveWhitespace {

    public static String stringWithoutSpaces (final String x){
        StringBuilder str = new StringBuilder();
        for (int i=0; i<x.length();i++){
           if (x.charAt(i)!=' '){
               str.append(x.charAt(i));
           }
        }
       return str.toString();
    }

    public static void main(String[] args) {
        String x = "Dirk heeft Honger";
        stringWithoutSpaces(x);
    }
}
