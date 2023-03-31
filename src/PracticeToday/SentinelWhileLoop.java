package PracticeToday;

import java.util.Scanner;

public class SentinelWhileLoop {
    public static void main(String[] args) {
        /**
         * Create and initialize necessary vars - score, studentCounter, totalScore, afverage, flagvalue
         */

        int score;
        int totalScore = 0;
        int studentCounter = 0;
        double average;
        int flagValue = -1;


        Scanner scanner = new Scanner(System.in);
        studentCounter++;
        System.out.printf("Enter score %d\n", studentCounter);
        score = scanner.nextInt();
        totalScore = totalScore + score;

        while (score != flagValue){
//            ++studentCounter;
//            totalScore = totalScore + score;
//            System.out.printf("Enter score %d\n", studentCounter);
            studentCounter++;
            System.out.printf("Enter score %d\n", studentCounter);
            score = scanner.nextInt();
            totalScore = totalScore + score;
//            System.out.println("Total score is " + totalScore);
        }

        if (studentCounter != 0){
            average = (double) totalScore / studentCounter;
            System.out.printf("Total number of students is %d\n. Total score is %d\n. Average score is %.2f\n", studentCounter, totalScore, average);
        } else {
            System.out.println("No grades were entered!");
        }

    }
}
