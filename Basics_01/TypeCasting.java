

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextFloat(); --> this will give error
//        System.out.println(num);

        // this is typecasting
//        int num = (int) 34.32f;
//        System.out.println(num); // this will print only the integer part of it

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) a; // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 50; --> this will give error
//        a = a * 2; the size will exceeds the byte size limit

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/c;
//        System.out.println(d);

//        int number = 'E';
//        System.out.println(number); // --> this will print ascii value of 'F'

        // Java follows unicode principles
//        System.out.println("नमस्ते");
//        System.out.println("こんにちは");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
