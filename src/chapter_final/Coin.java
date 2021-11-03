package chapter_final;

import java.util.Random;

public class Coin {

    protected static final boolean HEAD = true;
    protected static final boolean TAIL = false;

    private static boolean side;

    public static boolean getSide() {
        return side;
    }

    public static void setSide(boolean side) {
        Coin.side = side;
    }

    public static boolean flip(){
        Random random = new Random();
        if(random.nextInt(2) == 0){
            side = false;
        } else
            side = true;
        return side;
    }
}
