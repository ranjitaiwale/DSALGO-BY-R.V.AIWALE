package com.company;

public class Recursion_6 {
    public static void main(String[] args) {
      foo(5);
    }
    static void foo(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        foo(n-1);
    }
}
