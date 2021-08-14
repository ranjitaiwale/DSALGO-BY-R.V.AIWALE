public class logical_operator {
    public static void main(String[]args){
        // logical and (&&)
        int number =34;
        if(number>=1 && number<=100){
            System.out.println("number is in the range");

            //logical or (||)
            int grade =10;
            if (grade==10 || grade==12){
                System.out.println("You can give the exam");

                // logical not (!)
                int num = 33;
                if (!(num == 10 || num ==22)){
                    System.out.println("Your input number is correct.");
                }




            }
        }
    }
}