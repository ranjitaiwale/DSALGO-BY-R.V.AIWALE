package com.company;

public class Recursion_2 {
    public static void main(String[] args) {
        // write a function that takes a number and prints it.
        // prints 1,2,3,4,5
printNumber(1);
    }
    static void printNumber(int n){
        System.out.println(n);
        printNumber1(2);
    } static void printNumber1(int n){
        System.out.println(n);
        printNumber2(3);
    } static void printNumber2(int n){
        System.out.println(n);
        printNumber3(4);
    } static void printNumber3(int n){
        System.out.println(n);
        printNumber4(5);
    } static void printNumber4(int n){
        System.out.println(n);
/*
* in this code the one functions is calling the another function
* in all functions one thing is common -body and the definition of the function is same.
* doing the same thing just a name is different
*
*  1. the main function is called.
* note : while the functions not finished the executing it will remain in stack memory.
*when the function is staying in the stack means function call is currently in progress
* here what happening is
* when we call our main function printNumber() it staying at the stack memory
* then it calls the printNumber1() it also staying in stack memory and call another function
* which is printNumber2(); this is going on up to printNumber4() function.
* when it reaches at printNumber4() function when print4() work is done it leaves the stack memoery then
* printNumber3(), printNumber2(), printNUmber1()also leaves the stack and finally main function
* also leaves the stack means program is over
*
*
*
*
* now the main thing is when you say print the number for 10,000 thimes then you will write the methods
* for 10000 times no then
* here comes the Recursion
* Recursion means function calling itself.
*
*
*
*
*  */






    }
}
