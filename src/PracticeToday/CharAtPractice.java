package PracticeToday;

import java.util.Scanner;

public class CharAtPractice {
    public static void emailMethod(String email){
        String at = "@";
        int b = email.indexOf(at);
        System.out.println(email.substring(b+1));
        System.out.println(email.substring(0,email.length() - email.substring(b).length()));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        emailMethod(email);
    }
}
