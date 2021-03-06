package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int cups = scanner.nextInt();

        int minAmountOfCups = Math.min(Math.min(water / 200, milk / 50), beans / 15);

        if (minAmountOfCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minAmountOfCups > cups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", minAmountOfCups - cups);
        } else if (minAmountOfCups < cups) {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", minAmountOfCups);
        }
    }
}
