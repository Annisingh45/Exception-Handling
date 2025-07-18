package com.bridgelabz;

import java.util.Scanner;

public class PerformArithmeticException {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divisor:");
        int divisor=sc.nextInt();

        System.out.println("Enter the dividend :");
        int dividend= sc.nextInt();

       int quotient= performDivide(divisor, dividend);
        System.out.println("Quotient:"+quotient);
    }

    private static int performDivide(int divisor, int dividend) {
        int quotient=0;
        try {
            quotient=  dividend /divisor ;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        return quotient;
    }
}*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to divide 100 by:");
        int inputNumber = sc.nextInt();

        int quotient = performDivide(100, inputNumber);
        System.out.println("Quotient: " + quotient);
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