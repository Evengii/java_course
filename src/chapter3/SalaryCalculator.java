package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int sales_quantity = 10;
        int bonus = 250;

        System.out.println("How many sales do you have?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        if(sales >= sales_quantity){
            salary = salary + bonus;
            System.out.println("You earned + " + bonus+ "$ bonus!\nTotal week salary is " + salary + "$");
        } else {
            System.out.println("You earned " + salary + "$");
        }
    }
}
