package com.bridgelabz;

import java.util.Scanner;

public class NegativeNumberExceptionMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Do nothing");
        } else {
            try {
                throw new NegativeNumberException("You are suppose to enter only positive number!!!");

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
