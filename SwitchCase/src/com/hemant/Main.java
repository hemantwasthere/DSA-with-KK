package com.hemant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("pila fal");
//                break;
//            case "Apple":
//                System.out.println("seb");
//                break;
//            case "Guava":
//                System.out.println("amrud");
//                break;
//            case "Kiwi":
//                System.out.println("avacado ki dost");
//                break;
//            default:
//                System.out.println("Idk know about it :)");
//        }

        // Enhanced switch case statements
        switch (fruit) {
            case "Mango" -> System.out.println("pila fal");
            case "Apple" -> System.out.println("seb");
            case "Guava" -> System.out.println("amrud");
            case "Kiwi" -> System.out.println("avacado ki dost");
            default -> System.out.println("Idk know about it :)");
        }

        // code without some break statements
//        int day = 3;
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        // code without some break statements + Enhanced
        int day = 3;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}