package chapter11;

public abstract class Animal {

    public void eat(){
        System.out.println("Eating");
    }

    abstract void makeSound(String sound);
}
