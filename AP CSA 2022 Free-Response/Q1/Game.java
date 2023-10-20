package Q1;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    private int score;
    private boolean bonus;

    public Game() {
        System.out.println("enter inputs");
    }

    public boolean isBonus() {
        return bonus;
    }

    public void play() {

    }

    public int getScore() {
        return score;
    }

    public int playManyTimes(int num) {
        return 1;
    }
}
