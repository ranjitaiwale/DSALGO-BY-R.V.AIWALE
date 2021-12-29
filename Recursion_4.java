package com.company;

public class Recursion_4 {
    public static void main(String[] args) {
        // find the nth fibonacci number by using recursion

        System.out.println(fibonacci(4));

    }
    static int fibonacci(int n){
       if (n<2){
           return n;
       }
    return fibonacci(n-1)+fibonacci(n-2);
    }//***last function is called as the tail recursion...****
}
