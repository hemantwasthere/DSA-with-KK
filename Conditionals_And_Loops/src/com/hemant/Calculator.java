package com.hemant;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.println("Press 'x' or 'X' to exit");
            System.out.print("Enter the operator: ");
            char op = sc.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Your ans is " + ans);
            } else if (op == 'x' || op == 'X') break;
            else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}
