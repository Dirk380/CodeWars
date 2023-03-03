package com.example;

public class DrinkingWater {

    public static void waterDrink(double time){
        int liter = (int) (time * 0.5);
        System.out.println(liter);

    }

    public static void main(String[] args) {
        waterDrink(6.7);
    }
}
