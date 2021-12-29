package com.company;

public class Recursion_3 {
    public static void main(String[] args) {
num(1);
    }

    static void num(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        num(n+1);
    }//Recursion means function which calling itself is calling recursion.
    // base condition:
    // base condition is the condition where our recursion stops making new calls.
    // When do not apply the base condition in that case our calls are going on and the one point is come
    // where our memory if full  it overflows called as stackoverflow.
    // space complexity is not constant because fo the recursive calls.

}
