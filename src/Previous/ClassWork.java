package Previous;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
       int number1, number2, number3;

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first number ");
       number1 = scanner.nextInt();

        System.out.println("Enter the second number ");
        number2 = scanner.nextInt();

        System.out.println("Enter the third number ");
        number3 = scanner.nextInt();

        //sum, avg, product, largest, smallest

        int sum = number1 + number2 + number3;
        int average = sum/3;
        int product = number1 * number2 * number3;

        /**
         * set firstnumber = smallest and largest
         * compare the remaining 2 integers, update smallest and largest accordingly
         */

        int small1 = Math.min(number1, number2);
        int finalSmall = Math.min(small1, number3);

        int max1 = Math.max(number1, number2);
        int finalMax = Math.max(max1, number3);

        int smallest = number1;
        int largest = number1;

        if (number2 > largest){
            largest = number2;
        }
        if (number3 > largest){
            largest = number3;
        }
        if (number2 < smallest){
            smallest = number2;
        }
        if (number3 < smallest){
            smallest = number3;
        }

        System.out.printf("Sum is %d\nAverage is %d\nProduct is %d\nSmallest is %d\nLargest is %d\n",
                sum, average, product, finalSmall, finalMax);
    }

}
