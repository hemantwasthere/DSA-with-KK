

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        two_sum(num1, num2);
    }
        /*
         access_modifier return_type name() {
                // body
                return statement;
        }
         */
        static void two_sum(int num1, int num2){
        System.out.print("Sum is: " + (num1+num2));
    }
}