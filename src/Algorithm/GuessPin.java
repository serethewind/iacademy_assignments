package Algorithm;

import java.util.Scanner;

public class GuessPin {
    /**
     *Write a method that allows a user to guess the correct pin of an account. When the Pin is correct, display "Correct, welcome back."
     * When incorrect, display "incorrect, try again." When you've run out of attempts, display "sorry, but we've locked you out".
     *
     */

    public static String guessCorrectPin(){
        Scanner scanner = new Scanner(System.in);
        int attemptsCount = 0;
        int numberOfAttempts = 3;
        int correctPin = 4;
        String output = "";

        while (attemptsCount < numberOfAttempts){
            System.out.println("Guess, the correct Pin between digits 1 - 5 : ");
            int userInput = scanner.nextInt();

            if (userInput == correctPin){
                output = "Correct, welcome back.";
            } else {
                output = "incorrect, try again.";
                attemptsCount++;
            }

        }

        output = "sorry, but we've locked you out";
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        guessCorrectPin();
    }
}
