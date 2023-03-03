package com.example;

public class StringEndsWith {
    public static boolean end(String str, String end){
        boolean awnser = false;
        if(str.contains(end)){
            System.out.println("true");
        }


        return awnser;
    }

    public static void main(String[] args) {
        end("abc", "bc");
    }

}
