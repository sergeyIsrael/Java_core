package Lesson_1;

// полоса препятствий
public class Course {

   private int run_Meters = 0;


    public Course (int run_Meters) {
        this.run_Meters = run_Meters;
    }

    public void run() {
        if (run_Meters <= Player.getMaxLimit()) {
            System.out.println( Player.getName() + " Прошёл дистанцию!🤩 ");
        } else {
            System.out.println(Player.getName() + " НЕ смог пройти дистанцию. ");
        }
    }

//    ??? DO IT
    public void doIt (Team team) {
    Player[] teamPlayers = Team.getPlayers();
   }

    public int getRun_Meters() {
        return run_Meters;
    }

// СДЕЛАЙ
    public void printResult() {
        System.out.println("Пробежал " + run_Meters + " м.");
    }


}


