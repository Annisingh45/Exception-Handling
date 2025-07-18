package com.bridgelabz;

public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int i = 50;
            System.out.println(50 / 0);
            System.out.println("1");
            System.out.println("2");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
