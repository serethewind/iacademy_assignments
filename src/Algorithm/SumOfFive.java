package Algorithm;

import java.util.Scanner;

public class SumOfFive {
    /**
     * 2. Write a method that accepts 5 integers from a user and sums them.
     *
     * create a method called fillArray which will create Array and fill it with the user input
     * loop through the array. at each turn, make the member of the array accept the user's input via scanner
     * create a method that takes in the already filled array from the previous method and sums up this array
     */

    public static void fillingArray(int[] n){
//        n = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers :");

        for(int i = 0; i < n.length; i++){
            n[i] = scanner.nextInt(); //user can now input five values into the array called n
        }
    }

    public static int sumArray(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }

    //vs
    public static int combinedMethod(int number){ //number specifies the amount of numbers to be found inside the array
        int[] n = new int[number];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %d numbers :\n", number);
        for(int i = 0; i < n.length; i++){
            n[i] = scanner.nextInt();
            sum += n[i];//user can now input five values into the array called n and can find the sum of the values
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] n = new int[5];
        fillingArray(n);
        System.out.println(sumArray(n));
        //System.out.println(combinedMethod(2));

}
}
