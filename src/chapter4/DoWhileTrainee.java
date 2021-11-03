package chapter4;

import java.util.Scanner;

public class DoWhileTrainee {
    public static void main(String[] args) {
        /**
         * 1. Enter 2 numbers
         * 2. Sum up these numbers
         * 3. Exit when special symbol will be entered.
         */
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter first number:");
            double first_number = scanner.nextDouble();
            System.out.println("Enter second number:");
            double second_number = scanner.nextDouble();

            double sum = first_number + second_number;
            System.out.println("Sum of entered numbers is " + sum);
            System.out.println("Would you like to start again?");
            again = scanner.nextBoolean();
        } while (again);
    }
}
