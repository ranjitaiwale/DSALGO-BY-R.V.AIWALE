public class Nested_for_loops {
    public static void main(String[]args) {


        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i);
            }
        }
        for (int j = 1; j <= 5; j++) {
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 20; i = i + 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        int n = 1;
        for (int j=1; n<=20; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(n * i + " ");
            }
            System.out.println("");
        }

        System.out.println("Hurray !");
    }

}
