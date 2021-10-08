import java.util.Scanner;

public class Switch_Case {
    public static void main(String[]args){
        System.out.println("Enter your rating : ");
        Scanner dc = new Scanner(System.in);
        int rating = dc.nextInt();
        switch (rating){
            case 1:
            case 2:
                System.out.println("Bad review");
                break;
            case 3:
                System.out.println("Average review");
                break;
            case 4:
            case 5:
                System.out.println("Good review");
                break;
            default:
                System.out.println("no review found");
        }
//        System.out.println("switch Case Statement in Java");
//        System.out.println("Enter any day of week");
//        Scanner sc = new Scanner(System.in);
//        String dayOfWeek= sc.nextLine();
//
//          switch (dayOfWeek ){
//              case "Sunday":
//             System.out.println("I am on leave");
//             break;
//              case "Monday":
//                 System.out.println("I am in office");
//                 break;
//                 case "Tuesday":
//                 System.out.println("I am in Goa");
//                 break;
//                 case "Wednesday":
//                 System.out.println("I am in beach");
//                 break;
//                 case "Saturday":
//                 System.out.println("I am on holiday");
//                 break;
//              default:
//                  System.out.println("I don't know what you are trying to say !");

                  //Let us make one calculator by using switch cast statement
                  System.out.println("!!!!!!!!!Calculator by using switch case !!!!!!!!!!!!!!");
                  System.out.println("Enter Two numbers which you want to calculate : ");
                  Scanner sc = new Scanner(System.in);
                  int number1= sc.nextInt();
                  int number2= sc.nextInt();
                  System.out.println("What do you want to do ");
                  sc.nextLine();
                  char result = sc.nextLine().charAt(0);
                  int process = 0;


                  switch (result){
                      case '+':
                          process=number1+number2;
                          break;
                      case '-':
                          System.out.println("Subtraction of" + number1 + "and"+ number2+"is " );
                        process=(number1-number2);
                            break;
                          case '*':
                          System.out.println("multiplication of" + number1 + "and"+ number2+"is ");
                              process=(number1*number2);
                            break;
                          case '/':
                          System.out.println("division of" + number1 + "and"+ number2+"is ");
                             process=(number1/number2);
                        break;
                      default:{
                          System.out.println("Something went wrong");
                      }
                  }
        System.out.println(process);
          }

}