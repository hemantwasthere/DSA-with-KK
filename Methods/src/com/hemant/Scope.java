package com.hemant;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String name = "Kunal";
        // this is a block with block scope
        {
            // int a = 50; -> Variable 'a' is already defined on the outside scope
            a = 78; // updating or reassigns the original ref variable to some other value
            name = "Rahul";
            int c = 99;
            // values initialized in this block will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); -> Cannot resolve symbol 'c' cuz is
    }
    static void random(int marks){
//        System.out.println(a);
        int num = 67;
        System.out.println(num);
    }
}
