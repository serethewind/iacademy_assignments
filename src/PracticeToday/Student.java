package PracticeToday;

import java.util.Scanner;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average >= 0 && average <= 100) {
            this.average = average;
        } else {
            System.out.println("Your average is out of range.");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        if (average >= 0 && average <= 100) {
            this.average = average;
        } else {
            System.out.println("Your average is out of range.");
        }
//        this.average = average;
    }

    public static String displayGrade(){
        String grade="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score : ");
        int score = scanner.nextInt();

        switch(score/10){
            case 9, 8, 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            default:
                grade = "F";
        }
        System.out.println(grade);
        return grade;

    }
    public String getLetterGrade() {
        String grade;
        if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);
        return grade; //return statement is always the last statement.
    }

    public static void main(String[] args) {
//        Student student = new Student("Noah", 78.9);
//        student.getLetterGrade();
        displayGrade();
    }
}
