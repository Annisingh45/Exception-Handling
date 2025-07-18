package com.bridgelabz;

import java.util.Scanner;

public class ExceptionHierarchy {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //ArithmeticException
        try{
            System.out.println("Enter first number:");
            int n1=sc.nextInt();
            System.out.println("Enter second number:");
            int n2= sc.nextInt();
            int result=n1/n2;

        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
