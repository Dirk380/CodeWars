package com.example.EightKyu;

public class ReverseString {
    public static void solution(String str){
       String newString="";
        for(int i = str.length() -1; i>=0; i--){
            newString += str.charAt(i);
       }
        System.out.println(newString);
    }


    public static void main(String[] args) {
        solution("Dirk");
    }
}
