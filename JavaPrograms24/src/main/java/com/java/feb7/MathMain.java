package com.java.feb7;

import java.util.Scanner;


import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathDAOImpl dao = new MathDAOImpl();
        int choice;

        do {
            System.out.println("Select which Operation want to perform : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performAddition(sc, dao);
                    break;
                case 2:
                    performSubtraction(sc, dao);
                    break;
                case 3:
                    performMultiplication(sc, dao);
                    break;
                case 4:
                    performDivision(sc, dao);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        } while (choice != 5);
        
        sc.close();
    }

    private static void performAddition(Scanner sc, MathDAOImpl dao) {
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("After adding two numbers : " + dao.add(a, b));
    }

    private static void performSubtraction(Scanner sc, MathDAOImpl dao) {
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("After subtracting two numbers : " + dao.subtract(a, b));
    }

    private static void performMultiplication(Scanner sc, MathDAOImpl dao) {
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("After multiplying two numbers : " + dao.multiply(a, b));
    }

    private static void performDivision(Scanner sc, MathDAOImpl dao) {
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("After dividing two numbers : " + dao.divide(a, b));
    }
}
