package com.example.demo;

public class MultiPly {

    public static double eight(int n){

        if (n % 2 == 0 ){
            System.out.println( n *8 );
            return n * 8;
        } else {
            System.out.println( n *9 );
            return n *9;
        }
    }

    public static void main(String[] args) {
        eight(8);
        eight(9);
    }
}
