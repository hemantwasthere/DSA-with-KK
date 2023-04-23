package com.hemant;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        int[][] arr2D = new int[3][3]; // specifying no. of cols is not mandotory but specifying no of rows are mandotory

//        int[][] arr2D2 = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9},
//        };


        // inputing elements in 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }

        // printing the 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop printing the 2D array
        for (int[] ints : arr2D) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        // simple way of printing 2d array :)
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }




    }
}
