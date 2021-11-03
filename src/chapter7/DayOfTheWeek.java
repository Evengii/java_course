package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] daysArray = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose a number which mean day number of the week:");
        int day = scanner.nextInt();
        getDay(day);
        scanner.close();
    }

    public static void getDay(int day) {
        if (day != 0 && day < 8) {
            System.out.println("You choose " + daysArray[day-1] + "!");
        } else {
            System.out.println("Day with the entered number doesn't exist.\nTry again");
            day = scanner.nextInt();
            getDay(day);
        }
    }
}
