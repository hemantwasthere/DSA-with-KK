package com.hemant;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reverse the number
        int n = sc.nextInt();
        int inputedNumber = n;
        int reversedNo = 0;
        while(n > 0){
            int rem = n % 10;
            reversedNo = reversedNo * 10 + rem;
            n /= 10;
        }
        System.out.println("Reversed number of " + inputedNumber + " is " + reversedNo);
    }
}
