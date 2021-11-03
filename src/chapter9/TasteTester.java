package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        WeddingCake weddingCake = new WeddingCake("vanilla", 5);
        BirthdayCake birthdayCake = new BirthdayCake("chocolate", 22);
        weddingCake.setPrice(5000);
        double wedCakePrice = weddingCake.getPrice();
        birthdayCake.setPrice(10000);
        double birthCakePrice = birthdayCake.getPrice();

        System.out.println("We have a wedding " + weddingCake.getFlavor() + " cake with " + weddingCake.getTiers() + " tiers and its price is " + wedCakePrice);
        System.out.println("We have a birthday " + birthdayCake.getFlavor() + " cake with " + birthdayCake.getCandles() + " candles and its price is " + birthCakePrice);
    }
}
