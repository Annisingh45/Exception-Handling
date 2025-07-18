package com.bridgelabz;

import java.util.Scanner;

public class InsufficientFundsExceptionMainClass {
    static int balanced = 5000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount::");
        int amount = sc.nextInt();
        try {
            withdraw(amount);
            System.out.println("Withdrawal successfully!and your remaining balance is:" + balanced);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    private static void withdraw(int amount) {
        if (amount > balanced) {
            throw new InsufficientFundsException("You can't withdraw due to insufficient balance");
        }
        balanced = balanced - amount;
    }
}
