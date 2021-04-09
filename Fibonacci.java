package com.company;

//Program takes user defined n and prints the nth fibonacci number.

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in integer number greater than 0.");
        int n = keyboard.nextInt();

        int f1 = 1;
        int f2 = 1;
        int fNew = f1 + f2;

        if (n == 1) {
            System.out.println("The " + n + "th number in the Fibonacci sequence is " + f1);
        } else if (n == 2) {
            System.out.println("The " + n + "th number in the Fibonacci sequence is " + f2);
        } else {
            for (int i = 4; i <= n; i++) {
                f2 = f1;
                f1 = fNew;
                fNew = f1 + f2;
            }
            System.out.println("The " + n + "th number in the Fibonacci sequence is " + fNew);
        }
    }
}
