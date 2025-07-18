package com.bridgelabz;

import java.util.Scanner;

public class ImplementFinallyBlock
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("Enter an integer to divide 100 by: ");
            int input = scanner.nextInt();
            int result = 100 / input;
            System.out.println("Result: 100 / " + input + " = " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally
        {
            System.out.println("Division operation is complete.");
            scanner.close();
        }
    }
}