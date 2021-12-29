package com.company;
// types of recurrence relation
// linear recurrence relation-- fibonacci
//divide and concurrence relation--binary search
public class Recursion_5 {
    public static void main(String[] args) {
        // Binary search problem by using Recursion...
        int []arr={53,53,43,534,634,534};
        int target=63;
        System.out.println("Index number of your given number is");
        System.out.println(search(arr , target, 0,arr.length-1));


    }
    static int search(int[]arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m= s+(e-s)/2;

        if (arr[m]==target){
            return m;
         }
        if (target<arr[m]){
           return search(arr, target, s, m-1);
        }

            return search(arr, target, m+1,e);
        }



    }

