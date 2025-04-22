package com.pluralsight;
import java.util.Scanner;


public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] quotes = new String[10];

            quotes[0] = "Be yourself; everyone else is already taken.";
            quotes[1] = "Stay hungry, stay foolish.";
            quotes[2] = "What we think, we become.";
            quotes[3] = "Dream big. Start small.";
            quotes[4] = "Turn wounds into wisdom.";
            quotes[5] = "Silence is a source of great strength.";
            quotes[6] = "Create your own sunshine.";
            quotes[7] = "Success is never accidental.";
            quotes[8] = "Less talk, more do.";
            quotes[9] = "Fear is temporary. Regret is forever.";

            System.out.println("Pick a number 1-10: ");
            int choice = scanner.nextInt();
            --choice;

            System.out.println(quotes[choice]);

        } catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }


    }
}
