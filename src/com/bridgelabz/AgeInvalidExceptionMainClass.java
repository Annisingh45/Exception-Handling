package com.bridgelabz;

import java.util.Scanner;

public class AgeInvalidExceptionMainClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age > 18)
        {
            System.out.println("Yeah you can vote!");
        } else
        {
            try
            {
                throw new AgeInvalidException("You are not eligible to vote yet!!");
            }
            catch (AgeInvalidException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
