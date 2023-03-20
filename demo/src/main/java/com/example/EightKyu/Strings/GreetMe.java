package com.example.EightKyu.Strings;

public class GreetMe {
    public static void greet (String name){



        System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(2).toLowerCase() +"!");
    }
    public static void main(String[] args) {
        greet("dirk");
    }
}
