package chapter5;

import java.util.Scanner;

public class PhoneBill {
    static double charge = 0.25;
    static int tax = 15;
    public static void main(String[] args) {
        // 1. Get plan fee
        System.out.println("Enter plan fee:");
        Scanner scanner = new Scanner(System.in);
        double plan_fee = scanner.nextDouble();
        // 2. Get number of overage minutes
        System.out.println("Enter number of overage minutes:");
        int num_of_minutes = scanner.nextInt();
        scanner.close();
        // 3. Calculate overage
        double overage = calcOverage(num_of_minutes, charge);
        // 4. Calculate taxes
        double taxes = calcTaxes(plan_fee, tax);
        // 5. Calculate total
        double total = calcTotal(overage, taxes, plan_fee);
        System.out.println("Phone bill statement:");
        System.out.println("Plan: $" + plan_fee + "\nOverage: $" + overage + "\nTax: $" + taxes + "\nTotal: $" + total);
    }

    public static double calcOverage(int num_of_minutes, double charge){
        double overage = num_of_minutes*charge;
        return overage;
    }

    public static double calcTaxes(double plan_fee, int tax){
        double taxes = plan_fee*tax*0.01;
        return taxes;
    }

    public static double calcTotal(double overage, double taxes, double plan_fee){
        double total = overage + taxes + plan_fee;
        return total;
    }
}
