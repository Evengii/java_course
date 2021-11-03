package chapter7;

import java.util.Random;

/**
 * We have numbers and we want to check for duplicates.
 * After that to find entered number in the array.
 * 1. Create method for checking duplicates
 * 2. Create method for searching
 */
public class Lottery {
    private static final int LENGTH = 15;
    private static final int RANGE = 69;
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        showResult(numbers);
    }

    private static int[] getNumbers() {
        int[] numbers = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++){
            numbers[i] = random.nextInt(RANGE);
        }
        return numbers;
    }

    private static void showResult(int[] numbers) {
        System.out.println("Ticket: ");
        for(int i = 0; i < LENGTH; i++){
            System.out.print(numbers[i] + " | ");
        }

    }
}
