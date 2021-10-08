public class Nested_if_else_statement_in_java {
    public static void main(String[] args) {
        System.out.println("Nested if else statements in java ");
        int a = 3432;
        int b = 3439;
        int c = 9877;
        int result = 0;
        //turnery operator
        result = a>b ? a>c ? a:c:b>c?b:c;

        //or

//        if (a > b) {
//            if (a > c) {
//                result = a;
//            } else {
//                result = c;
//            }
//        } else {
//            if (b > c) {
//                result = b;
//            } else {
//                result = c;
//            }
//        }

        System.out.println("largest of three numbers is "+ result);


    }
}