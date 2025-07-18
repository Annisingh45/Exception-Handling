package com.bridgelabz;

import java.util.Scanner;

public class PerformArithmeticException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();

        System.out.println("Enter the dividend:");
        int dividend = sc.nextInt();

        int result = performDivide(dividend, divisor);
        System.out.println("Result: " + result);
    }

    private static int performDivide(int dividend, int divisor) {
        int quotient = 0;
        try {
            quotient = dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        return quotient;
    }
}
