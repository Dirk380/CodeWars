package com.example.EightKyu.Integer;

public class QuarterOfYear {

    public static int quaterCount(int m){
        if (m <=3){
            System.out.println("1st quarter");
            return 1;
        } else if (m >4 && m <= 6 ) {
            System.out.println("Second quarter");
            return 2;
        } else if (m > 7 && m <= 9) {
            System.out.println("Thirt quarter");
            return 3;

        }else
            System.out.println("4th");
            return 4;
    }

    public static void main(String[] args) {
        int m = 11;
        quaterCount(m);

    }
}
