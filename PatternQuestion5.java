package com.company;

public class PatternQuestion5 {
    public static void main(String[] args) {
        //inverted half pyramid(rotated by 180 degree)
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
