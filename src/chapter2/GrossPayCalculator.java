package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String args[]){
        // 1. Select your favorite season of the year
        System.out.println("Select your favorite season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Select any whole number
        System.out.println("Select any whole number:");
        int whole_number = scanner.nextInt();

        // 3. Write any adjective
        System.out.println("Write any adjective:");
        String any_adjective = scanner.next();

        scanner.close();

        // 4. Display result
        System.out.println("On a " + any_adjective + " "  + season + " day, I drink a minimum of " + whole_number + " cups of coffee.");
    }
}