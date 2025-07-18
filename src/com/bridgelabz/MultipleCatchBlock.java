package com.bridgelabz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        performDivide(num1);
    }

    public static void performDivide(int num1) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            int result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("you can't divide a number with zero,got it or not");
        } catch (InputMismatchException e) {
            System.out.println("Input a valid integer value:");
        }
    }
}
    

