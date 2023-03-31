package PracticeToday;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int studentCounter = 0; //by default, we will be dealing with the first student
        double score;
        double classAverage;
        double totalScore = 0; //intialize a variable that is subject to change constatntly.
        Scanner scanner = new Scanner(System.in);


        while(studentCounter < 10){
            studentCounter++;
            System.out.printf("Enter Stutdent %d's score: \n ", studentCounter);
            score = scanner.nextDouble();
            System.out.println("Total score is " + (totalScore += score));
        }
        classAverage = totalScore/10;
        System.out.println(classAverage);

    }
}
