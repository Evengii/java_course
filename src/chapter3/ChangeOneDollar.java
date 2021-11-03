package chapter3;

import java.util.Scanner;

public class ChangeOneDollar {
    public static void main(String[] args) {
        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int win = 100; // 100 cents = 1 dollar

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int pennyQuantity = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int nickelQuantity = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimeQuantity = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quarterQuantity = scanner.nextInt();
        scanner.close();

        int total = penny*pennyQuantity + nickel*nickelQuantity +
                dime*dimeQuantity + quarter*quarterQuantity;

        if(total == win){
            System.out.println("YOU WIN!!!");
        } else if (total > win){
            int difference = total - win;
            System.out.println("Try again. You went over " + difference + " cents");
        } else {
            int difference = win - total;
            System.out.println("Try again. You went under " + difference + " cents");
        }
        System.out.println("You have:\n" + pennyQuantity + " pennies\n" +
                    nickelQuantity + " nickels\n" + dimeQuantity + " dimes\n" + quarterQuantity + " quarters");

    }
}
