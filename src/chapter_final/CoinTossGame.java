package chapter_final;

import java.util.Scanner;

public class CoinTossGame {

    private static Scanner scanner = new Scanner(System.in);

    private static Player playerOne = new Player("Evengii");
    private static Player playerTwo = new Player("Slava");

    public static void main(String[] args) {
        System.out.println("First player, choose 'heads' or 'tails':");
        String answer = scanner.next();
        assignGuesses(answer);
        var firstPlayerGuess = playerOne.getGuess();
        Coin.flip();
        var coinSide = Coin.getSide();
        determineWinner(firstPlayerGuess, coinSide);
    }

    private static void determineWinner(boolean firstPlayerGuess, boolean coinSide) {
        if(coinSide == firstPlayerGuess){
            System.out.println("First player " + playerOne.getName() + " WON!");
        } else
            System.out.println("Second player " + playerTwo.getName() + " WON!");
    }

    public static void assignGuesses(String answer){
        if(answer.equals("heads")){
            playerOne.setGuess(Coin.HEAD);
        } else if (answer.equals("tails")) {
            playerOne.setGuess(Coin.TAIL);
        } else {
            System.out.println("Try enter your choice again");
            scanner.next();
        }
        scanner.close();
    }
}
