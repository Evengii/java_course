package chapter_final;

public class Player {
    private String name;
    private boolean guess;

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGuess() {
        return guess;
    }

    public void setGuess(boolean guess) {
        this.guess = guess;
    }
}
