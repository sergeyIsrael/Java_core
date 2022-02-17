package Lesson_1;

public class Player {
    private String name;
    private int maxLimit;


    public Player(String name, int maxLimit) {
        this.name = name;
        this.maxLimit = maxLimit;
    }

    public String getName() {
        return name;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    @Override
    public String toString() {
        return name;
    }

    public void infoPlayer() {
        System.out.println(getName() +" может пробежать не более " + getMaxLimit());
    }
}
