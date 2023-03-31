package Previous;

import java.util.Scanner;

public class OddTest {
    public static void main(String[] args) {
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        input = scanner.nextInt();

        if (input % 2 == 1){
            System.out.println("You entered " + input + ". It is an odd number.");
        } else {
            System.out.println("You entered " + input + ". It is an even number.");
        }

    }
}
