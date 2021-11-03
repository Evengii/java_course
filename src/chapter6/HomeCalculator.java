package chapter6;

import java.util.Scanner;
public class HomeCalculator {
    public static void main(String[] args) {
        // 1. Ask about parameters
        // 2. Call Rectangle methods
        System.out.println("Enter length and width of 1st room:");
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Length:");
        rectangle.setLength(scanner.nextDouble());
        System.out.println("Width:");
        rectangle.setWidth(scanner.nextDouble());
        double length = rectangle.getLength();
        double width = rectangle.getWidth();
        scanner.close();

        System.out.println("Perimeter: " + rectangle.perimeter(length, width) +
                "\nArea: " + rectangle.area(length, width));
    }
}
