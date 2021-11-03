package chapter10;

public class Banana extends Fruit{
    public Banana(int calories){
        this.calories = calories;
    }

    public void peel(){
        System.out.println("Banana is peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana puree is done");
    }
}
