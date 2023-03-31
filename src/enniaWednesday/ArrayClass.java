package enniaWednesday;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        //creating an array
        String[] nameOfStudents = {"tobi", "oyin", "sarah", "noah", "chidinma", "moses", "deolu", "pelumi", "kenny", "ridoh", "joy"};
        System.out.println(nameOfStudents.length);

//        nameOfStudents = {"tobi", "oyin", "sarah", "noah", "chidinma", "moses", "deolu", "pelumi", "kenny", "ridoh", "joy"};

        int[] numberArray = new int[4];
        numberArray = new int[]{1, 2, 3, 4}; //creating an array of int
        System.out.println(nameOfStudents[4]); //accessing an array
        System.out.println(Arrays.toString(nameOfStudents)); //printing th whole array

//        looping through an array
        for (int i = 0; i < nameOfStudents.length; i++){
            System.out.print(nameOfStudents[i] + ", ");
        }
    }
}
