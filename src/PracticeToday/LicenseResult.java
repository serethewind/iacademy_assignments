package PracticeToday;

import java.util.Scanner;

public class LicenseResult {
    public static void main(String[] args) {
        int studentCounter = 0;
        int studentsThatPassed = 0;
        int studentsThatFailed = 0;

        /**
         * 1 is passed, 2 is failed
         */
        while(studentCounter < 10){
            studentCounter++; //to begin with the first student
            System.out.printf("Enter result for student %d: ", studentCounter);
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            if (userInput == 1){
                studentsThatPassed++;
//                System.out.printf("Student Passed\n %d student passed\n", studentsThatPassed);
            } else if (userInput == 2){
                studentsThatFailed++;
//                System.out.printf("Student failed\n %d student failed\n", studentsThatFailed);
            } else {
                System.out.println("Enter valid input");

            }
        } //end of while loop

            System.out.printf("The total number of students that passed is %d.\n The total number of students that failed is %d.\n ",  studentsThatPassed, studentsThatFailed);
            if (studentsThatPassed > 8){
                System.out.println("Bonus to instructor.");
            }
    }
}
