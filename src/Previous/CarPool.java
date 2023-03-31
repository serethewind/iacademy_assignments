package Previous;

import java.util.Scanner;

public class CarPool {
    public static void main(String[] args) {
        double totalMiles; double costOfGallon; double averageMiles; double parkingFees; double tollsPerDay;
        Scanner input = new Scanner(System.in);
        System.out.printf("Kindly fill this form accordingly to know the cost of driving daily: \nTotal miles driven per day: ");
        totalMiles = input.nextDouble();

        System.out.printf("Cost per gallon of gasoline: ");
        costOfGallon = input.nextDouble();

        System.out.printf("Average miles per gallon: ");
        averageMiles = input.nextDouble();

        System.out.printf("Parking fees per day: ");
        parkingFees = input.nextDouble();

        System.out.printf("Tolls per day: ");
        tollsPerDay = input.nextDouble();


        double result = ((totalMiles/costOfGallon) * averageMiles) + parkingFees + tollsPerDay;
        System.out.printf("Your cost of driving is %.2f naira", result);

        /**
         * 1. Total miles driven per day.
         * 2. Cost per gallon of gasoline.
         * 3. Average miles per gallon.
         * 4. Parking fees per day.
         * 5. Tolls per day
         */
    }
}
