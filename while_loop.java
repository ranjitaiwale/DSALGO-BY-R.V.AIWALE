import java.util.Scanner;

public class while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int temp = p;
        int Sum = 0;
        while (temp>0){
            int lastDigit= temp%10;
            temp /= 10;
            Sum+= lastDigit;
        }
        System.out.println(Sum);

        System.out.println("Enter the number which you want to do number:");
        int q=sc.nextInt();
      int numberOfDigits= (int)Math.log10(q)+1;
        System.out.println(numberOfDigits);

        int number = 0;
        do {
            System.out.println(" number is "+ number);
        }while (number!=0);
    }
}
