import java.util.Scanner;

public class JAVA_type_casting {
    public static void main(String[]args){


        /*
        * TYPE CASTING :  Type casting is when you assign a value of one primitive
        * data type to another type.
        * means byte to short , short to char, char to int, int to long ,long to float, etc.
        * *****we cannot typecast boolean************
        *
        *
        * */
        //.................... AUTOMATIC TYPE CASTING ............................
        byte x = 4;
        double y = x;
        System.out.println(y);

        //*********************manual type casting*******************
        double myDouble= 4.343;
        int myInt=(int)myDouble;
        System.out.println(myInt);
        System.out.println(myDouble);

        //**********************Taking User Input ***********************
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("you entered " + number);

        //***************simple interest calculator****************
        System.out.println("Enter the Value of principal : ");
        int principal = sc.nextInt();
        System.out.println("Enter the value of rate : ");
        float rate = sc.nextFloat();
        System.out.println("Enter the value of time : ");
        int time = sc.nextInt();
        System.out.println("simple interest = " + principal*rate*time/100);






    }
}
