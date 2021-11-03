package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requiredYearWage = 30000;
        int requiredYears = 2;
        // 1. How mush is your year salary?
        System.out.println("How mush is your year salary?");
        Scanner scanner = new Scanner(System.in);
        int actualWage = scanner.nextInt();

        // 2. How long do you work in your company?
        System.out.println("How long do you work in your company?");
        double actualYears = scanner.nextInt();
        scanner.close();

        if(actualWage >= requiredYearWage){
            if(actualYears >= requiredYears){
                System.out.println("Congratulations! Your loan is approved!");
            } else
                System.out.println("You must have 2 years work in your company");
        } else
            System.out.println("Your loan is not approved :(");
    }
}
