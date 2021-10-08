import java.util.Scanner;

public class LOOPS {
    public static void main(String[]args) {
        System.out.println(" Loops in Java ");
 /*
 Loops: Loops are used to execute a set of statements repeatedly until a particular condition
 is satisfied.

 * Three types of loops :
 * 1.for loop
 * 2.while loop
 * 3.do-while loop
 *
 FOR LOOP --->
 for(statement1; statement2; statement3){
 //code block to be executed
 }
 Statement1:initialisation, executed once
 Statement2:condition, checked every time before the loop
 Statement3:reinitialisation, executed(every time) after the code block has been
 executed.
 * */

        System.out.println("printing 1 to 100 numbers");

        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }
        // printing even number from 1 to 100
        System.out.println("1 to 100 even numbers");
        for (int i = 2; i <= 100; i = i + 2) {

            System.out.println(i);
        }
        //printing odd number from 1 to 100
        System.out.println("1 to 100 odd numbers");
        for (int b = 1; b <= 100; b = b + 2) {

            System.out.println(b);
        }


        // sum of first 100 numbers
        System.out.println("sum of first 100 numbers is : ");
        int sumOfHundred = 0;
        int s = 100;
        for (int i = 1; i <= s; i++) {
            sumOfHundred = sumOfHundred + i;

        }
        System.out.println(sumOfHundred);

        // sum of first 50 numbers
        System.out.println("Sum of first 50 numbers is : ");
        int sumOfFifty = 0;
        int f = 50;
        for (int i = 1; i <= f; i++) {
            sumOfFifty = sumOfFifty + i;

        }
        System.out.println(sumOfFifty);

        // writing 1 to 100 number in reverse order
        System.out.println("Writing 1 to 100 numbers in reverse order: ");

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
        // writing a table of 4
        int tableOf = 4;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf * i);
        }
        // sum of first 5 numbers
        System.out.println(" sum of first five numbers is  ");
        int sum = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        //Q-  find the factorial of given number

        //**************************************WHILE LOOP **********************
        // FIRST PROGRAM SUM OF DIGITS









    }


}
