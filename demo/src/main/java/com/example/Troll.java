package com.example;

public class Troll {

    public static void disemvowel(String str) {

        //This is setting up something to add to and return.
        String output = "";

        //This iterates (steps through) the string.
        for(int i = 0; i < str.length(); i++) {

            //! means not in Java, so it checks if our current letter is not a vowel, or is a consonant.
            if(str.charAt(i) != 'a' && str.charAt(i) != 'b') {

                //Here, we add the consonant to the string we will output.
                output = output + str.charAt(i);
            }
        }

        //We give the output back after running through the program (The original sentence, just without vowels)
        System.out.println(output);


    }

    public static void main(String[] args) {
        disemvowel("AAAAbbb");
    }
}