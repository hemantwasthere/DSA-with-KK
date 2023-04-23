package com.hemant;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // count the occurence of 3 in a user input number
        int n = sc.nextInt();
        int inputedNumber = n;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if ( rem == 3) count++;
            n /= 10;
        }
        System.out.println("The occurence of 3 in " + inputedNumber + " is " + count);
    }
}
