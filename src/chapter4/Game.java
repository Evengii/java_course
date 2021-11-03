package chapter4;

import com.sun.nio.sctp.SctpChannel;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int win = 20;
        int rolls = 5;
        int score = 0;
        int diff = 0;

        System.out.println("Roll the die! Press 's'\nTo leave the game write 'exit'");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char s = str.charAt(0);
        for(int i = 0; i < rolls; i++){
            if(s == 's'){
                Random random = new Random();
                int die = random.nextInt(6) + 1;
                score = score + die;
                diff =  win - score;
                System.out.println("You've rolled a " + die +
                        ". You are now on space " + score + " and have " + diff + " more to go.");
                if(score == win){
                    System.out.println("You win");
                    break;
                }
            } else
                System.out.println("You entered not 's'. Try again;");
        }
        if (score > win || score < win){
            System.out.println("You lose");
        }
    }
}
