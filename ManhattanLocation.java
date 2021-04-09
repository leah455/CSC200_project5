package com.company;

//Program randomly picks direction to walk in until it has moves 100 miles.

import java.util.Random;

public class ManhattanLocation {

    public static void main(String[] args) {

        int xCoordinate = 0;
        int yCoordinate = 0;

        Random randomGenerate = new Random();

        for (int i = 1; i <= 100; i++) {

            int nextDirection = randomGenerate.nextInt(3) + 1;

            if (nextDirection == 0) {
                yCoordinate += 1; //move up
            } else if (nextDirection == 1) {
                yCoordinate -= 1; //move down
            } else if (nextDirection == 2) {
                xCoordinate += 1; //move right
            } else {
                xCoordinate -= 1; //move left
            }
        }
        System.out.println("After 100 miles you are at location (" + xCoordinate + "," + yCoordinate + ").");
    }
}
