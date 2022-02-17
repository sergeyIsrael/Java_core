package Lesson_1;

// ИГРОК
public class Player {
    private String name;
    private boolean result;
    private int runLimit; // Сколько может пробежать
//    private int swimLimit; // Сколько может проплыть


    public Player(String name, int runLimit) {
        this.name = name;
        this.runLimit = runLimit;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public String toString() {
        return (getName() +" - может пробежать "
                + getRunLimit() +"м. \n " );
    }

    public void infoPlayer() {
        System.out.println(getName() +" может пробежать максимум "
                + getRunLimit() +"m." );
    }
}
