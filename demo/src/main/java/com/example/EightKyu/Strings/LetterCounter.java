package com.example.EightKyu.Strings;

public class LetterCounter {

    public static int countLetter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        countLetter("Hello", 'l');
    }
}
