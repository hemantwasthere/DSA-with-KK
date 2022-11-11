package com.hemant;

public class MethodOverloading {
    public static void main(String[] args) {
        // two or more methods with same name but diff args is knows as method overloading - it happens at compile time
        fun(48);
        fun("Rahul");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
