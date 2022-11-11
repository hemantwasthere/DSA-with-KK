package com.hemant;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 233, 9, 1829};
        max(arr);
        maxRange(arr, 0, 3);
    }
    static void max(int[] arr){
        int max = 0;
        for (int i: arr) {
            if(i > max) max = i;
        }
        System.out.println("Maximum element is " + max);
    }

    static void maxRange(int[] arr, int start, int end){
        int max = 0;
        for (int i = start; i < end; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum element in given range is " + max);
    }

}
