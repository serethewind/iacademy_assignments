package PracticeToday;

import java.util.Scanner;

public class Sequential {
    public static void main(String[] args) {
        int score;
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        System.out.println("Enter Student's Score: ");
        if (score >= 80){
            System.out.println("A");
        } else if (score >= 70 ) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
