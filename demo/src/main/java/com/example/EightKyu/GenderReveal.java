package com.example.EightKyu;

public class GenderReveal {

    public static String Reveal(String sperm) {
        if (sperm.equals("XY")) {
            System.out.println("Congratulations! You're going to have a son.");
            return "Congratulations! You're going to have a son.";
        } else if (sperm.equals("XX")) {
            return "Congratulations! You're going to have a daughter.";
        } else {
           return "There is something wrong";
        }
          }

    public static void main(String[] args) {
    Reveal("XX");
    Reveal("XY");
    Reveal("XYS");
    }
}
