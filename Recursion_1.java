package com.company;

public class Recursion_1 {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello Recursion...");
        message1();
        // Now the condition is you have to print the "Hello Recursion..." for five times but
// do not copy the message five times and don't modify the function then what you do?
    }
    static void message1(){
        System.out.println("hello Recursion");
        message2();
    } static void message2(){
        System.out.println("hello Recursion");
        message3();
    } static void message3(){
        System.out.println("hello Recursion");
        message4();
    } static void message4(){
        System.out.println("hello Recursion");
    }

}


