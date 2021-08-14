public class operators_in_java {
    public static void main(String []args){
        //Operators in Java

//        int a = 34;
//        int b = 343;
//        System.out.println(a+b);
        int a = 23;
        int b = 45;
        System.out.println("Arithmatic operators in java are +, -, *, / , %");
        double c = (double)a/(double)b;
        System.out.println(c);

        //module operator
        System.out.println(a%b);
        //increment operator
        int d = b++;
        System.out.println(d);

        //*********************** Bitwise operator **************************
        System.out.println("Bitwise operator");
int q=34;
int r =32;
        System.out.println(q|r);

        int s=53;
        int t=55;
        System.out.println(s&t);

        int z = 59;
        int x = 66;
        System.out.println(z>>x);
    }
}
