

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // largest among 3 numbers
        Scanner sc = new Scanner(System.in);

        // first method of doing this
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a + " is the greatest");
//            } else {
//                System.out.println(c + " is the greatest");
//            }
//        } else {
//            if (b > c) {
//                System.out.println(b + " is the greatest");
//            } else {
//                System.out.println(c + " is the greatest");
//            }
//        }

        // second method of doing this
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max + " is the greatest");


        // third method of doing this
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            int input = sc.nextInt();
            if (input > max) {
                max = input;
            }
        }
        System.out.println(max + " is the greatest");
    }
}
