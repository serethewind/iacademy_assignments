package Algorithm;

import java.util.Scanner;

public class Factorial {

    /**
     * 5! = 5 * 4 * 3 * 2 * 1;
     *
     * For a given integer n say 5, (scanner will allow user to input number)
     * Implement method to generate an Array i.e 5, 4, 3, 2, 1
     * Implement second method that takes the array from the previous method as an argument
     * This second method will loop through the array and find the product of each number
     * print product
     */
    public static int[] generateFactorial() {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        int[] array = new int[n]; //to create an empty array of the number the user passed in
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int productOfArray(int[] arr) {
        int productArray = 1;
        for (int i = 0; i < arr.length; i++) {
            productArray *= arr[i];
        }
        return productArray;
    }

    public static void main(String[] args) {
        System.out.println(productOfArray(generateFactorial()));
    }
}