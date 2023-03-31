package Previous;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        double weightKg;
        double heightMetres;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg?");
        weightKg = input.nextDouble();

        System.out.println("Enter your height in metres?");
        heightMetres = input.nextDouble();

        double result = weightKg/Math.pow(heightMetres, 2);

        if (result < 18.5){
            System.out.println("Your BMI is " + result + ". You are underweight.");
        } else if (result >= 18.5 && result < 24.9){
            System.out.println("Your BMI is " + result + ". Your weight is normal.");
        } else if (result >= 25 && result < 30) {
            System.out.println("Your BMi is " + result + ". You are overweight.");
        } else {
            System.out.println("Your BMI is " + result + ". You can start eating healthy to have a normal weight.");
        }



        /**BMI Categories:
         Underweight = <18.5
         Normal weight = 18.5–24.9
         Overweight = 25–29.9
         Obesity = BMI of 30 or greater
         */
    }

}
