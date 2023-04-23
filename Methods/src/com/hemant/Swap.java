package com.hemant;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.print("Before swap: ");
        System.out.println(a + " " + b);
        swap(a, b); // value of a & b not going to swap cuz of pass by value not by ref
        System.out.print("After swap: ");
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // this will only be valid in this function only!
    }
}
