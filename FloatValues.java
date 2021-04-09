package com.company;

//Program reads in a set of floating point values and returns average, minimum, maximum and range.

import java.util.Scanner;

public class FloatValues {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in float values then enter a negative number when you are done.");
        double next = keyboard.nextDouble();

        double sum = 0;
        int averageCount = 0;
        double max = next;
        double min = max;

        while (next >= 0) {

            sum = sum + next;
            averageCount++;

            if (next > max) {
                max = next;
            } else if (next < min) {
                min = next;
            }

            next = keyboard.nextDouble();
        }

        double average = sum / averageCount;
        double range = max - min;

        System.out.println("The average is " + average);
        System.out.println("The smallest value is " + min);
        System.out.println("The largest value is " + max);
        System.out.println("The range is " + range);
    }
}
