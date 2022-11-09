package com.hemant;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth fibonacci number: ");
        int n = sc.nextInt();
        int prev = 0;
        int next = 1;
        int count = 2;

        // finding fibonacci number on nth position
        while(count <= n){
            int temp = next;
            next = next + prev;
            prev = temp;
            count++;
        }

        // printing fibonacci series till nth number
//        System.out.print(prev + " " + next);
//        for (int i = 2; i <= n; i++){
//            int temp = next + prev;
//            System.out.print(" " + temp);
//            prev = next;
//            next = temp;
//
//        }

        System.out.println(next);
    }
}
