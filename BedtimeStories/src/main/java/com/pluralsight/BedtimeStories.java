package com.pluralsight;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] poems = {"goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb.txt"};
        System.out.println("Which poem would you like? (1/2/3)\n" + Arrays.toString(poems));
        int choice = scanner.nextInt();
        scanner.nextLine();
        --choice;

        try {

            FileInputStream fis = new FileInputStream(poems[choice]);
            Scanner fileScanner = new Scanner(fis);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}