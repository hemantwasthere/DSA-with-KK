package com.hemant;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String department = sc.next();

        // Nested switch-case
//        switch (empId){
//            case 1:
//                System.out.println("Kunal Kushwaha with id 1");
//                break;
//            case 2:
//                System.out.println("Rahul Rana with id 2");
//                break;
//            case 3:
//                System.out.println("Employee with id 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("No department found");
//                }
//                break;
//            default:
//                System.out.println("No employee found with this id");
//        }

        // Nested Enhanced switch-case
        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha with id 1");
            case 2 -> System.out.println("Rahul Rana with id 2");
            case 3 -> {
                System.out.println("Employee with id 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("No employee found with this id");
        }

    }
}
