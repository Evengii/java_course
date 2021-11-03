package chapter10;

public class FruitMarket {
    public static void main(String[] args) {
        Banana banana = new Banana(200);
        banana.makeJuice();
        banana.peel();

        Fruit apple = new Apple(150);
        apple.makeJuice();
        ((Apple) apple).removeSeeds();
    }
}
