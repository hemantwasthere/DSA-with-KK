package com.hemant;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];

        // inputs using for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter the value of " + i + " index of array: ");
//            arr[i] = in.nextInt();
//        }
        // printing array as a string - simple and best
//        System.out.println(Arrays.toString(arr));

        // printing array using for loops
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // printing array using enhanced for loop (foreach loop)
//        for (int i : arr) { // for every element in array, print the element
//            System.out.print(i + " "); // here "i" represents element of the array
//        }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the value of " + i + " index of array: ");
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
