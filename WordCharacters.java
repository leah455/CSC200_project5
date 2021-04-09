package com.company;

//Program reads word and prints each character on separate line.

import java.util.Scanner;

public class WordCharacters {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in word.");
        String word = keyboard.nextLine();

        int length = word.length();

        for (int i = 0; i < length; i++) {

            System.out.println(word.charAt(i));

        }
    }
}
