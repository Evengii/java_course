package chapter6;

import java.util.Scanner;

public class CreateItemizedPhoneBill {
    public static void main(String[] args) {
        // 1. Get ID, cost, allotted, used
        // 2. Create an object by these data
        // 3. Call the methods
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID:");
        int ID = scanner.nextInt();
        System.out.println("Enter your plan:");
        double base_cost = scanner.nextDouble();
        System.out.println("Enter number of allotted minutes:");
        int allotted_minutes = scanner.nextInt();
        System.out.println("Enter number of used minutes:");
        int used_minutes = scanner.nextInt();

        PhoneBill phoneBill = new PhoneBill(ID,base_cost,allotted_minutes,used_minutes);
        double overage = phoneBill.calcOverage();
        double taxes = phoneBill.calcTaxes();
        double total = phoneBill.calcTotal(overage,taxes,base_cost);

        System.out.println("Phone bill statement:");
        System.out.println("Plan: $" + base_cost + "\nOverage: $" + overage + "\nTax: $" + taxes + "\nTotal: $" + total);
    }
}
